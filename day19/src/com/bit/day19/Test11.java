package com.bit.day19;

import java.util.*;

public class Test11 {
	
	private static class Student2{
		
		int num,kor,eng,math;
		String name;
		
		int sum(){
			return kor+eng+math;
		}
		
		double aver(){
			return sum()*100/3/100.0;
			
		}
		
	}
	

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		String title = "�л� �������� ���α׷�(ver 0.2.0)";
		System.out.println("--------------------------------------------------");
		System.out.println(title);
//		list.add("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			int input=Integer.parseInt(sc.nextLine());
			if(input == 0){
				System.out.println("����");
				break;
			}else if(input==1){
				
				System.out.println("--------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("--------------------------------------------------");
				for(int i=0;i<list.size();i++){
					Student2 stu = (Student2)list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"+stu.sum()+"\t"+stu.aver());
				}
				
			}else if(input==2){
				Student2 stu=new Student2();
				
				System.out.print("�й�>");
				stu.num = Integer.parseInt(sc.nextLine());
				
				System.out.print("�̸�>");
				stu.name = sc.nextLine();
				
				System.out.print("����>");
				stu.kor = Integer.parseInt(sc.nextLine());
				
				System.out.print("����>");
				stu.eng = Integer.parseInt(sc.nextLine());
				
				System.out.print("����>");
				stu.math = Integer.parseInt(sc.nextLine());
				
				list.add(stu);
				
			}else if(input==3){//����
				System.out.print("������ �й�>>");
				int rename = Integer.parseInt(sc.nextLine());
				for(int i=0;i<list.size();i++){
					Student2 stu = (Student2)list.get(i);
					if(stu.num == rename){
						System.out.print("�̸�>");
						stu.name = sc.nextLine();
						
						System.out.print("����>");
						stu.kor = Integer.parseInt(sc.nextLine());
						
						System.out.print("����>");
						stu.eng = Integer.parseInt(sc.nextLine());
						
						System.out.print("����>");
						stu.math = Integer.parseInt(sc.nextLine());
					}
				}
			}else if(input==4){//����
				System.out.print("������ �й� �Է�>");
				int removeNum= Integer.parseInt(sc.nextLine());
				for(int i=0;i<list.size();i++){
					Student2 stu = (Student2)list.get(i);
					if(stu.num == removeNum){
						list.remove(i);
						break;
					}
				}
				
			}
		}
		System.out.println("system end");
	}

}
