package com.bit.day19;

import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		Deque deq = new LinkedList();
		//  queue(first in first out)
		deq.offerFirst("ù��°");
		deq.offerFirst("�ι�°");
		deq.offerFirst("����°");
		deq.offerFirst("�׹�°");
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		//  stack(first in last out)
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
////////////////////////////////////////////////////
		System.out.println("----------------");
		deq.offerLast("1��°");
		deq.offerLast("2��°");
		deq.offerLast("3��°");
		deq.offerLast("4��°");
		//queue(first in first end)
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
		//  stack(first in last out)		
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		
		
	}
}




