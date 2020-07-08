package com.bit.day22;

import java.awt.*;

public class Ex11 extends Frame{
	
	static TextField tf1;
	
	public Ex11(){
		Font f=new Font(Font.MONOSPACED, 1, 22);
		Panel p = new Panel();
		
		Color color =new Color(0,100,0);
		p.setBackground(color);
		tf1 =new TextField(5);
		tf1.setText("");
		tf1.setEchoChar('*');
		p.add(tf1);
		
		
		Button btn = new Button("¹öÆ°");
		btn.setFont(f);
		
		p.add(btn);
		

		add(p);
		//1920*1080
		setLocation(1920/2-500/2, 1080/2-300/2);
		setSize(500, 300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Ex11();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tf1.getText());
	}

}
