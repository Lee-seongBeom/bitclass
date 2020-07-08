package com.bit.day26;

import java.io.*;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		InputStream is =null;
		try {
			File file = new File("test01.txt");
//			is =new FileInputStream(file);
			
			Scanner sc = new Scanner("출력\n출력2");
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		}finally{
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
