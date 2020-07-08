package com.bit.tcp03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.ArrayList;

public class MultiServer extends Thread{

	Socket sock;
	static ArrayList<BufferedWriter> list = new ArrayList<BufferedWriter>();
	
	public MultiServer(Socket sock){
		this.sock = sock;
	}
	
	
	public void run() {
		InputStream is =null;
		InputStreamReader isr=null;
		BufferedReader br= null;

		OutputStream os =null;
		OutputStreamWriter osw = null;
		BufferedWriter bw =null;
		
		try {
			InetAddress addr = sock.getInetAddress();
			
			System.out.println(addr.getHostAddress()+" 접속");
			
			is =sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os =sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			list.add(bw);
			
			while(true){
				String msg = br.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;
//				bw.write(addr.getHostAddress()+" >> " +msg);
				for(int i=0;i<list.size();i++){
					BufferedWriter stu = list.get(i);
					stu.write(">>"+msg);
					stu.newLine();
					stu.flush();
				}
				
//				bw.newLine();
//				bw.flush();
			}
			
			System.out.println(addr.getHostAddress()+" ����");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {

				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(osw!=null)osw.close();
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		int port=8080;
		ServerSocket serv=null;
		
		try {
			serv = new ServerSocket(port);
			
			while(true){
				Socket sock = serv.accept();
				MultiServer thr = new MultiServer(sock);
				thr.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


//
//
//package com.bit.tcp03;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.net.*;
//import java.util.ArrayList;
//
//public class MultiServer extends Thread{
//
//	static ArrayList<OutputStream> list = new ArrayList<OutputStream>();
//	Socket sock;
//	public MultiServer(Socket sock){
//		this.sock = sock;
//	}
//	
//	
//	public void run() {
//		InputStream is =null;
//		OutputStream os =null;
//		InputStreamReader isr=null;
//		OutputStreamWriter osw = null;
//		BufferedReader br= null;
//		BufferedWriter bw =null;
//		
//		try {
//			InetAddress addr = sock.getInetAddress();
//			
//			System.out.println(addr.getHostAddress()+" ����");
//			is =sock.getInputStream();
//			isr = new InputStreamReader(is);
//			br = new BufferedReader(isr);
//			
//			os =sock.getOutputStream();
//			list.add(os);
//			
//			while(true){
//				String msg = br.readLine();
//				if(msg==null)break;
//				if(msg.isEmpty())break;
//				for(int i=0;i<list.size();i++){
//					OutputStream stu = list.get(i);
//					
//					osw = new OutputStreamWriter(stu);
//					bw = new BufferedWriter(osw);
//					
//					bw.write(addr.getHostAddress()+">>"+msg);
//					bw.newLine();
//					bw.flush();
//					
//				}
//				
////				bw.write(addr.getHostAddress()+" >> " +msg);
////				bw.newLine();
////				bw.flush();
//			}
//			
//			System.out.println(addr.getHostAddress()+" ����");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//
//				if(bw!=null)bw.close();
//				if(br!=null)br.close();
//				if(osw!=null)osw.close();
//				if(isr!=null)isr.close();
//				if(os!=null)os.close();
//				if(is!=null)is.close();
//				if(sock!=null)sock.close();
//				
//			} catch (IOException e) {
////				e.printStackTrace();
//			}
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		int port=8080;
//		ServerSocket serv=null;
//		
//		try {
//			serv = new ServerSocket(port);
//			
//			while(true){
//				Socket sock = serv.accept();
//				MultiServer thr = new MultiServer(sock);
//				thr.start();
//				
//				
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				
//				if(serv!=null)serv.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
