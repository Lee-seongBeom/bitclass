package com.bitProject01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class MultiServer extends Thread{

	MultiClient mulClient;
	Socket sock;
	static ArrayList<BufferedWriter> list = new ArrayList<BufferedWriter>();
	InetAddress addr;
	String nickname;
	private static List<String> memList =new ArrayList<>();
	
	public MultiServer(Socket sock){
		this.sock = sock;
	}
	
	class memList{
		
		public void memlist(ArrayList arraylist){
			arraylist.add(nickname);
			MultiServer.memList = arraylist;
		}
	}
	
	public void run() {
		InputStream is =null;
		InputStreamReader isr=null;
		BufferedReader br= null;
		
		OutputStream os =null;
		OutputStreamWriter osw = null;
		BufferedWriter bw =null;
		
		try {
			is =sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			
			
			os =sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			list.add(bw);
			
			
			while(true){
//				if(msg==null || msg.isEmpty())break;
				
				String msg = br.readLine();
				String[] temp = msg.split(">>");
				
				if (temp[0].equals("join")) {

					nickname = temp[1];
					memList.add(nickname);

					for (int i = 0; i < list.size(); i++) {
						BufferedWriter stu = list.get(i);
						stu.write(nickname + "님 입장");
						stu.newLine();
						stu.flush();
					}

					String mem = memList.toString();

					for (int i = 0; i < list.size(); i++) {
						BufferedWriter stu =list.get(i);
						
						stu.write(mem);
						stu.newLine();
						stu.flush();
						
//						System.out.println(memList.get(i));
					}
					
				} else if (temp[0].equals("msg")) {
					for (int i = 0; i < list.size(); i++) {
						
						BufferedWriter stu = list.get(i);
						
						stu.write(nickname+">>"+temp[1]);
						stu.newLine();
						stu.flush();
					}
					
					
				}else if(temp[0].equals("quit")){
					for(int i=0;i<list.size();i++){
						BufferedWriter stu = list.get(i);
						stu.write(nickname+"님이 퇴장했습니다.");
						stu.newLine();
						stu.flush();
					}
					
					memList.remove(nickname);
					String mem = memList.toString();
					for(int i=0;i<list.size();i++){
						BufferedWriter stu = list.get(i);
						stu.write(mem);
						stu.newLine();
						stu.flush();
						
					}
				}
			}
			
		}catch(NullPointerException e){
			
		}
		catch (IOException e) {
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



