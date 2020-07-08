package com.bit.day15;

import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		
		while(true){
			
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int num = sc.nextInt();
			int[] input=new int[num];
			int[] su=new int[num];
			
			int idx=0;
			
			for(int i=0; i<input.length;i++){
				input[i]=i+1;
			}
			
			for(int i=0;i<input.length;i++){
				for(int j=i+1;j<input.length;j++){
					if(input[i]*input[j]==input.length){
						su[idx++]=input[i];
						su[idx++]=input[j];
//						System.out.print(input[i]+" "+input[j]+" ");
					}else if(input[j]*input[j]==input.length){
						su[idx++]=input[j];
//						System.out.print(" "+input[j]+" ");
					}
				}
			}
			
			for(int i=0;i<su.length;i++){
				for(int j=i+1;j<su.length;j++){
					if(su[i]==su[j]){
						su[j]= 0;
						continue;
					}
				}
			}
			
			java.util.Arrays.sort(su);
			
			int cnt =0;
			
			for(int i=0;i<su.length;i++){
				if(su[i] ==0){
					continue;
				}else{
					cnt++;
				}
			}
			int[] result = new int[cnt];
			for(int i=0;i<cnt;i++){
				result[i] = su[i];
			}
			System.out.println(java.util.Arrays.toString(su));
		}
		
	}

}
