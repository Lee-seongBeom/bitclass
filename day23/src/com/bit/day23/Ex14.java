package com.bit.day23;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.TextListener;

public class Ex14 extends Frame implements TextListener{

	public Ex14(){
		Panel p = new Panel();
		TextField tf=new TextField(15);
		tf.addTextListener(this);
		
		p.add(tf);
		add(p);
		
		setSize(500, 300);
		setLocation(300,200);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Ex14();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println(((TextField)e.getSource()).getText());
	}

}
