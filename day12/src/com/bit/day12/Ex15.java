package com.bit.day12;

public class Ex15 {

	public static void main(String[] args) {
		String msg1="abcd";
		String msg2="abcd";
		String msg3="abc";
		String msg4="abcasssssssssssssss";
		String msg5="abcdss";

		// compareTo -> ���� ���ڳ��� ��
		//				�״��� ���� ��
		//				���ڿ� �񱳿� ���� �񱳸� ���ÿ� ��
		System.out.println(msg1.compareTo(msg2)); //0
		System.out.println(msg1.compareTo(msg3)); //1
		System.out.println(msg1.compareTo(msg4)); //
		System.out.println(msg1.compareTo(msg5));
	}

}
