package com.bit.day12;

public class Ex13 {

	public static void main(String[] args) {
		// String class
		String msg1="Java";
		String msg2="Web";
		String msg3=msg1.concat(msg2);

		String msg4="JavaWebSpring";
		
		String msg5=msg4.substring(4);// ���ڰ� �ϳ��� �ش�������� ������ ->WebSpring
		String msg6=msg4.substring(4,6+1); // ���ڰ� �ΰ��� ù��°���� �������� �ι�°���� ��������  -> Web  (index, end index+1)
		String msg7=msg4.substring(0,4); // Java
		String msg8=msg4.substring(4,msg4.length()); // WebSpring

		
		String msg9=msg4.replace("Web", "DB"); // �տ��ִ� ���� �ڿ������� �ٲ��ִ� ���
		String msg10 = msg4.replace("Web", " ");
		String msg11 = msg4.replace('a', 'A');
		String msg12 = msg4.replace("Java", "");
		
		char ch=msg4.charAt(0); // �ε����� �ش��ϴ¹���
		int idx=msg4.indexOf('a',1); // ���ڿ� �ش��ϴ� �ε���
		idx=msg4.indexOf("Web"); // ���ڿ��� ���� ��ȣ
		idx=msg4.indexOf("a",2); // ���� ���ڰ� ������� ���°�� ã���� ������ ã�� ����
		
		String msg13 =msg4.substring(msg4.indexOf("Web")+"Web".length());
		String msg14 =msg4.substring(0,msg4.indexOf("Web"));
		String msg15 =msg4.replace("a","A");
		
		System.out.println(msg15);
//		System.out.println(msg15);
		
	}
}