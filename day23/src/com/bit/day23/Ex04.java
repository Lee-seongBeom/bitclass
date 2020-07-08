package com.bit.day23;

import java.awt.*;

public class Ex04 extends Frame{

	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			g.drawString("환영합니다", 800/2, 600/2);
			g.setColor(Color.WHITE);
			g.drawLine(100, 100, 200, 200);
//			g.drawRect(300, 100, 100, 100);
			g.fill3DRect(300, 100, 100, 100, true);
//			g.fillRect(300, 200, 100, 100);
			
			g.setColor(Color.DARK_GRAY);
//			g.drawOval(500, 100, 100,100);
//			g.fillOval(500, 200, 100,100);
			
//			g.drawArc(100,400, 100, 100,0, 90);
//			g.fillArc(200,400, 100, 100,0, 90);
			
		}
	}
	
	public Ex04(){
		Canvas can =new MyCanvas();
		
		add(can);
		
		setSize(800, 600);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
