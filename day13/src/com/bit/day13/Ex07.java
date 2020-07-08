package com.bit.day13;

import com.sun.management.VMOption.Origin;

public class Ex07 {

	static Ex07 ex=new Ex07();
	
	public void func01(){
		
	}
	
	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		
		System.out.println("출력");
//		System.exit();
		
		int[] orgin={1,3,5,7,9};
		int[] dest=new int[orgin.length];

//		for(int i=0;i<orgin.length;i++){
//			dest[i]=orgin[i];
//		}
		System.arraycopy(orgin, 1, dest, 3, 1);

		for (int i = 0; i < orgin.length; i++) {
			System.out.println(dest[i]);
		}
		
		String msg="";
		for(int i =0;i<10000;i++){
			msg+=i;
		}
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : "+(end-begin));
		
		
	}

}






