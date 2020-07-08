package com.bit.day23;

import java.awt.*;

public class Ex09 extends Frame{

	public Ex09(){
//		setResizable(false);
		Panel p = new Panel();
		p.setLayout(null);
		
		Button bt1=new Button("bt1");
		bt1.setSize(200, 200);
		bt1.setLocation(0,0);
		
		TextField tf = new TextField();
		tf.setLocation(200, 0);
		tf.setSize(100, 50);
		
		p.add(tf);
		p.add(bt1);
		add(p);
		
		setSize(500, 500);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
