package com.bit.udp;

import java.io.IOException;
import java.net.*;

public class UdpReceiver {

	public static void main(String[] args) {
		int port = 8080;
		
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		byte[] buf = new byte[5];
		try {
			sock = new DatagramSocket(port);
			pack = new DatagramPacket(buf,5);
			
			//1��
			System.out.println("1�� :receive �����...");
			sock.receive(pack);
			System.out.println("1�� :receive ����...");
			byte[] data = pack.getData();
			System.out.println(new String(data));
			
			//2��
			pack = new DatagramPacket(buf,4);
			System.out.println("2�� :receive �����...");
			sock.receive(pack);
			System.out.println("2�� :receive ����...");
			
			byte[] data1 = pack.getData();
			System.out.println(new String(data1));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(sock!=null)sock.close();
		}
	}

}














