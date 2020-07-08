package com.bit.day12;

public class Ex12PN {

	public static void main(String[] args) {
		// 주민번호입력 :090226-3124567
		// >> 당신은 00세 남자입니다.

		// 주민번호입력:990206-2124567
		// >> 당신은 00세 여자입니다.

		// 주민번호입력:9902062124567
		// >> 입력패턴을 다시확인하세요(000000-0000000)

		// 주민번호입력:990206-212456
		// >> 주민번호 자리수를 다시 확인하세요
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input=null;
		
		char[] ju1=new char[6];
		char[] ju2=new char[7];
		
		System.out.println("주민번호입력 : ");
		input=sc.nextLine();

		try {

			for (int i = 0; i < ju1.length; i++) {
				ju1[i] =(char)('0'+Integer.parseInt(""+input.charAt(i)));
			}
			for (int i = 0; i < ju2.length; i++) {
				ju2[i] =(char)('0'+Integer.parseInt(""+input.charAt(i + ju1.length + 1)));
			}
			
			if(input.charAt(6)!='-'){
				Exception err=new Exception();
				throw err;
			}

		} catch (Exception e) {
			System.out.println("다시 확인하고 입력");
		}
		
		System.out.println("처리완료");

	}

}
