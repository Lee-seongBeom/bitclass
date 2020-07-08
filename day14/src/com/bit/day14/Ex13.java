package com.bit.day14;

public class Ex13 {

	public static void main(String[] args) {
		java.util.Random ran = new java.util.Random();
//		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
//		System.out.println(ran.nextInt());
//		System.out.println(ran.nextDouble());

		for(int i=0;i<20;i++){
			System.out.print(ran.nextInt(10)+1+" ");//	ran.nextInt(0부터 괄호 안숫자 전까지)  ran.nextInt(3)-> 0,1,2
			
		}
	}

}
