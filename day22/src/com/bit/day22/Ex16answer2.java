package com.bit.day22;

import java.awt.*;

public class Ex16answer2 extends Frame{

	public Ex16answer2(){
		Font f=new Font("",1,20);
		Panel p =new Panel();
		Panel p2 =new Panel();
		Button[] btns=new Button[17];
		String[] name={"ac","*","/","+",
				"7","8","9",
				"4","5","6","-",
				"1","2","3","=",
				"0","."
		};
		for(int i=0;i<btns.length;i++){
			btns[i]=new Button(name[i]);
//			p2.add(btns[i]);
		}
		
		GridBagLayout layout = new GridBagLayout();
		p2.setLayout(layout);
		GridBagConstraints gbc=new GridBagConstraints();
		
		func(p2,layout,gbc,btns[0],0,0,1,1);
		func(p2,layout,gbc,btns[1],1,0,1,1);
		func(p2,layout,gbc,btns[2],2,0,1,1);
		func(p2,layout,gbc,btns[3],3,0,1,2);
		
		func(p2,layout,gbc,btns[4],0,1,1,1);
		func(p2,layout,gbc,btns[5],1,1,1,1);
		func(p2,layout,gbc,btns[6],2,1,1,1);
		
		func(p2,layout,gbc,btns[7],0,2,1,1);
		func(p2,layout,gbc,btns[8],1,2,1,1);
		func(p2,layout,gbc,btns[9],2,2,1,1);
		func(p2,layout,gbc,btns[10],3,2,1,1);
		
		func(p2,layout,gbc,btns[11],0,3,1,1);
		func(p2,layout,gbc,btns[12],1,3,1,1);
		func(p2,layout,gbc,btns[13],2,3,1,1);
		func(p2,layout,gbc,btns[14],3,3,1,2);
		
		func(p2,layout,gbc,btns[15],0,4,2,1);
		func(p2,layout,gbc,btns[16],2,4,1,1);
		
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH,new TextField());
		p.add(BorderLayout.CENTER,p2);
		add(p);
		setSize(500,600);
		setLocation(200, 200);
		setVisible(true);
		
	}
	
	public void func(Panel p2,GridBagLayout layout,
			GridBagConstraints gbc, Button btn,int x,int y,int w,int h){
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		layout.setConstraints(btn,gbc);
		p2.add(btn);
	}
	
	
	public static void main(String[] args) {
		new Ex16answer2();
	}
}
