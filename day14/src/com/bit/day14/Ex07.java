package com.bit.day14;

public class Ex07 {

	public static void main(String[] args) {

		java.util.Calendar cal = java.util.Calendar.getInstance();
		// System.out.println(cal);

		System.out.print(cal.get(cal.YEAR) + "��");
		System.out.print(1 + cal.get(cal.MONTH) + "��"); // 0~11
		System.out.print(cal.get(cal.DATE) + "�� ");
		// System.out.println(cal.get(cal.DAY_OF_WEEK)+"����"); //1~7
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("ȭ");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		default:
			break;
		}
			

		System.out.println();
		// System.out.print(cal.get(cal.AM)+"��");//
		// System.out.print(cal.get(cal.AM_PM)+"��");//
		
		if (cal.get(cal.AM) == 0) {
			System.out.print("a.m ");
		} else {
			System.out.print("p.m ");
		}
		
		System.out.print(cal.get(cal.HOUR) + "�� or ");// 0~11
		System.out.print(cal.get(cal.HOUR_OF_DAY) + "��");
		System.out.print(cal.get(cal.MINUTE) + "��");
		System.out.println(cal.get(cal.SECOND) + "��");
		
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"���� ");
		
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"���� ");
		System.out.print(cal.get(cal.DAY_OF_YEAR)+"��° ");
		
		System.out.print(cal.get(cal.DAY_OF_MONTH)+"��° ");
		
	}

}
