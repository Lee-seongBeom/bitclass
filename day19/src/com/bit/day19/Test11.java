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
		String title = "학생 성적관리 프로그램(ver 0.2.0)";
		System.out.println("--------------------------------------------------");
		System.out.println(title);
//		list.add("학번\t이름\t국어\t영어\t수학\t합계\t평균");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			int input=Integer.parseInt(sc.nextLine());
			if(input == 0){
				System.out.println("종료");
				break;
			}else if(input==1){
				
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------------------");
				for(int i=0;i<list.size();i++){
					Student2 stu = (Student2)list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"+stu.sum()+"\t"+stu.aver());
				}
				
			}else if(input==2){
				Student2 stu=new Student2();
				
				System.out.print("학번>");
				stu.num = Integer.parseInt(sc.nextLine());
				
				System.out.print("이름>");
				stu.name = sc.nextLine();
				
				System.out.print("국어>");
				stu.kor = Integer.parseInt(sc.nextLine());
				
				System.out.print("영어>");
				stu.eng = Integer.parseInt(sc.nextLine());
				
				System.out.print("수학>");
				stu.math = Integer.parseInt(sc.nextLine());
				
				list.add(stu);
				
			}else if(input==3){//수정
				System.out.print("수정할 학번>>");
				int rename = Integer.parseInt(sc.nextLine());
				for(int i=0;i<list.size();i++){
					Student2 stu = (Student2)list.get(i);
					if(stu.num == rename){
						System.out.print("이름>");
						stu.name = sc.nextLine();
						
						System.out.print("국어>");
						stu.kor = Integer.parseInt(sc.nextLine());
						
						System.out.print("영어>");
						stu.eng = Integer.parseInt(sc.nextLine());
						
						System.out.print("수학>");
						stu.math = Integer.parseInt(sc.nextLine());
					}
				}
			}else if(input==4){//삭제
				System.out.print("삭제할 학번 입력>");
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
