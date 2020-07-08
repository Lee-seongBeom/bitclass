package com.bit.day15;

public class Ex02 {

	private static final Object[][] String = null;
	private static java.lang.String[][] mainData;

	public static void main(String[] args) {
		// 성적 관리 프로그램( 동적배열 )
		System.out.println("성적 관리 프로그램 (동적배열)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int idx = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int temp=0;
		String name = "";

		while (true) {
			
			int cnt = 1;
			
			String[][] data = new String[1][];
			
//			String[][] allData = data;

			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 0) {
				break;
			} else if (input == 1) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
				String[] stu = data[temp];
				System.out.println(stu[0]+stu[1]+stu[2]+stu[3]);
				temp++;

//				for (int i = 0; i < cnt; i++) {
//					System.out.println(stu[0]+stu[1]+stu[2]+stu[3]);
//					cnt++;
//				}

			} else if (input == 2) {

				String[] stu = new String[4];

				System.out.println("----정보를 입력하세요");

				System.out.print("이름 >> ");
				stu[0] = sc.nextLine();

				System.out.print("국어 >> ");
				stu[1] = sc.nextLine();

				System.out.print("영어 >> ");
				stu[2] = sc.nextLine();

				System.out.print("수학 >> ");
				stu[3] = sc.nextLine();


				data[idx]=stu;
//				for(int i=0;i<4;i++){
//					data[idx][i]=stu[i];	
//				}
				System.out.println(java.util.Arrays.toString(data[idx]));
				System.out.println(idx);
				idx++;

			}

		}

	}

}