package com.bit.day19;

import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1111);
		list1.add(2222);
		list1.add(1,3333);
		
		ArrayList list2 = new ArrayList();
//		list2.addAll(list1);
//		list2.clear();
		
//		Object list3 = list2.clone();
		ArrayList list3 = (ArrayList)list1.clone();
		System.out.println(list3.toString());
		
		list1.add(1111);
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.contains(1111));
		System.out.println(list1.indexOf(1111));
		System.out.println(list1.lastIndexOf(1111));
//		list1.clear();
		System.out.println(list1.isEmpty());
		
		
		list1.add("abc");
		list1.remove("abc");
//		list1.removeAll(list3);
		list1.set(2,1111);
		
		list1.trimToSize();
		
		System.out.println("-------------------------");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		
		System.out.println("===============================");
		Object[] arr = list1.toArray();
		int[] arr2=new int[arr.length];
		
		
		
		for(int i=0;i<arr.length;i++){
			arr2[i]=(int)arr[i];
//			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));
		
	}
}
















