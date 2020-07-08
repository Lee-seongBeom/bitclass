package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		String path = "data.bin";
		String msg ="문자열 스트림을 통해\n파일에 작성합니다";
		File file = new File(path);
		
		char[] arr =msg.toCharArray();
		
		FileReader fr = null;
		FileWriter fw =null;
		
		try {	
			fw = new FileWriter(file);
			fw.write(msg);
//			for(int i=0;i<arr.length;i++){        ==> fw.write(msg);
//				fw.write(arr[i]);
//			}
			fw.flush();
			fr = new FileReader(file);
			
			while(true){
				int su= fr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null){
					fr.close();
				}
				if(fw!=null){
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
