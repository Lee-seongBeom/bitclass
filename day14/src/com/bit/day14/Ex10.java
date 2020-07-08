package com.bit.day14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Date now = new java.util.Date();
		System.out.println(now);
		
//		(i.e , date->text)
		java.text.DateFormat df = java.text.DateFormat.getDateInstance(DateFormat.FULL);
		String msg = df.format(now);
		System.out.println(msg);
		
		System.out.println("---------------");
		java.text.SimpleDateFormat sdf=null;
		sdf =new java.text.SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		msg = sdf.format(now);
		System.out.println(msg);

		sdf =new java.text.SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		msg = sdf.format(now);
		System.out.println(msg);
		
	}

}
