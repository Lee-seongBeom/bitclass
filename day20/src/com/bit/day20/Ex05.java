package com.bit.day20;
import java.util.*;


//class Lec05 implements Comparator{
//	
//	@Override
//	public int compare(Object o1, Object o2) {
//		return (int)o1-(int)o2;
////		return (int)o2-(int)o1;
////			return -1;
//	}
//	
//	
//}

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		
		List list=new ArrayList();
		
		list.add(1111);
		list.add(5555);
		list.add(7777);
		list.add(3333);
		list.add(2222);
		
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				return (int) o1 - (int) o2;
			}
		});
		
		List list2 = list.subList(1, 3);
		
		
		
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
	}

}
