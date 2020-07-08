package com.bit.day22;

import java.awt.*;

import javafx.scene.layout.Background;

public class Ex13 extends Frame{

	Ex13(){
		Panel p = new Panel();
		Font f= new Font("",1,22);

		
		CheckboxGroup cbg = new CheckboxGroup();
		
		Checkbox chk01=new Checkbox("еш1",false,cbg);
		Checkbox chk02=new Checkbox("еш2",true,cbg);
		Checkbox chk03=new Checkbox("еш3",false,cbg);
		
		chk01.setFont(f);
		chk02.setFont(f);
		chk03.setFont(f);
		
		p.add(chk01);
		p.add(chk02);
		p.add(chk03);
		
		add(p);
		setVisible(true);
		setLocation(200, 200);
		setSize(500, 300);
	}
	
	public static void main(String[] args) {
		new Ex13();
		
	}

}
