package com.bit.day23;

import java.awt.*;

public class Ex02 extends Frame{

	public Ex02(){
		
		Menu mn1 = new Menu();
		mn1.setLabel("File");
		
		MenuItem mn1_1=new MenuItem("New");
		MenuItem mn1_2=new MenuItem("Save");
		
		MenuItem mn1_3=new MenuItem("Exit");
		
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.addSeparator();
		mn1.add(mn1_3);
		
		Menu mn2 = new Menu("Help");
		
		MenuItem mn2_1=new CheckboxMenuItem("i1");
		MenuItem mn2_2=new CheckboxMenuItem("i2",true);
		MenuItem mn2_3=new CheckboxMenuItem("i3");
		
		Menu mn2_4=new Menu("상위");
		MenuItem mn2_4_1=new Menu("하위1");
		MenuItem mn2_4_2=new Menu("하위2");
		
		
		mn2.add(mn2_1);
		mn2.add(mn2_2);
		mn2.add(mn2_3);
		mn2.addSeparator();
		mn2.add(mn2_4);
		mn2_4.add(mn2_4_1);
		mn2_4.add(mn2_4_2);
		
		
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		
		setMenuBar(mb);
		Button bt=new Button("test");
		add(bt);
		
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}

}
