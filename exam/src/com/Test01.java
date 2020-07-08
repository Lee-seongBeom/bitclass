package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test01 {
	
	public static void main(String[] args) {

		HashSet<String> id =new HashSet<String>();
		String a ="123";
		id.add(a);
		
		String b ="12";
		id.add(b);
		
		String c ="12";
		id.add(c);
		
		
		System.out.println(id);
	}

}
