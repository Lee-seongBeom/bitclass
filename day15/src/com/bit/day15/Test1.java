package com.bit.day15;

public class Test1 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true){
			int sum=0;
			System.out.print("숫자를 입력하세요>>");
			int input = sc.nextInt();
			
			for(int i=1;i<=input;i++){
				if(input%i==0){
					sum+=i;
					System.out.print(i+" ");
				}
			}
			System.out.println();
			System.out.println(input+"의 약수 합은 "+ sum);
			System.out.println();

		}

	}

}
