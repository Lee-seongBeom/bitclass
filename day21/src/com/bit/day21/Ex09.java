package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		// ByteStream - input
		File file = new File("ex08.bin");
		try {
			java.io.FileInputStream fis = new FileInputStream(file);
			
//			int su =fis.read();
//			System.out.println(su);
//			su =fis.read();
//			System.out.println(su);
//			su =fis.read();
//			System.out.println(su);
//			su =fis.read();
//			System.out.println(su);
			
			while(true){
				int su = fis.read();
				if(su==-1){
					break;
				}
				System.out.print((char)su+" ");
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
