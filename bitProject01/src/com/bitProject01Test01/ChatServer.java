package com.bitProject01Test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

public class ChatServer {

	public static int Port = 8080;
	

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		List<PrintWriter> listWriters =new ArrayList<>();
		
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket();
			
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
//			System.out.println(hostAddress); // 192.168.0.188
			serverSocket.bind(new InetSocketAddress(hostAddress,Port));
//			console.Log("연결 기다림 - "+hostAddress+":"+Port);
			System.out.println("연결 기다림 - IP: "+hostAddress+" >> Port: "+Port);			
			
			while(true){
				Socket socket = serverSocket.accept();
				new ChatServerProcessThread(socket, listWriters).start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(serverSocket!=null)serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
