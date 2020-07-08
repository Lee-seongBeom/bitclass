package com.bitProject01Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class myServer extends Thread{

   static ArrayList<OutputStream> list = new ArrayList<>();
   Socket sock;
   static ArrayList<String> members=new ArrayList<>();//참여자 명단
   
   private static ArrayList<Object> ipList =new ArrayList<>();
   
   private static ArrayList<Object> ipBlockList =new ArrayList<>();

   int cnt =0;
   
   public myServer(Socket sock) {
      this.sock=sock;
   }
   
   
   public void run() {
      InputStream is=null;
      OutputStream os=null;
      InputStreamReader isr=null;
      OutputStreamWriter osw=null;
      BufferedReader br=null;
      BufferedWriter bw=null;
      String nickname=null;
      String mem;
      
      try {
    	 InetAddress addr=sock.getInetAddress();
                  
         System.out.println(addr.getHostAddress()+"접속");
         
         is=sock.getInputStream();
         isr=new InputStreamReader(is);
         br=new BufferedReader(isr);
         
         os=sock.getOutputStream();
         list.add(os);
         while(true){
            mem=members.toString();
//            System.out.println("접속후"+mem);
            for(int i=0; i<list.size();i++){
               OutputStream stu=list.get(i);
               osw=new OutputStreamWriter(stu);
               bw=new BufferedWriter(osw);
               bw.write(mem);
               bw.newLine();
               bw.flush();
            }
            String msg=br.readLine();
            String[] temp=msg.split(":");
            if("join".equals(temp[0])){
               nickname=temp[1];
               for(int i=0; i<list.size();i++){
                  OutputStream stu=list.get(i);
                  osw=new OutputStreamWriter(stu);
                  bw=new BufferedWriter(osw);
                  bw.write(nickname+"님이 입장하셨습니다.");
                  bw.newLine();
                  bw.flush();
               }
               members.add(nickname);
               mem=members.toString();
               
       
               ipList.add(addr.getHostAddress());
               System.out.println("입장 중 iplist >>>>"+ipList.toString());
               
               for(int i=0; i<list.size();i++){
                  OutputStream stu=list.get(i);
                  osw=new OutputStreamWriter(stu);
                  bw=new BufferedWriter(osw);
                  bw.write(mem);
                  bw.newLine();
                  bw.flush();
               }
            }else if("message".equals(temp[0])){
               for(int i=0; i<list.size();i++){
                  OutputStream stu=list.get(i);
                  osw=new OutputStreamWriter(stu);
                  bw=new BufferedWriter(osw);
                  bw.write(nickname+":"+temp[1]);
                  bw.newLine();
                  bw.flush();
               }
            }else if("quit".equals(temp[0])){
               for(int i=0; i<list.size();i++){
                  OutputStream stu=list.get(i);
                  osw=new OutputStreamWriter(stu);
                  bw=new BufferedWriter(osw);
                  bw.write(nickname+"님이 퇴장하셨습니다.");
                  bw.newLine();
                  bw.flush();
               }
               
//               System.out.println(members.indexOf(nickname));
               ipList.remove(members.indexOf(nickname));
               members.remove(nickname);
               System.out.println("퇴장후 iplist >>>>"+ipList.toString());
               
               mem=members.toString();

               for(int i=0; i<list.size();i++){
                  OutputStream stu=list.get(i);
                  osw=new OutputStreamWriter(stu);
                  bw=new BufferedWriter(osw);
                  bw.write(mem);
                  bw.newLine();
                  bw.flush();
               }
            }else if("outCnt".equals(temp[0])){
            	/*
            	 
            	int  n =선택한 list.get(number) 인덱스번호
            	 ipblock.add(iplist[n]);
            	 
            	 */
					int n = Integer.parseInt(temp[1]);

					OutputStream stu = list.get(n);
					osw = new OutputStreamWriter(stu);
					bw = new BufferedWriter(osw);

					bw.write("outCntPlus");
					bw.newLine();
					bw.flush();
            		
            	
            }else if("ipBlock".equals(temp[0])){

					System.out.println("블락 인덱스" + temp[1]);
					int abc = Integer.parseInt(temp[1]);

					ipBlockList.add(ipList.get(abc));
					System.out.println("Server IPBLOCKLIST >>>>"
							+ ipBlockList.toString());
					OutputStream stu = list.get(abc);
					osw = new OutputStreamWriter(stu);
					bw = new BufferedWriter(osw);

					bw.write("ipBlock");
					bw.newLine();
					bw.flush();
						
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
            	
            }
         }
      } catch (IOException e) {

      } finally {
         try {
            if(br!=null)br.close();
            if(bw!=null)bw.close();
            if(isr!=null)isr.close();
            if(osw!=null)osw.close();
            if(os!=null)os.close();
            if(is!=null)is.close();
            if(sock!=null)sock.close();
         } catch (IOException e) {
//            e.printStackTrace();//에러메시지 없애려고
         }
      } 
   }   

   public static void main(String[] args) {

      int port=8686;
      ServerSocket serv=null;
      
      try {
         serv=new ServerSocket(port);
         while(true){
            Socket sock=serv.accept();
            InetAddress addr=sock.getInetAddress();
            
          
            
            System.out.println(addr.getHostAddress()+"접속");
            myServer thr=new myServer(sock);
            thr.start();
         }
      } catch (IOException e) {
//         e.printStackTrace();//에러메시지 없애려고
      } finally {
         try {
            if(serv!=null)serv.close();
         } catch (IOException e) {
//            e.printStackTrace();//에러메시지 없애려고
         }
      } 
   }
}