package com.bit.day23;

import java.awt.*;
import java.io.*;

import javax.swing.*;

public class Ex01 extends Frame {

	public Ex01(){
		Toolkit tool = Toolkit.getDefaultToolkit();
//		tool.beep();
		Dimension dim= tool.getScreenSize();
//		System.out.println(dim.width);
//		System.out.println(dim.height);
		byte[] data=null;
		File file = new File(".\\L.png");
		
		FileInputStream fis=null;
		if(file.exists()){
			try {
				data=new byte[(int) file.length()];
				fis=new FileInputStream(file);
				for(int i=0;i<file.length();i++){
					data[i] = (byte) fis.read();
					
				}
				
				
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
		
		Image img = tool.createImage(data);
		Icon icon=new ImageIcon(img);
		JButton bt01=new JButton(icon);
		
		add(bt01);
		
		
		
		
		setSize(500,300);
		setLocation(dim.width/2-getWidth()/2,dim.height/2-getHeight()/2);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}






















