package com.bit.day19;
import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		//  stack(first in last out)		
		Stack stack = new Stack();
		
		stack.push("item1");
		stack.push("item2");
		stack.push("item3");
		stack.push("item4");
//
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//
//		System.out.println("---------------------");
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		while(!stack.empty()){
			System.out.println(stack.peek());
			stack.pop();
		}
		
	}

}
