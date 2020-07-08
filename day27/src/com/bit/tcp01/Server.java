package com.bit.tcp01;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		int port=8080;
		ServerSocket serve=null;
		OutputStream os =null;
		Socket sock =null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			serve =new ServerSocket(port);
			
			System.out.println("server : 접속 대기중..");
			sock =serve.accept();
			System.out.println("server : 접속 완료");
			is =sock.getInputStream();
			isr = new InputStreamReader(is);
			os =sock.getOutputStream();

			int su=-1;
			while ((su=isr.read())!=-1) {
				os.write(su);
				os.flush();
			}
//			
//			is.close();
//			String msg ="환영합니다";
//			os.write(msg.getBytes());
//			os.flush();
//			os.close();
//			/////////////
//			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
