package com.bit.day14;

abstract class Lec03{
	
	Lec03(){
		System.out.println("�θ�ü ����...");
	}
	
	void func01(){
		System.out.println("������ �������� �޼��� �Դϴ�.");
	}
	
	
	abstract void func02();
}

class Lec33 extends Lec03{
	Lec33(){
		System.out.println("�ڽİ�ü ����");
	}
	
	void func02() {
		System.out.println("�ڽĿ��� func02 ����..");
	}
}


public class Ex03 {

	public static void main(String[] args) {

		Lec03 you = new Lec33();
		you.func01();
		you.func02();
	}

}