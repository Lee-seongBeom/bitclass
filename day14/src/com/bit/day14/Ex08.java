package com.bit.day14;

public class Ex08 {

	public static void main(String[] args) {

		java.util.GregorianCalendar cal = null;
		cal = new java.util.GregorianCalendar(2020,5,25,10,50,59);
		
		System.out.print(cal.get(cal.YEAR) + "��");
		System.out.print(cal.get(cal.MONTH) + "��"); // 0~11
		System.out.print(cal.get(cal.DATE) + "�� ");
		
		System.out.print(cal.get(cal.HOUR_OF_DAY) + "��");
		System.out.print(cal.get(cal.MINUTE) + "��");
		System.out.println(cal.get(cal.SECOND) + "��");
		
	}

}
