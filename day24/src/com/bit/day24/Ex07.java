package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		
		String path = "data.bin";
		String path2 = "data2.bin";
		File file = new File(path);
		File file2 = new File(path2);
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		String msg = "456464646bnkh";
//		byte[] arr =msg.getBytes();
		
		byte[] buf = new byte[10];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			while(true){
				int su=fis.read(buf);
				if(su==-1){break;}
				fos.write(buf,0,su);
			}
			
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
