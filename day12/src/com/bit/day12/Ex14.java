package com.bit.day12;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		String msg2=" s    Java wad  dd          d                ";
		
		int su = msg.indexOf("web");
		
		
//		System.out.println(su);// 0이 나오면 첫자리로 돌아가서 -1이 나옴
		
//		String st1=msg.replace('z', 'Z');// 바꿀문자가없어서 그대로 출력
//		System.out.println(st1);
		
		char ch=msg.charAt(0);
	
		boolean boo1=msg.contains("web"); // contain - 포함하다 
//		System.out.println(boo1); // 포함돼있으면 true , 아니면 false;
		
		boolean boo2=msg.startsWith("J"); // 무슨 문자로 시작되는지 
		
		
		boolean boo3=msg.endsWith("work");//무슨 문자로 끝나는지
//		System.out.println(boo3);
		
		String st2=msg.toLowerCase();// 전부 소문자로 바꿈
//		System.out.println(st2);
		
		String st3=msg.toUpperCase(); // 전부 대문자로 바꿈
//		System.out.println(st3);
		
		int lang=msg2.length();
//		System.out.println(lang);
		boolean boo4 = msg2.isEmpty(); // 비어있으면 true 아니면 false
//		System.out.println(boo4); // null 은 에러
		
		String st4=msg2.trim();
//		System.out.println(msg2);
//		System.out.println(st4); // 글자 제일 앞 , 제일 뒤의 공백을 날려줌

		System.out.println(st4); // J로 또는 Ja 시작 등.. true, j는 false;
		
		
		
	}

}
