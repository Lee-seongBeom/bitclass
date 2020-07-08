package com.bit.day22;

import java.awt.*;


public class Ex10 extends Frame{

	Ex10(){
		Panel p =new Panel();
		p.setLayout(new GridLayout(4,3));
		Font f=new Font("",1,30);
		
		for(int i=0 ; i<12;i++){
			String num;
			if(i==9){
				num="*";
			}else if(i==10){
				num="0";
			}else if(i==11){
				num="#";
			}else{
				
				num=i+1+"";
			}
			Button btn=new Button(num);
			btn.setFont(f);
			p.add(btn);
		}

		add(p);
		
		setLocation(750,300);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

}
