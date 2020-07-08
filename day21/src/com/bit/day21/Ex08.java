package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		//ByteStream - output
		File file = new File("ex08.bin");
		try {
			FileOutputStream fos = new FileOutputStream(file);
//			fos.write('a');
//			fos.write('b');
//			fos.write('c');
//			fos.write('d');
//			
			
			String msg ="hello";
			byte[] by = msg.getBytes();
			for(int i=0;i<by.length;i++){
				fos.write(by[i]);
			}
			fos.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
