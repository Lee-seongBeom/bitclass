package com.bit.day22;

import java.awt.*;

public class Ex12 extends Frame {

	public Ex12(){
		Panel p =new Panel();
		Color c =new Color(0,100,0);
		p.setBackground(c);
//		TextArea ta =new TextArea(3,20);//TextArea(��,��);
//		ta.setText("���\n�ι�°��");
		TextArea ta =new TextArea("�ʱⰪ",3,20,Scrollbar.VERTICAL);//TextArea("�Է¹��ڿ�",��,��,��ũ������);
		
		
//		ta.setVisible(false);//���̰� �Ⱥ��̰�
//		ta.setEditable(false);//�����ϰ� ���ϰ�
//		ta.setEnabled(false);//�ǵ�� ����
//		ta.setColumns(100);//���α���
//		ta.setRows(10);//���α���
		
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
