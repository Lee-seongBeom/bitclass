package com.bit.day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex12game extends Frame implements ActionListener,Runnable {
	JButton[] btns;
	Panel center;
	int score;
	
	public Ex12game() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new BorderLayout());
		Label north=new Label("�󱸰��� �����ϼ���");
		Label sorth=new Label("���ھ�:"+"");
		
		Panel east=new Panel();
		Button begin=new Button("����");
		begin.addActionListener(this);
		Button exit=new Button("����");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		east.add(begin);
		east.add(exit);
		
		center=new Panel();
		center.setLayout(new GridLayout(4,4));
		btns=new JButton[16];
		Toolkit kit =Toolkit.getDefaultToolkit();
		
		for(int i=0; i<btns.length; i++){
			Image img = kit.createImage(1+i%4+".jpg");
			Icon icon = new ImageIcon(img);
			btns[i]=new JButton(icon);
			btns[i].setEnabled(false);
			center.add(btns[i]);
			if(i%4 ==0){
				btns[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						score++;
						
					}
				});
			}else{
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score =score-2;
					
					}
				});
			}
		}
		
		add(BorderLayout.NORTH,north);
		add(BorderLayout.SOUTH,sorth);
		add(BorderLayout.EAST,east);
		add(BorderLayout.CENTER,center);
		setSize(850,850);
		setLocation(200, 0);
		setVisible(true);
	}

	
	private void mix(){
		Random ran = new Random();
		JButton tem = null;
		for(int i=0;i<1000;i++){
			int su = ran.nextInt(15)+1;
			tem =btns[0];
			btns[0]=btns[su];
			btns[su] = tem;
		}
		for(int i=0;i<btns.length;i++){
			center.add(btns[i]);
		}
		revalidate(); // ȭ�鰻��
	}

	
	private void play(){
		for(int i=0;i<10;i++){
			mix();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0;i<btns.length;i++){
			btns[i].setEnabled(false);
		}
		System.out.println("���� " +score);
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}
		Thread thr =new Thread(this);
		thr.start();
	}
	

	public static void main(String[] args) {
		Ex12game me=new Ex12game();
	}

	@Override
	public void run() {
		play();
	}

}











