package com.bit.day14;

interface Inter01{ 
	// 인터페이스는 오직 추상메서드만 가능
	// 객체 생성이 불가능(?)하고 생성자와 필드도 없음
	// 예외) public static final 변수만 생성가능
	// 예외) 메서드 앞에 public abstract 생략가능	
	
	public static final int su1=1111;
	static final int su2=2222; //public 생략 가능 	
	final int su3=3333; 	// static 생략 가능 
	int su4=4444; 	// final 생략 가능 
	
	public abstract void func01();
	public void func02(); // 인터페이스에는 적혀있는 모든게 추상메서드이기 때문에 abstract를 생략 가능
	void func03(); //public 생략 가능 -> 생략시 default가 아닌 public
}

interface Inter02{}
interface Inter03{} // 아무것도 없지만 사용하는 이유
					// 1. 클래스의 정보
					// 2. 분류, 제약
			


public class Ex04 extends Object implements Inter01,Inter02{// interface는 얼마든지 다중상속 가능
	
	public static void main(String[] args) {
//		Inter01 me=new Ex04();
//		me.func01();
//		me.func02();
//		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);
		// final이기 때문에 건들수 없이 오직 상수만
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
