package com.bit.day26;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		String msg = "���ڿ� �޽����� �ۼ��մϴ�\n12345\nABCDEFG";
		// jdk 1.8���� ���� : try��ȣ �ȿ� �ִ°��� �ڵ����� close() ���� -> try with��
		
		try(OutputStream os = new FileOutputStream("test01.txt")){
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("�ۼ��Ϸ�,,");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
