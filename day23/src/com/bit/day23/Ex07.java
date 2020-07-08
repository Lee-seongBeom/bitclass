package com.bit.day23;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame implements MouseListener{

	public Ex07(){
		
		Panel p=new Panel();
		
		Button bt=new Button("bt");
		bt.addMouseListener(this);
		
		
		p.add(bt);
		
		add(p);
	
		setSize(500, 500);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스버튼 누르는순간");		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스버튼 떼는순간 ");		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 in");		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 out");		
	}

}
