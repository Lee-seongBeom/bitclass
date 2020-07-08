package com.bit.day19;

import java.util.*;


public class Ex10grade01 {

	private static class Student {
		int num;
		String name;
		int kor;
		int eng;
		int math;
		
		int total() {
			return kor + eng + math;
		}

		double avg() {
			return total() * 100 / 3 / 100.0;
		}
	}

	public static void main(String[] args) {
		// �л� �������� ���α׷�(ver 0.2.0)
		// �ڷᱸ��Ȱ��
		// �й� �̸� ���� ���� ���� �հ� ���
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();

		while (true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 0) {// ����
				break;
			} else if (input == 1) {

				System.out.println("--------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("--------------------------------------------------");
				
				for(int i=0;i<list.size();i++){
					Student stu = (Student)list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"+stu.total()+"\t"+stu.avg());
					
				}
				
			}else if(input==2){

				Student stu= new Student();
				
				System.out.print("�й�>");
				stu.num = Integer.parseInt(sc.nextLine());
				
				System.out.print("�̸�>");
				stu.name=sc.nextLine();
				
				System.out.print("����>");
				stu.kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("����>");
				stu.eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("����>");
				stu.math=Integer.parseInt(sc.nextLine());
				
				list.add(stu);
			}else if(input==3){
				System.out.print("������ �й�>");
				int num = Integer.parseInt(sc.nextLine());
				for(int i=0;i<list.size();i++){
					Student stu = (Student)list.get(i);
					if(stu.num==num){
						System.out.print("�̸�>");
						stu.name=sc.nextLine();
						
						System.out.print("����("+stu.kor+") >");
						stu.kor=Integer.parseInt(sc.nextLine());
						
						System.out.print("����("+stu.eng+") >");
						stu.eng=Integer.parseInt(sc.nextLine());
						
						System.out.print("����("+stu.math+") >");
						stu.math=Integer.parseInt(sc.nextLine());
						
						break;
					}
					
				}
				
			}else if(input==4){
				System.out.print("������ �й�>");
				int num = Integer.parseInt(sc.nextLine());
				
				for(int i=0;i<list.size();i++){
					Student stu = (Student)list.get(i);
					if(stu.num==num){
						list.remove(i);
						break;
					}
				}
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}
