package com.bit.day19;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		//Queue - 선입선출
		Queue list = new LinkedList();
		
		list.offer("첫번째");
		list.offer("두번째");
		list.offer("세번째");
		list.offer("네번째");
		
//		for(int i=0;i<4;i++){
//			String msg =(String)list.peek();
//			System.out.println(msg);
//			System.out.println(list.poll());
//		}
		
		while(list.peek()!=null){ //list.element();
			String msg = (String)list.poll(); // list.remove();
			System.out.println(msg);
		}
		
//		System.out.println(list);
		
		
	}

}
