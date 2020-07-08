package com.bit.day22;

import java.awt.*;

public class Ex15 extends Frame{
	
	public Ex15(){
		Panel p =new Panel();
		
		java.awt.List Alist = new List(3,true);
		Alist.addItem("item1");
		Alist.addItem("item2");
		Alist.addItem("item3");
		Alist.addItem("item4");
		Alist.addItem("item5");
		Alist.select(2);
//		Alist.add("item1");
//		Alist.add("item2");
//		Alist.add("item3");
//		Alist.add("item4");
//		Alist.add("item5");
//		
		
		p.add(Alist);
		
		add(p);
		
		
		
		setSize(500, 300);
		Dimension dim=getSize();
		int w =dim.width;
		int h =dim.height;
		setLocation(1920/2-w/2,1080/2-h/2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex15();
	}

}
