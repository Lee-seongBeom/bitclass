package com.bit.day20;

import java.util.*;

public class Ex01 {
	
	public static void main(String[] args) {
		// Vector
		Vector vec01 = new Vector();
		vec01.addElement("첫번째");
		vec01.addElement("두번째");
		vec01.addElement("세번째");
		vec01.addElement("네번째");
//		for(int i=0;i<vec01.size();i++){
//			System.out.println(vec01.get(i));
//		}
		vec01.insertElementAt("3번", 2);
//		vec01.remove(0);
		vec01.removeElement("두번째");
//		
//		System.out.println();
//		System.out.println(vec01.elementAt(0));
//		System.out.println(vec01.elementAt(1));
//		
//		System.out.println(vec01.elementAt(2));
//		System.out.println(vec01.elementAt(3));
//		System.out.println(vec01.elementAt(4));
		
		Enumeration em = vec01.elements();
		
		
		
		Enumeration em2 = vec01.elements();
		
//		System.out.println(em.hasMoreElements());
//		System.out.println(em.nextElement());
//		System.out.println(em.hasMoreElements());
//		System.out.println(em.nextElement());
//		System.out.println(em.hasMoreElements());
//		System.out.println(em.nextElement());
//		System.out.println(em.hasMoreElements());

		
		while(em.hasMoreElements()){
			System.out.println(em.nextElement());
			
		}
	}

}










