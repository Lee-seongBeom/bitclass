package com.bit.day12;

public class Ex13 {

	public static void main(String[] args) {
		// String class
		String msg1="Java";
		String msg2="Web";
		String msg3=msg1.concat(msg2);

		String msg4="JavaWebSpring";
		
		String msg5=msg4.substring(4);// 인자가 하나면 해당순서부터 끝까지 ->WebSpring
		String msg6=msg4.substring(4,6+1); // 인자가 두개면 첫번째인자 순서부터 두번째인자 순서까지  -> Web  (index, end index+1)
		String msg7=msg4.substring(0,4); // Java
		String msg8=msg4.substring(4,msg4.length()); // WebSpring

		
		String msg9=msg4.replace("Web", "DB"); // 앞에있는 것을 뒤에것으로 바꿔주는 기능
		String msg10 = msg4.replace("Web", " ");
		String msg11 = msg4.replace('a', 'A');
		String msg12 = msg4.replace("Java", "");
		
		char ch=msg4.charAt(0); // 인덱스에 해당하는문자
		int idx=msg4.indexOf('a',1); // 문자에 해당하는 인덱스
		idx=msg4.indexOf("Web"); // 문자열의 시작 번호
		idx=msg4.indexOf("a",2); // 같은 문자가 있을경우 몇번째에 찾을지 지정해 찾기 가능
		
		String msg13 =msg4.substring(msg4.indexOf("Web")+"Web".length());
		String msg14 =msg4.substring(0,msg4.indexOf("Web"));
		String msg15 =msg4.replace("a","A");
		
		System.out.println(msg15);
//		System.out.println(msg15);
		
	}
}