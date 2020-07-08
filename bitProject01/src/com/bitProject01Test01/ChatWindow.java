package com.bitProject01Test01;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
public class ChatWindow{

	String nickname;
	Frame frame;
	Panel p;
	Button btnSend;
	TextField tf;
	TextArea ta;
	
	Socket socket;
	
	public ChatWindow(String nickname, Socket socket){
		this.nickname = nickname;
		this.socket = socket;
		frame = new Frame(nickname);
		p = new Panel();
		btnSend =new Button("Send");
		tf = new TextField();
		ta =new TextArea(30,80);
		
		new ChatClientReceiveThread(socket).start();
		
	}
	
	
	public void show(){
		
		btnSend.setBackground(Color.gray);
		btnSend.setForeground(Color.white);
		
		
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		
		tf.setColumns(80); // tf의 최대 입력개수 설정
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getSource().equals("\n")){
					sendMessage();
				}
			}
		});
		
		// Panel
		p.setBackground(Color.LIGHT_GRAY);
		p.add(tf);
		p.add(btnSend);
		
		frame.add(p,BorderLayout.SOUTH);
		
		// TextArea
		ta.setEditable(false);
		frame.add(ta,BorderLayout.CENTER);
		
		// Frame
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				OutputStream os= null;
				OutputStreamWriter osw =null;
				PrintWriter pw=null;
				
				try {
					os =socket.getOutputStream();
					osw =new OutputStreamWriter(os);
					pw =new PrintWriter(osw);
					
					String request = "quit \r\n";
					pw.println(request);
					System.exit(0);
					
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		frame.setVisible(true);
		frame.pack();
	}
	
	private void sendMessage(){
		OutputStream os =null;
		OutputStreamWriter osw =null;
		PrintWriter pw =null;
		
		try {
			os = socket.getOutputStream();
			osw =new OutputStreamWriter(os);
			pw =new PrintWriter(osw);
			
			String msg = tf.getText();
			String request = "msg : "+msg+"\r\n";
			pw.println(request);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class ChatClientReceiveThread extends Thread{
		Socket socket =null;
		
		ChatClientReceiveThread(Socket socket){
			this.socket = socket;
		}
		
		public void run(){
			InputStream is =null;
			InputStreamReader isr =null;
			BufferedReader br =null;
			
			try {
				is = socket.getInputStream();
				isr =new InputStreamReader(is);
				br =new BufferedReader(isr);
				
				while(true){
					String msg =br.readLine();
					ta.append(msg+"\n");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
