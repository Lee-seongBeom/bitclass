package com.bit.day12;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		String msg2=" s    Java wad  dd          d                ";
		
		int su = msg.indexOf("web");
		
		
//		System.out.println(su);// 0�� ������ ù�ڸ��� ���ư��� -1�� ����
		
//		String st1=msg.replace('z', 'Z');// �ٲܹ��ڰ���� �״�� ���
//		System.out.println(st1);
		
		char ch=msg.charAt(0);
	
		boolean boo1=msg.contains("web"); // contain - �����ϴ� 
//		System.out.println(boo1); // ���Ե������� true , �ƴϸ� false;
		
		boolean boo2=msg.startsWith("J"); // ���� ���ڷ� ���۵Ǵ��� 
		
		
		boolean boo3=msg.endsWith("work");//���� ���ڷ� ��������
//		System.out.println(boo3);
		
		String st2=msg.toLowerCase();// ���� �ҹ��ڷ� �ٲ�
//		System.out.println(st2);
		
		String st3=msg.toUpperCase(); // ���� �빮�ڷ� �ٲ�
//		System.out.println(st3);
		
		int lang=msg2.length();
//		System.out.println(lang);
		boolean boo4 = msg2.isEmpty(); // ��������� true �ƴϸ� false
//		System.out.println(boo4); // null �� ����
		
		String st4=msg2.trim();
//		System.out.println(msg2);
//		System.out.println(st4); // ���� ���� �� , ���� ���� ������ ������

		System.out.println(st4); // J�� �Ǵ� Ja ���� ��.. true, j�� false;
		
		
		
	}

}
