package com.bit.day23;

import java.awt.*;
import java.awt.event.*;

public class Ex15 extends Frame implements ActionListener{

	public Ex15(){
		Panel p = new Panel();
		
		TextField tf=new TextField(15);
		tf.addActionListener(this);
		p.add(tf);
		
		Button bt=new Button("버튼");
		bt.addActionListener(this);
		p.add(bt);
		
		
		List list=new List();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("list의 이벤트");
			}
		});
		
		bt.addActionListener(this);
		
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		
		p.add(list);
		
		add(p);
		
		setSize(500, 300);
		setLocation(300,200);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Ex15();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("asd");
	}


}
