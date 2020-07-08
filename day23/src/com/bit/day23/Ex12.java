package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex12 extends Frame implements KeyListener{

	TextField tf;
	Label la;
	
	public Ex12(){
		Panel p = new Panel();
		p.setLayout(null);
		
		tf = new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		Button bt = new Button("bt");
		p.add(bt);
		
		la = new Label("◎");
		la.setLocation(10, 10);
		la.setSize(200,20);
		p.add(la);
		
		
		add(p);
		
		setSize(500, 300);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {	
		new Ex12();
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("타이핑"+tf.getText());
	}
	public void keyPressed(KeyEvent e) {
		
		System.out.println("키 누름"+e.getKeyCode());
		int x = la.getX();
		int y = la.getY();
		if (e.getKeyCode() == 38) {
			if(y-10>=0)
			la.setLocation(x, y - 10);
		} else if (e.getKeyCode() == 40) {
			if(y+10<=230){
				la.setLocation(x, y + 10);
			}
		} else if (e.getKeyCode() == 39) {
			if(x+10<=470){
				la.setLocation(x + 10, y);
			}
		} else if (e.getKeyCode() == 37) {
			if(x-10>=0){
				la.setLocation(x - 10, y);
			}
		}
	
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("키 뗌"+e.getKeyChar());
	}
	

}
