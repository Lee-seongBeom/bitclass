package com.bit.day22;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Ex17 extends Frame {

	TextArea ta;
	
	public Ex17(){
		ta = new TextArea();
		add(ta);
		
		setLocation(200,200);
		setSize(200,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		ArrayList<Character> list =new ArrayList<>();
		Ex17 me=new Ex17();
		File file= new File("test.txt");
		FileInputStream fis=null;
		
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				
				while(true){
					int su =fis.read();
					if(su==-1){break;}
					list.add((char) su);
				}
				
				Object[] arr1= list.toArray();
				char[] arr2=new char[arr1.length];
				for(int i=0;i<arr1.length;i++){
					arr2[i]=(char) arr1[i];
				}
				me.ta.setText(new String(arr2));
				
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
		}
	}

}
