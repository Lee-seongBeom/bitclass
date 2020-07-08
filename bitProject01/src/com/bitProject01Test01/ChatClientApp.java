package com.bitProject01Test01;

import java.io.*;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {

	static private String SERVER_IP = "192.168.0.188";
	static private int Port =8080;
	
	public static void main(String[] args) {
		String nickname =null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("닉네임을 입력하세요 >>");
			nickname = sc.nextLine();
			
			if(nickname.isEmpty() == false){
				break;
			}
			System.out.println(" 닉네임은 한글자 이상 입력해야합니다 \n\n");
		}
		
		sc.close();
		
		Socket socket = null;
		InetSocketAddress isa =null;
		
		OutputStream os =null;
		OutputStreamWriter osw =null;
		PrintWriter pw =null;
		
		
		try {
			socket = new Socket();
			isa = new InetSocketAddress(SERVER_IP,Port);
			socket.connect(isa);
			System.out.println("채팅방에 입장했습니다.");
			
			new ChatWindow(nickname, socket).show();
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw,true);
			
			String request = "join:"+nickname+"\r\n";
			pw.println(request);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
