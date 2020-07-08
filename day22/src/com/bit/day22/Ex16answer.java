package com.bit.day22;

import java.awt.*;

public class Ex16answer extends Frame{

	public Ex16answer(){
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
		
		
		p2.add(btns[0]);
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[0], gbc);
		
		p2.add(btns[1]);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[1], gbc);
		
		p2.add(btns[2]);
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[2], gbc);
		
		
		p2.add(btns[3]);
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[3], gbc);
		
		p2.add(btns[4]);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[4], gbc);
		
		p2.add(btns[5]);
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[5], gbc);
		
		p2.add(btns[6]);
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[6], gbc);
		
		
		p2.add(btns[7]);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[7], gbc);
		
		p2.add(btns[8]);
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[8], gbc);
		
		p2.add(btns[9]);
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[9], gbc);
		
		
		p2.add(btns[10]);
		gbc.gridx=3;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[10], gbc);
		
		p2.add(btns[11]);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[11], gbc);
		
		p2.add(btns[12]);
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[12], gbc);
		p2.add(btns[13]);
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[13], gbc);
		
		p2.add(btns[14]);
		gbc.gridx=3;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[14], gbc);
		
		p2.add(btns[15]);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[15], gbc);
		
		p2.add(btns[16]);
		gbc.gridx=2;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[16], gbc);
		
		
		
		
		
		
		
		
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH,new TextField());
		p.add(BorderLayout.CENTER,p2);
		add(p);
		setSize(500,600);
		setLocation(200, 200);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex16answer();
	}
}
