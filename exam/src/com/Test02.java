package com;

public class Test02 {
//	
//	public void func(String phoneNum){
//		String m="";
//		for(int i=phoneNum.length-4;i<phoneNum.length;i++){
//			charAt(i) = "*";
//		}
//		
//	}
	public static void main(String[] args) {
		String phoneNum="027778888";
		String m="";
		for(int i=0;i<phoneNum.length();i++){
			if(i<phoneNum.length()-4){
				m=phoneNum.replace(String.valueOf(phoneNum.charAt(i)),"*");
				System.out.println(m);
			}
		}
		
	}

}
