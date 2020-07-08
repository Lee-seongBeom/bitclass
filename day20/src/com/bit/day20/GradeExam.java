package com.bit.day20;

import java.util.*;
import java.io.*;

public class GradeExam {
	
	private static class Student{
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
		Student stu=new Student();
		
		System.out.println("성적관리시스템 (ver 0.2.1)");
		Scanner sc = new Scanner(System.in);
		
		java.util.Map map = new java.util.TreeMap();
		ArrayList list = new ArrayList();
		
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
			String input = sc.nextLine();
			if(input.equals("0")){
				System.out.println("종료.");
				break;
			}else if(input.equals("1")){
				System.out.println("보기");
			}else if(input.equals("2")){//�Է�
				System.out.print("학번입력>> ");
				String num = sc.nextLine();
				
				System.out.print("이름>> ");
				String name = sc.nextLine();
				
				
				
				map.put(list.get(0),num);
			}
		}
		
	}

}










