package com.bitProject01Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatServerProcessThread extends Thread{

	String nickname = null;
	Socket socket =null;
	List<PrintWriter> listWriters =null;
	
	public ChatServerProcessThread(Socket socket, List<PrintWriter> listWriters){
		this.socket = socket;
		this.listWriters = listWriters;
	}
	
	public void run(){
		InputStream is =null;
		InputStreamReader isr =null;
		BufferedReader br= null;
		
		OutputStream os =null;
		OutputStreamWriter osw =null;
		PrintWriter pw = null;
		
		try {
			is =socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			while(true){
				String request = br.readLine();
				if(request ==null){
					System.out.println("클라이언트로부터 연결 끊김");
					doQuit(pw);
					break;
				}
				
				String[] tokens = request.split(":");
				
				if("join".equals(tokens[0])){
					doJoin(tokens[1], pw);
					
				}else if("msg".equals(tokens[0])){
					doMessage(tokens[1]);
					
				}else if("quit".equals(tokens[0])){
					doQuit(pw);
				}
			}
			
		} catch (IOException e) {
			System.out.println(this.nickname + "님이 채팅방을 나갔습니다.");
		}
	}

	private void doMessage(String data) {
		broadcast(this.nickname + ":"+data);
	}

	private void doJoin(String nickname, PrintWriter pw) {
		this.nickname = nickname;
		
		String data = nickname+" 님이 입장하였습니다.";
		broadcast(data);
		
		//pw pool에 저장
		synchronized (listWriters) {
			listWriters.add(pw);
		}
	}

	private void doQuit(PrintWriter pw) {
		removeWriter(pw);
		
		String data =this.nickname+" 님이 퇴장했습니다.";
		broadcast(data);
	}
	
	private void removeWriter(PrintWriter pw){
		synchronized (listWriters) {  ////////////////////////////////////////////////////
			listWriters.remove(pw);
		}
	}

	private void broadcast(String data) {
//		for(int i=0;i<listWriters.size();i++){
		for (PrintWriter pw:listWriters) {
			
			pw.print(data);
			pw.flush();
		}
		
	}
	
}
