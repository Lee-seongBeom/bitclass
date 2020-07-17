package com.bit.day25;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) {
		// DataStream
		String path = "data2.bin";

		File file = new File(path);
		try {
			if (!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos=null;
		BufferedOutputStream bos =null;
		DataOutputStream dos =null;
		
		try {
			fos=new FileOutputStream(file);
			bos =new BufferedOutputStream(fos);
			dos =new DataOutputStream(bos);
			
			dos.write(97);
			dos.writeByte(127);
			dos.writeShort(128);
			dos.writeInt(65);
			dos.writeLong(97L);
			dos.writeFloat(3.14F);
			dos.writeDouble(3.14);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.writeUTF("���ڿ�");
			
			System.out.println("�ۼ��Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dos!=null){dos.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}