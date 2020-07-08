package com.bit.day23;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex13 extends Frame implements ItemListener{

	Choice cho;
	List list;
	Checkbox ch1;
	Checkbox ch2;
	Checkbox ch3;
	
	public Ex13(){
		Panel p = new Panel();
		ch1 = new Checkbox("item1");
		ch2 = new Checkbox("item2");
		ch3 = new Checkbox("item3");
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		
		
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		
		
		cho = new Choice();
		cho.addItem("it1");
		cho.addItem("it2");
		cho.addItem("it3");
		cho.addItem("it4");
		cho.addItemListener(this);
		p.add(cho);
		
		list = new List(4,true);
		list.addItem("it1");
		list.addItem("it2");
		list.addItem("it3");
		list.addItem("it4");
		
//		list.addItemListener(this);
		p.add(list);

		add(p);
		
		setSize(500, 300);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex13();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
//		System.out.println("이벤트 발동"+cho.getSelectedIndex());
//		System.out.println("이벤트 발동"+cho.getSelectedItem());
		
		///////////////
//		int[] idxs = list.getSelectedIndexes();
//		String[] names = list.getSelectedItems();
//		
//		System.out.println(Arrays.toString(idxs));
//		System.out.println(Arrays.toString(names));
		////////////
		
//		System.out.println("ch1: "+ch1.getState());
//		System.out.println("ch2: "+ch2.getState());
//		System.out.println("ch3: "+ch3.getState());
//		System.out.println();
		
		if(e.getSource()==ch1){
			Checkbox obj = (Checkbox)e.getSource();
			System.out.println(obj.getLabel() + ":"+obj.getState());
		}else if(e.getSource()==cho){
			System.out.println(cho.getSelectedItem());
		}
		
		
	}
}




















