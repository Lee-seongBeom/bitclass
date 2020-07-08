package com.bit.day19;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		BitLinkedList list = new BitLinkedList();	//LinkedList list =  new LinkedList();
		
		list.add(1);
		list.add(12);
		list.add("kkk");
		list.add(1234);
		list.add(12345);
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
