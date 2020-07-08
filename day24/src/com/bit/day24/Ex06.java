package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		String path = "data.bin";
		File file = new File(path);
		FileInputStream fis=null;
		byte[] buf =new byte[10];
//		byte[] by = new byte[(int)file.length()];
//		List<Byte> list = new ArrayList<Byte>();
		if(file.exists()){
			try {
				fis= new FileInputStream(file);
				while(true){
					int su=fis.read(buf);
					if(su==-1){break;}
					System.out.println(new String(buf));
//					list.add((byte)su);
				}
//				for(int i=0;i<file.length();i++){
//					int su=fis.read();
//					if(su==-1){break;}
//					by[i]=(byte)su;
//					
//				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(fis!=null){
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
//			Object[] obj = list.toArray();
//			byte[] by = new byte[list.size()];
//			for(int i=0; i<list.size();i++){
//				by[i] = list.get(i);
//			}
//			System.out.println(new String(by));
		}
	}

}
