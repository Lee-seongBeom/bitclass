package com.bit.day19;

import java.util.*;

class Student{
	
	int num;
	String name;
	int kor;
	int eng;
	int math;
	
	Student(int num){
		this.num = num;
	}
	
	String name(String name){
		
		return name;
	}
	
	void kor(){
		
	}
	
	void eng(){
		
	}
	
	void math(){
		
	}
}


public class Test {

	public static void main(String[] args) {
		//학생 성적관리 프로그램(ver 0.2.0)
		//자료구조활용
		//학번 이름 국어 영어 수학 합계 평균
		Scanner sc= new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add("학번\t이름\t국어\t영어\t수학\t합계\t평균");
		int num=1;
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			int input =Integer.parseInt(sc.nextLine());
			
			if(input==0){//종료
				break;
			}else if(input==1){
				
				for(int i=0;i<list.size();i++){
					System.out.println(list.get(i));
					
				}
				
			}else if(input==2){
				
				System.out.print("이름 :");
				String name=sc.nextLine();
				
				System.out.print("국어 :");
				int kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("영어 :");
				int eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("수학 :");
				int math=Integer.parseInt(sc.nextLine());
				
				Student stu = new Student(num);
				stu.name=name;
				stu.kor=kor;
				stu.eng=eng;
				stu.math=math;
				
				
				list.add(num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+(kor+eng+math)+"\t"+((kor+eng+math)*100/3/100.0));
				num++;
				
			}else if(input == 3){//수정
				System.out.print("수정할 학번을 입력하세요 >>");
				int rename=Integer.parseInt(sc.nextLine());
				list.remove(rename);
				ArrayList listRename = new ArrayList();
				
				System.out.print("이름 :");
				String name=sc.nextLine();
				
				System.out.print("국어 :");
				int kor=Integer.parseInt(sc.nextLine());
				
				System.out.print("영어 :");
				int eng=Integer.parseInt(sc.nextLine());
				
				System.out.print("수학 :");
				int math=Integer.parseInt(sc.nextLine());
				
				listRename.add(rename+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+(kor+eng+math)+"\t"+((kor+eng+math)*100/3/100.0));
				list.add(rename, listRename);
//				list.set();
				
			}else if(input == 4){//삭제
				System.out.print("삭제할 학번을 입력하세요 >>");
				int del=Integer.parseInt(sc.nextLine());
				list.remove(del);
				list.trimToSize();
				
			}
			
		}
		System.out.println("이용해주셔서 감사합니다.");
	}

}
