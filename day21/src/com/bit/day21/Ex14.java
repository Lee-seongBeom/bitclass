package com.bit.day21;
import java.awt.*;
import java.util.*;

public class Ex14 extends Frame {
	
	static CardLayout layout;
	
	Ex14(){
		layout = new CardLayout();
		setLayout(layout);
		
		Panel p1 =new Panel();
		Button b1=new Button();
		b1.setLabel("첫번째");
		p1.add(b1);
		
		Panel p2 =new Panel();
		Button b2=new Button();
		b2.setLabel("두번째");
		p2.add(b2);
		
		Panel p3 =new Panel();
		Button b3=new Button();
		b3.setLabel("세번째");
		p3.add(b3);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		setSize(500,300);
	}

	public static void main(String[] args) {
		Ex14 me = new Ex14();
		me.setVisible(true);
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("1.다음 0.종료>>");
			int su = sc.nextInt();
			if(su==0){
				break;
			}else if(su ==1){
				layout.next(me);
			}
		}
		
//		layout.next(me);
//		layout.next(me);
//		layout.next(me);
//		layout.next(me);
		
	}

}
