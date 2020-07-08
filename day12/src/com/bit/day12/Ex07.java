package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main start...");
		try{
			func01();
		}catch(Exception e){
//			System.out.println("회피");
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
			
			e.printStackTrace(); //에러 메세지가 어디서 났는지 보기 위함
		}
		System.out.println("main end");
	}
	public static void func01() throws NumberFormatException{
//		NumberFormatException err = new NumberFormatException();
//		throw err;
		int a= Integer.parseInt("a");
	}

	
}
