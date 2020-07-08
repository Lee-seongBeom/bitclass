package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		String ip ="127.0.0.1";
		
		int port =8080;
		Socket sock= null;
		InputStream is =null;
		InputStreamReader isr =null;
		OutputStream os =null;
		
		try {
			sock = new Socket(ip,port);
			
			System.out.println("Client : 서버에 접속");
			
			os=sock.getOutputStream();
			is =sock.getInputStream();
			isr = new InputStreamReader(is);
			os.flush();
			int su =-1;
			os.write(System.in.read());
			while((su=isr.read())!=-1){
				os.write(System.in.read());
				System.out.print((char)su);
				System.out.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}















