package com.bit.day21;
import java.awt.*;
public class Ex16 {

	public static void main(String[] args) {
		GridBagLayout layout = new GridBagLayout();
		
		
		Frame f=new Frame();
		Panel p =new Panel();
		p.setLayout(layout);
		
		Button bt1=new Button("bt1");
		Button bt2=new Button("bt2");
		Button bt3=new Button("bt3");
		Button bt4=new Button("bt4");
		
		Button bt11=new Button("bt11");
		Button bt12=new Button("bt12");
		Button bt13=new Button("bt13");
		Button bt14=new Button("bt14");
		
		GridBagConstraints c =new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bt1,c);
		p.add(bt1);
		
		
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bt2,c);
		p.add(bt2);
		
		c.gridx=2;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bt3,c);
		p.add(bt3);

		c.gridx=3;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bt4,c);
		p.add(bt4);
		
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=2;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(bt11, c);
		p.add(bt11);
		
		f.add(p);
		f.setSize(400, 300);
		f.setVisible(true);
	}

}













