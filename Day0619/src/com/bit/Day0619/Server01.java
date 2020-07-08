
package com.bit.Day0619;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {

	public static void main(String[] args) {

		int port =80;
		ServerSocket serv =null;
		Socket sock =null;
		OutputStream os =null;
		PrintStream ps =null;
		
		try {
			serv =new ServerSocket(port);
			sock =serv.accept();
			os =sock.getOutputStream();
			ps =new PrintStream(os);
			
//			ps.println("HTTP/1.1 404 Not Found \r\n");
			ps.println("HTTP/1.1 200 OK \r\n");
			for(int i=0;i<5;i++){
				ps.println("<h1>print"+i+"..........</h1>");
			}
			ps.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)ps.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
