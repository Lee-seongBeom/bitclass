package com.bit.day21;
import java.awt.*;
public class Ex15 extends Frame{

	Ex15(){
		BorderLayout layout = new BorderLayout();
		FlowLayout layout2 =new FlowLayout();
		
		Panel p =new Panel();
		p.setLayout(layout);

		Button bt1=new Button("��ư1");
		Button bt2=new Button("��ư2");
		Button bt3=new Button("��ư3");
		Panel west= new Panel();
		west.setLayout(layout2);
		Button bt4=new Button("��ư4");
		west.add(bt4);
		
		Panel center= new Panel();
		
		center.setLayout(layout2);
		Button bt5=new Button("��ư5");
		center.add(bt5);
		
		
//		Button bt6=new Button("��ư6");
//		Button bt7=new Button("��ư7");
//		Button bt8=new Button("��ư8");
//		Button bt9=new Button("��ư9");
		
		p.add(BorderLayout.NORTH,bt1);
		p.add(BorderLayout.SOUTH,bt2);
		p.add(BorderLayout.EAST,bt3);
		p.add(BorderLayout.WEST,bt4);
		p.add(BorderLayout.CENTER,bt5);
		
		
//		p.add(bt2,"South");
//		p.add(bt3,"East");
//		p.add(bt4,"West");
//		p.add(center,"Center");
		
		
		add(p);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex15();
	}

}
















