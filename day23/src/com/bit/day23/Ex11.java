package com.bit.day23;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Ex11 extends Frame implements MouseListener{

	int cnt=0;
	long time;
	
	long before,after;
	
	public Ex11(){
		addMouseListener(this);
		setSize(500, 500);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex11();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		cnt++;
		if(cnt==1){
			before=System.currentTimeMillis();
		}else if(cnt==2){
			after=System.currentTimeMillis();
			if(after-before<1000){
				System.out.println("더블클릭");	
				cnt=0;
				
			}else{
				before =after;
				cnt=1;
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
