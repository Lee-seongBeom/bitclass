package com.bit.day23;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame implements WindowListener{

	public Ex05(){
		
		this.addWindowListener(this);
		setSize(500, 300);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창 열림");		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");		
		dispose();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");	
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화");		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("최대화");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창 활성화");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창 비활성화");		
	}

}
