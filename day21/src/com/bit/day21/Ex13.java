package com.bit.day21;

import java.awt.*;


public class Ex13 {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p  =new Panel();
//		FlowLayout layout= new FlowLayout();
		
		//GridLayout은 (행,열) - 우선순위는 행
		GridLayout layout=new GridLayout(2,4);
		p.setLayout(layout);
		
		Button btn01 = new Button();
		btn01.setLabel("버튼1");
		Button btn02 = new Button();
		btn02.setLabel("버튼2");
		Button btn03 = new Button();
		btn03.setLabel("버튼3");
		Button btn04 = new Button();
		btn04.setLabel("버튼4");
		Button btn05= new Button();
		btn05.setLabel("버튼5");
		
		p.add(btn01);
		p.add(btn02);
		p.add(btn03);
		p.add(btn04);
		p.add(btn05);
		
		f.add(p);
		f.setLocation(750, 300);
		
		f.setSize(500,300);
		
		f.setVisible(true);
		
	}
}
