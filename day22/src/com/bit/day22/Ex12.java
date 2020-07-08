package com.bit.day22;

import java.awt.*;

public class Ex12 extends Frame {

	public Ex12(){
		Panel p =new Panel();
		Color c =new Color(0,100,0);
		p.setBackground(c);
//		TextArea ta =new TextArea(3,20);//TextArea(행,열);
//		ta.setText("출력\n두번째줄");
		TextArea ta =new TextArea("초기값",3,20,Scrollbar.VERTICAL);//TextArea("입력문자열",행,열,스크롤제어);
		
		
//		ta.setVisible(false);//보이고 안보이고
//		ta.setEditable(false);//수정하고 못하고
//		ta.setEnabled(false);//건들수 없게
//		ta.setColumns(100);//가로길이
//		ta.setRows(10);//세로길이
		
		p.add(ta);
		
		add(p);
		setLocation(200, 200);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex12();
	}

}
