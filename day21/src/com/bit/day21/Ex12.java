package com.bit.day21;

import java.awt.*;
public class Ex12 {

	public static void main(String[] args) {
		// 배치관리자
		// 컴포넌트 구성요소들..
		// 기능부여(이벤트 처리)...
		
		
//		javax.swing.JFrame frame = new javax.swing.JFrame();
		java.awt.Frame frame = new java.awt.Frame();
		Button btn01=new Button();
		Button btn02=new Button();
		
		btn01.setLabel("button1");
		btn02.setLabel("button2");
		
		btn01.setSize(50, 50);
		btn01.setLocation(50, 50);
		
		btn02.setSize(50, 50);
		btn02.setLocation(100, 50);
		
		frame.add(btn01);
		frame.add(btn02);
		
		frame.setSize(500, 300);
		frame.setLocation(750, 350);
		frame.setVisible(true);
		frame.setTitle("SETTITLE");
		
	}

}
