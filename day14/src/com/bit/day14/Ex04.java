package com.bit.day14;

interface Inter01{ 
	// �������̽��� ���� �߻�޼��常 ����
	// ��ü ������ �Ұ���(?)�ϰ� �����ڿ� �ʵ嵵 ����
	// ����) public static final ������ ��������
	// ����) �޼��� �տ� public abstract ��������	
	
	public static final int su1=1111;
	static final int su2=2222; //public ���� ���� 	
	final int su3=3333; 	// static ���� ���� 
	int su4=4444; 	// final ���� ���� 
	
	public abstract void func01();
	public void func02(); // �������̽����� �����ִ� ���� �߻�޼����̱� ������ abstract�� ���� ����
	void func03(); //public ���� ���� -> ������ default�� �ƴ� public
}

interface Inter02{}
interface Inter03{} // �ƹ��͵� ������ ����ϴ� ����
					// 1. Ŭ������ ����
					// 2. �з�, ����
			


public class Ex04 extends Object implements Inter01,Inter02{// interface�� �󸶵��� ���߻�� ����
	
	public static void main(String[] args) {
//		Inter01 me=new Ex04();
//		me.func01();
//		me.func02();
//		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);
		// final�̱� ������ �ǵ�� ���� ���� �����
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
