package com.bit.day15;

public class Ex02 {

	private static final Object[][] String = null;
	private static java.lang.String[][] mainData;

	public static void main(String[] args) {
		// ���� ���� ���α׷�( �����迭 )
		System.out.println("���� ���� ���α׷� (�����迭)");
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

			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 0) {
				break;
			} else if (input == 1) {
				System.out.println("�й�\t�̸�\t����\t����\t����\t���");
				String[] stu = data[temp];
				System.out.println(stu[0]+stu[1]+stu[2]+stu[3]);
				temp++;

//				for (int i = 0; i < cnt; i++) {
//					System.out.println(stu[0]+stu[1]+stu[2]+stu[3]);
//					cnt++;
//				}

			} else if (input == 2) {

				String[] stu = new String[4];

				System.out.println("----������ �Է��ϼ���");

				System.out.print("�̸� >> ");
				stu[0] = sc.nextLine();

				System.out.print("���� >> ");
				stu[1] = sc.nextLine();

				System.out.print("���� >> ");
				stu[2] = sc.nextLine();

				System.out.print("���� >> ");
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