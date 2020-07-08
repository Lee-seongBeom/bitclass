package com.bitProject01;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ArrayList;


public class MultiClient extends Frame implements ActionListener{

	TextField tf;
	static TextArea ta;
	static TextArea memberTa;
	Socket sock;
	static String a;
	static MultiClient client ;
	static ArrayList<String> clientList =new ArrayList<String>();
//	
//	class Updater {
//	    public void update(Counter counter) {
//	        counter.count++;
//	    }
//	}
//
//	public class Counter {
//	    int count = 0;
//	    public static void main(String[] args) {
//	        Counter myCounter = new Counter();
//	        System.out.println("before update:"+myCounter.count);
//	        Updater myUpdater = new Updater();
//	        myUpdater.update(myCounter);
//	        System.out.println("after update:"+myCounter.count);
//	    }
//	}
	
	public MultiClient(Socket sock){
		
		System.out.println("clientList: "+clientList);
		System.out.println("a: "+a);

		
		
		this.sock =sock;
		Panel chatViewP =new Panel();
		
		Label la1 = new Label("memberList");
		Panel memberP =new Panel();
		memberP.add(la1);
		Panel chatInputP =new Panel();
		
		Button btnSend = new Button("Send");
		Button btnExit = new Button("Exit");
		
		
		
		ta = new TextArea("",15,40);
		ta.setEditable(false);
		
		memberTa = new TextArea("",8,10);
		memberTa.setEditable(false);
		
		tf = new TextField(25);
		tf.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				sendMsg();
				
			};
			
		});
		
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				quit();
			}
		});
		
		
		chatViewP.add(ta);
		chatInputP.add(tf);
		chatInputP.add(btnSend,"East");
		chatInputP.add(btnExit,"East");
		
		memberP.add(memberTa);
		
		GridBagLayout gbc= new GridBagLayout();
		setLayout(gbc);

		GridBagConstraints c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx = 1.0;
		c.weighty = 2.0;
		gbc.setConstraints(chatViewP, c);
		
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=3;
		c.weightx = 1.0;
		c.weighty = 1.0;
		gbc.setConstraints(memberP, c);
		
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=3;
		c.weightx = 1.0;
		c.weighty = 1.0;
		gbc.setConstraints(chatInputP, c);
		
		ta.setBackground(Color.LIGHT_GRAY);
		add(chatViewP);
		add(memberP);
		add(chatInputP);

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				quit();
			}
		});
		
		setSize(500,400);
		setLocation(300,200);
		setVisible(true);
		
		
		
//		System.out.println(memList.toString());
//		memberP.setBackground(Color.DARK_GRAY);
	}
	
	
	
	///////// Dialog
	public void makeNickname(){
		Dialog dialog =new Dialog(this,"닉네임을 입력하세요");
		
		dialog.setLocation(300,300);
		dialog.setSize(this.getWidth(),this.getHeight());
		dialog.setVisible(true);
		
		TextField tf1 = new TextField(25);
		MultiServer ms =new MultiServer(sock);
		
		tf1.addKeyListener(new KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					if(!(tf1.getText().isEmpty())){
						tf1.requestFocus();
						OutputStream os =null;
						OutputStreamWriter osw =null;
						BufferedWriter bw =null;
						
						try {
							os=sock.getOutputStream();
							osw =new OutputStreamWriter(os);
							bw =new BufferedWriter(osw);
							
							bw.write("join>>"+tf1.getText());
							bw.newLine();
							bw.flush();
							
						} catch (IOException e1) {
							e1.printStackTrace();
						}// try-catch end
						
					} //if end
					dialog.dispose();
					tf.requestFocus();
				}
				
			}
		});

		dialog.add(tf1);
		dialog.pack();
	}
	
	
	
	
	
	private void sendMsg(){
		OutputStream os =null;
		OutputStreamWriter osw = null;
		BufferedWriter bw =null;
		try {
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			bw.write("msg>>"+tf.getText());
			
			bw.newLine();
			bw.flush();
			
			tf.setText("");
			tf.setText("");
			tf.requestFocus();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void quit(){
		OutputStream os =null;
		OutputStreamWriter osw =null;
		BufferedWriter bw =null;
		
		try {
			os=sock.getOutputStream();
			osw =new OutputStreamWriter(os);
			bw =new BufferedWriter(osw);
			
			bw.write("quit>> ");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dispose();
	}

	
	public void sameNickname(){// 중복검사 dialog
		System.out.println("samenickname");
//		System.out.println(MultiServer.thrNum);

//		MultiServer.memList.remove(MultiServer.thrNum);
//		Dialog dialog =new Dialog(this,"중복닉네임입니다. 다시 입력하세요");
//		dialog.setLocation(300,300);
//		dialog.setSize(this.getWidth(),this.getHeight());
//		dialog.setVisible(true);
//		TextField tf1 = new TextField(25);
//		
//		
//		tf1.addKeyListener(new KeyAdapter() {
//			public void keyReleased(java.awt.event.KeyEvent e) {
//				if(e.getKeyCode()==KeyEvent.VK_ENTER){
//					if(!(tf1.getText().isEmpty())){
//						tf1.requestFocus();
//						OutputStream os =null;
//						OutputStreamWriter osw =null;
//						BufferedWriter bw =null;
//						
//						try {
//							os=sock.getOutputStream();
//							osw =new OutputStreamWriter(os);
//							bw =new BufferedWriter(osw);
//							
//							bw.write("rejoin>>"+tf1.getText());
//							bw.newLine();
//							bw.flush();
//							
//						} catch (IOException e1) {
//							e1.printStackTrace();
//						}// try-catch end
//						
//					} //if end
//					dialog.dispose();
//					tf.requestFocus();
//				}
//				
//			}
//		});
//
//		dialog.add(tf1);
//		dialog.pack();
		
	}
	public static void main(String[] args) {
		
		String ip = "192.168.0.188";

		int port = 8080; 
		
		Socket sock = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			sock = new Socket(ip, port);

			client.makeNickname();
			new MultiClient(sock);
			
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			
			while (true) {
				
				client.tf.requestFocus();
				
				while(true){
					String msg = br.readLine();
					
					if(msg==null)break;
					
					
					if(msg.equals("sameNickname")){
						client.sameNickname();
					}else if(msg.charAt(0)=='['){
						String msg1 = msg.substring(1, msg.length()-1);
						memberTa.setText("");
						
						String[] temp = msg1.split(", ");
							
						for(int i=0;i<temp.length;i++){
							
							memberTa.append(temp[i]+"\n");
							clientList.add(temp[i]);
							System.out.println("cl List"+clientList);
						}// for( int i ) end
						
					}else{
						client.ta.append(msg+"\n");
					}
				}
			}
			
		}catch(NullPointerException e){
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} finally{
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
