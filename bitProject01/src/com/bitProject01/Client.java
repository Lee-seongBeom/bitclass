package com.bitProject01;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;


public class Client extends Frame implements ActionListener{

	Socket sock;
	TextField tf;
	TextArea ta;
	Button btnSend;
	public Client(Socket sock) {

		this.sock = sock;

		this.setLayout(new BorderLayout());

		Panel chatViewP = new Panel();
		chatViewP.add(new Label());
		ta = new TextArea();
		ta.enable(true);
		
		chatViewP.add(ta);

		add(chatViewP, BorderLayout.WEST);

		Panel memberP = new Panel();
		memberP.add(new Label("참여자 명단"));

		add(memberP);

		Panel chatInputP = new Panel();
		chatInputP.add(new Label("입력창"));
		TextField tf = new TextField(30);
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getSource() =="\n"){
					ta.append(tf.getText());
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		tf.setSize(200, 20);
		chatInputP.add(tf);
		add(chatInputP, BorderLayout.SOUTH);

		btnSend = new Button("Send");
		btnSend.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta.setText(tf.getText());
			}
		});
		chatInputP.add(btnSend);

		setSize(600, 300);
		setLocation(200, 200);
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		OutputStream os =null;
		OutputStreamWriter osw =null;
		BufferedWriter bw =null;
		
		try {
			os = sock.getOutputStream();
			osw =new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			bw.write(tf.getText());
			bw.newLine();
			bw.flush();
//			ta.setText("");
//			ta.setText("");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
	}
	
	
	public static void main(String[] args) {
		String ip ="192.168.0.188";
		int port = 8080;
		
		Socket sock=null;
		
		InputStream is =null;
		InputStreamReader isr =null;
		BufferedReader br = null;
		

		try {
			sock = new Socket(ip,port);
			
			Client me =new Client(sock);
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while(true){
				String msg = br.readLine();
				if(msg.equals("ex"))break;
				System.out.println(msg);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(is!=null)is.close();
				if(isr!=null)isr.close();
				if(br!=null)br.close();
//				if(sock!=null)sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}



















