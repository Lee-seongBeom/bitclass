package com.bit.day14;

import java.util.Date;


public class Ex09 {

	public static void main(String[] args) {

		java.util.Date now = new java.util.Date();
		System.out.println(now);
		System.out.print(1900 + now.getYear() + "�� ");
		System.out.print(1 + now.getMonth() + "�� ");
		System.out.print(now.getDate() + "�� ");
		System.out.print(now.getHours() + "�� ");
		System.out.print(now.getMinutes() + "�� ");
		System.out.println(now.getSeconds() + "�� ");

//		String msg="";
//		for(int i=0;i<19999;i++){
//			msg+=i;
//		}
		
		
		java.util.Date now2 = new java.util.Date();
		System.out.print(1900 + now2.getYear() + "�� ");
		System.out.print(1 + now2.getMonth() + "�� ");
		System.out.print(now2.getDate() + "�� ");
		System.out.print(now2.getHours() + "�� ");
		System.out.print(now2.getMinutes() + "�� ");
		System.out.println(now2.getSeconds() + "�� ");
		System.out.println(now2.getDay() + "-> ���� ");
		System.out.println("------------------------------");
		System.out.println(now.before(now2));
		System.out.println(now.after(now2));
		System.out.println(now2.before(now));
		System.out.println(now2.after(now));

		java.util.Date now3 = now;
		System.out.println(now.compareTo(now3));
		System.out.println(now.compareTo(now2));
		System.out.println(now2.compareTo(now));

		String msg="2020/5/25 12:00:00";
		System.out.println(Date.parse(msg)); // ���ڸ� ��¥ Ÿ������ ����
		System.out.println(System.currentTimeMillis());
		System.out.println(now.getTime());

		System.out.println("-------------------------------------------");
		long t =System.currentTimeMillis();
		java.util.Date now4 = new java.util.Date(t);
		System.out.println(now4);
		
		java.util.GregorianCalendar gc= new java.util.GregorianCalendar();
		long t2 =System.currentTimeMillis();
		java.util.Date now5 = new java.util.Date(t2);
		System.out.println(now5);
		
		java.util.Calendar cal= java.util.Calendar.getInstance();
		long t3 = cal.getTimeInMillis();
		java.util.Date now6 = new java.util.Date(t3);
		System.out.println(now6);
		

		
	}

}










