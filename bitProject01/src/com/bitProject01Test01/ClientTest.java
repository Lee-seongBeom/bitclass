package com.bitProject01Test01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;

public class ClientTest extends Frame {

	TextArea chatView;// 여러명이 입력한 값을 여기 보여줘야 함.
	TextArea chatInput;// 입력한 값을 받아와야 함.
	TextArea memberList;// 입장하는 사람들의 이름을 여기 띄우기
	String title = "수다방 v 0.1.0";
	Button bSend;
	Button bExit;
	Socket sock;

	public ClientTest(Socket sock) {
		// Socket 통신
		this.sock = sock;

		BorderLayout layout = new BorderLayout(5, 5);
		BorderLayout layoutS = new BorderLayout(5, 5);
		GridLayout layoutSE = new GridLayout(2, 1);
		setLayout(layout);

		// Center 채팅보기
		chatView = new TextArea("", 40, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);// 여러명이
																				// 입력한
																				// 값을
																				// 여기
																				// 보여줘야
																				// 함.
		chatView.setEditable(false);
		Panel center = new Panel();
		center.add(chatView);
		add(BorderLayout.CENTER, center);

		// East 멤버보기
		memberList = new TextArea("", 40, 10, TextArea.SCROLLBARS_NONE);// 입장하는
																		// 사람들의
																		// 이름을
																		// 여기
																		// 띄우기
		memberList.setEditable(false);
		Panel east = new Panel();
		east.add(memberList);
		add(BorderLayout.EAST, east);

		// South 입력창
		chatInput = new TextArea("", 5, 40, TextArea.SCROLLBARS_NONE);// 입력한 값을
																		// 받아와야
																		// 함.
		chatInput.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		Panel south = new Panel();
		south.setLayout(layoutS);
		south.add(BorderLayout.CENTER, chatInput);

		// 전송, 종료 버튼
		bSend = new Button("보내기");
		bSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

		bExit = new Button("수다종료");
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitChat();
			}
		});

		Panel southEast = new Panel();
		southEast.setLayout(layoutSE);
		southEast.add(bSend);
		southEast.add(bExit);
		south.add(BorderLayout.EAST, southEast);
		add(BorderLayout.SOUTH, south);

		// Frame
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				quitChat();
			}
		});
		setTitle(title);
		setSize(500, 700);
		setLocation(10, 100);
		setVisible(true);

		// 대화명입력창
		Dialog dialog = new Dialog(this, "대화명을 입력하세요.");
		dialog.setSize(200, 80);
		dialog.setLocation(getLocationOnScreen());
		dialog.setVisible(true);

		TextField tf = new TextField(20);
		dialog.add(tf);
		tf.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!(tf.getText().isEmpty())) {
						OutputStream os = null;
						OutputStreamWriter osw = null;
						BufferedWriter bw = null;
						try {
							os = sock.getOutputStream();
							osw = new OutputStreamWriter(os);
							bw = new BufferedWriter(osw);
							bw.write("join:" + tf.getText());
							bw.newLine();
							bw.flush();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					dialog.dispose();
				}
			}
		});
	}// 생성자 종료

	private void sendMessage() {
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write("message:" + chatInput.getText());
			bw.newLine();
			bw.flush();
			chatInput.replaceRange("", 0, chatInput.getText().length());
			chatInput.requestFocus();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void quitChat() {
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write("quit:\r\n");
			dispose();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String ip = "192.168.0.193";// 내ip
		// String ip="192.168.0.188";//성범씨ip
		// String ip="192.168.0.169";//선생님 ip
		// String ip="192.168.0.192";//병무씨ip//server 기능 불가
		int port = 8080;
		Socket sock = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		// Server에서 sock으로 전달받은 내용 읽어들이기
		try {
			sock = new Socket(ip, port);
			ClientTest client = new ClientTest(sock);
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while (true) {
				String view = br.readLine();
				System.out.println(view);// 여기보여주면 안되고 TA에 찍어야 함.
				client.chatView.append(view + "\n");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (is != null)
					is.close();
				if (sock != null)
					sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// main end
}// Client class end