package com.bit.udp;

import java.io.IOException;
import java.net.*;

public class UdpSender {

	public static void main(String[] args) {
		String msg ="Hello UDP";
		
		byte[] ip={(byte)192,(byte)168,0,(byte)188};
		int port =8080;
		
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		
		
		try {
			sock = new DatagramSocket();
			InetAddress addr = InetAddress.getByAddress(ip);
			
			////1차 msg
			pack = new DatagramPacket(msg.getBytes(),msg.getBytes().length,addr,port);
			sock.send(pack);
			
			////2차 msg
			pack = new DatagramPacket("한글".getBytes(),4,addr,port);
			sock.send(pack);
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}
		
		
	}

}










