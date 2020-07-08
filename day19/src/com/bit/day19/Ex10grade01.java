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
		// 학생 성적관리 프로그램(ver 0.2.0)
		// 자료구조활용
		// 학번 이름 국어 영어 수학 합계 평균
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();

		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 0) {// 종료
				break;
			} else if (input == 1) {

				System.out.println("--------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------------------");
				
				for(int i=0;i<list.size();i++){
					Student stu = (Student)list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"+stu.total()+"\t"+stu.avg());
					
				}
				
			}else if(input==2){

				Student stu= new Student();
				
				System.out.print("학번>");
				stu.num = Integer.parseInt(sc.nextLine());
				
				System.out.print("이름>");
				stu.name=sc.nextLine();
				
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				
				list.add(stu);
			}else if(input==3){
				System.out.print("수정할 학번>");
				int num = Integer.parseInt(sc.nextLine());
				for(int i=0;i<list.size();i++){
					Student stu = (Student)list.get(i);
					if(stu.num==num){
						System.out.print("이름>");
						stu.name=sc.nextLine();
						
						System.out.print("국어("+stu.kor+") >");
						stu.kor=Integer.parseInt(sc.nextLine());
						
						System.out.print("영어("+stu.eng+") >");
						stu.eng=Integer.parseInt(sc.nextLine());
						
						System.out.print("수학("+stu.math+") >");
						stu.math=Integer.parseInt(sc.nextLine());
						
						break;
					}
					
				}
				
			}else if(input==4){
				System.out.print("삭제할 학번>");
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
		
		System.out.println("이용해주셔서 감사합니다.");
	}
}
