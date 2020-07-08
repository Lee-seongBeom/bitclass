package com.bit.day19;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		LinkedList list1 = new LinkedList();
		
		for(int i=0; i<99999;i++){
			list1.add(i);
		}
		long before = System.currentTimeMillis();
		
		Object temp=null;
		for(int i=0;i<99999;i++){
			temp=list1.get(i);
		}
		
		long after = System.currentTimeMillis();
		System.out.println(after-before);
	}

}
