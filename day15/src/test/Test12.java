package test;

import java.util.*;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int input = sc.nextInt();
		int num=2;
		int temp=0;
		while(true){
			int cnt=0;
			for(int i=1;i<=num;i++){
				
				if(num%i==0){
					cnt++;
				}
				
			}
			if(cnt == 2){
				System.out.print(num+" ");
				temp++;
			}
			if(num==input){
				break;
			}
			num++;
			
		}
		System.out.println("\n1부터 "+input+"까지 소수 개수는 "+temp);
		
	}
}
