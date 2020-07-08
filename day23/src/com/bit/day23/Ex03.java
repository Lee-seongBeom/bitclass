package com.bit.day23;

import java.awt.*;

public class Ex03 extends Frame {

	public Ex03(){
		
		
		
		setSize(800, 600);
		setLocation(200,200);
		setVisible(true);
		
//		Dialog dia = new Dialog(this,"새창");
//		dia.add(new Button("b1"));
		FileDialog dia = new FileDialog(this,"새창",1);
		
		dia.setSize(200, 100);
		dia.setLocation(200+800/2-200/2,200+600/2-100/2);
		dia.setVisible(true);
		
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
		
	}
	public static void main(String[] args) {
		new Ex03();
	}

}
