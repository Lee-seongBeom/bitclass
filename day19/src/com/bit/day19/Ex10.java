package com.bit.day19;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex10 {

	public static void main(String[] args) {
		//�л� �������� ���α׷�(ver 0.2.0)
		//�ڷᱸ��Ȱ��
		//�й� �̸� ���� ���� ���� �հ� ���
		Scanner sc= new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
//		int num=1;
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			int input =Integer.parseInt(sc.nextLine());
			
			if(input==0){//����
				break;
			}else if(input==1){
				for(int i=0;i<list.size();i++){
					System.out.println(list.get(i));
					
				}
			}else if(input==2){
				System.out.print("�й� :");
				String num=sc.nextLine();
				
				
				System.out.print("�̸� :");
				String name=sc.nextLine();
				
				System.out.print("���� :");
				int kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("���� :");
				int eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("���� :");
				int math=Integer.parseInt(sc.nextLine());
				
				
				list.add(num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+(kor+eng+math)+"\t"+((kor+eng+math)*100/3/100.0));
				
			}else if(input == 3){//����
				System.out.print("������ �й��� �Է��ϼ��� >>");
				int rename=Integer.parseInt(sc.nextLine());
				
//				ArrayList listRename = new ArrayList();
				
				System.out.print("�̸� :");
				String name=sc.nextLine();
				
				System.out.print("���� :");
				int kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("���� :");
				int eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("���� :");
				int math=Integer.parseInt(sc.nextLine());
//				Object[] s ={rename,"",0,0,0};
				
			
				list.set(rename, rename+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+(kor+eng+math)+"\t"+((kor+eng+math)*100/3/100.0));
				
			}else if(input == 4){//����
				System.out.print("������ �й��� �Է��ϼ��� >>");
				int del=Integer.parseInt(sc.nextLine());
				list.remove(del);
				list.trimToSize();
				
			}
		}
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}