package com.bit.day14;

public class Ex07 {

	public static void main(String[] args) {

		java.util.Calendar cal = java.util.Calendar.getInstance();
		// System.out.println(cal);

		System.out.print(cal.get(cal.YEAR) + "년");
		System.out.print(1 + cal.get(cal.MONTH) + "월"); // 0~11
		System.out.print(cal.get(cal.DATE) + "일 ");
		// System.out.println(cal.get(cal.DAY_OF_WEEK)+"요일"); //1~7
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("월");
			break;
		case 3:
			System.out.println("화");
			break;
		case 4:
			System.out.println("수");
			break;
		case 5:
			System.out.println("목");
			break;
		case 6:
			System.out.println("금");
			break;
		case 7:
			System.out.println("토");
			break;
		default:
			break;
		}
			

		System.out.println();
		// System.out.print(cal.get(cal.AM)+"시");//
		// System.out.print(cal.get(cal.AM_PM)+"시");//
		
		if (cal.get(cal.AM) == 0) {
			System.out.print("a.m ");
		} else {
			System.out.print("p.m ");
		}
		
		System.out.print(cal.get(cal.HOUR) + "시 or ");// 0~11
		System.out.print(cal.get(cal.HOUR_OF_DAY) + "시");
		System.out.print(cal.get(cal.MINUTE) + "분");
		System.out.println(cal.get(cal.SECOND) + "초");
		
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"주차 ");
		
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"주차 ");
		System.out.print(cal.get(cal.DAY_OF_YEAR)+"일째 ");
		
		System.out.print(cal.get(cal.DAY_OF_MONTH)+"일째 ");
		
	}

}
