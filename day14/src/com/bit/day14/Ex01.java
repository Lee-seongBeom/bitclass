package com.bit.day14;

abstract class Lec01{
	public abstract void func01();
}

class Lec11 extends Lec01{//������ �������� �ο�
	public void func01(){
		System.out.println("��������");
	}
}

public abstract class Ex01 {
	//�߻�Ŭ����
	// - �߻�޼��带 0���̻� ���� Ŭ����
	// - �߻�޼���(abstarct) : �޼����� ����(o), ����(x)
	
//	public abstract void func01();// ;(�����ݷ�) ����

	public static void main(String[] args){
		Lec01 you=new Lec11();
		you.func01();

	}

}

















