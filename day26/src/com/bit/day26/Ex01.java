package com.bit.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {

	public static void main(String[] args) {
		// ��ü�� ���������ؼ� ObjectStream -need ��ü ����ȭ(Serializable)�� �䱸��
		// ��ü����ȭ�� ����� ����ʵ�
		
		String path ="data1.bin";
		File file = new File(path);
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos=null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new FileOutputStream(file);
			oos =new ObjectOutputStream(fos);
			
			Student stu = new Student(1,"ȫ�浿",40,50,60);
			stu.show();
			oos.writeObject(stu);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}










