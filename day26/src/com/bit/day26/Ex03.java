package com.bit.day26;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		String msg = "문자열 메시지를 작성합니다\n12345\nABCDEFG";
		// jdk 1.8부터 등장 : try괄호 안에 있는것을 자동으로 close() 해줌 -> try with문
		
		try(OutputStream os = new FileOutputStream("test01.txt")){
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("작성완료,,");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
