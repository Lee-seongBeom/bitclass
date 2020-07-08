package com.bit.day20;

import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		//보너스번호까지 출력
		

		System.out.println("로또 번호 생성기 (ver 0.1.0)");
		HashSet lotto = new HashSet();
		Random ran = new Random();
		while(lotto.size()<7){
			lotto.add(ran.nextInt(45)+1);
		}
		
		Iterator note = lotto.iterator();

		while(note.hasNext()){
			System.out.print(note.next()+" ");
		}
		
		
		List list =new ArrayList(lotto);
		System.out.println("\n-------------------------------");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n-------------------------------");
	
		List list2 =list.subList(0, 6);
		
		list2.sort(new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;
			}
		});
		
		list2.add("보너스번호는 "+list.get(6));
		
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+" ");
		}
		
		
		
		
		
		
//		HashSet set =new HashSet();
//		int cnt1=1;
//		while(true){
//			
//			int a = (int)(Math.random()*5+1);
//			set.add(a);
//			
//			if(cnt1==45){
//				break;
//			}
//			cnt1++;
//		}
//
//		Iterator ite = set.iterator();
//		
//		int cnt2 =0;
//		while(true){
//			System.out.println(ite.next());
//			cnt2++;
//			if(cnt2==6){
//				break;
//			}
//		}
	}
}
