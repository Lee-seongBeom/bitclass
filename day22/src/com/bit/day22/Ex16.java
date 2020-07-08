package com.bit.day22;

import java.awt.*;

public class Ex16 extends Frame{

	public Ex16(){
		Panel p =new Panel();
//		BorderLayout layout = new BorderLayout();
//		GridLayout grid = new GridLayout(4,3);
//		Color c=new Color(0,0,0);
		GridBagLayout layout = new GridBagLayout();
		
		p.setLayout(layout);
		
		Button bac=new Button("ac");
		Button bstar=new Button("*");
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b0=new Button("0");
		Button bd=new Button(".");
		Button be=new Button("=");
		Button bm=new Button("-");
		Button bp=new Button("+");
		Button bna=new Button("/");
		
		GridBagConstraints c =new GridBagConstraints();
		
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bac,c);
		p.add(bac);

		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bstar,c);
		p.add(bstar);
		
		c.gridx=2;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bna,c);
		p.add(bna);
		
		c.gridx=3;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bp,c);
		p.add(bp);
		
		
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b7,c);
		p.add(b7);
		
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b8,c);
		p.add(b8);
		
		c.gridx=2;
		c.gridy=1;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b9,c);
		p.add(b9);
		
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b4,c);
		p.add(b4);
		
		c.gridx=1;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b5,c);
		p.add(b5);
		
		c.gridx=2;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b6,c);
		p.add(b6);
		
		c.gridx=0;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b1,c);
		p.add(b1);
		
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b2,c);
		p.add(b2);
		
		c.gridx=2;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b3,c);
		p.add(b3);
		
		c.gridx=3;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bm,c);
		p.add(bm);
		
		c.gridx=3;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(be,c);
		p.add(be);
		
		
		c.gridx=2;
		c.gridy=4;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bd,c);
		p.add(bd);
		
		c.gridx=0;
		c.gridy=4;
		c.gridwidth=2;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(b0,c);
		p.add(b0);

		TextField tf=new TextField(5);
		
		
		add(p);
		setSize(400,600);
		Dimension dim=getSize();
		int w =dim.width;
		int h =dim.height;
		setLocation(1920/2-w/2,1080/2-h/2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex16();

	}

}
