package com.bit.day19;

import java.util.ArrayList;

public class Test999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList pitches = new ArrayList();
	        pitches.add("138");
	        pitches.add("129");
	        pitches.add("142");

	        System.out.println(pitches.get(1));
	        System.out.println(pitches.size());
	        System.out.println(pitches.contains("142"));

	        System.out.println(pitches.remove("129"));
	        System.out.println(pitches.size());
	        System.out.println(pitches.remove(0));
	        System.out.println(pitches.get(0));

	}

}
