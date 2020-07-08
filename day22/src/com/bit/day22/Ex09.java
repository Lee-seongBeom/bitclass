package com.bit.day22;

import java.awt.*;



public class Ex09 extends Frame{
	
	Ex09(){
		Panel p=new Panel();
		Panel p2=new Panel();
		
		p.setLayout(new GridLayout(1,2));
		Color color =new Color(0,100,0);
//		p.setBackground(color);
		
		
		Button bt1=new Button();
		bt1.setLabel("ÇÑ±Û");
		
		Font font = new Font("",3, 30);	
		bt1.setFont(font);
		
		Label la1 = new Label();
		la1.setText("set");
		la1.setFont(font);
		System.out.println(la1.getText());
		
		p.add(bt1);
		p2.add(la1);
		p.add(p2);
		add(p);
		
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}

}
