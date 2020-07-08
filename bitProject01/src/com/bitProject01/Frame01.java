package com.bitProject01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame01 extends Frame implements ActionListener{
	
	TextArea ta;
	TextField tf;
	Button btnSend;
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf || e.getSource()==btnSend){
			ta.append(tf.getText());
			tf.setText("");
			tf.setText("");
			tf.requestFocus();
		}
	}
	

	public Frame01(){

		this.setLayout(new BorderLayout());
		
		Panel chatViewP =new Panel();
		chatViewP.add(new Label());
		ta =new TextArea();
		chatViewP.add(ta);
		
		add(chatViewP,BorderLayout.WEST);
		
		Panel memberP =new Panel();
		memberP.add(new Label("참여자 명단"));
		
		add(memberP);
		
		
		
		Panel chatInputP =new Panel();
		chatInputP.add(new Label("입력창"));
		TextField tf = new TextField(30);
		tf.addActionListener(this);
		tf.setSize(200,20);
		chatInputP.add(tf);
		add(chatInputP,BorderLayout.SOUTH);
		
		btnSend =new Button("Send");
		btnSend.addActionListener(this);
		chatInputP.add(btnSend);
		
		
		
		
		setSize(600,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame01();
	}


}
