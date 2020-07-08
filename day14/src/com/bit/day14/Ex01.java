package com.bit.day14;

abstract class Lec01{
	public abstract void func01();
}

class Lec11 extends Lec01{//구현의 강제성을 부여
	public void func01(){
		System.out.println("구현했음");
	}
}

public abstract class Ex01 {
	//추상클래스
	// - 추상메서드를 0개이상 갖는 클래스
	// - 추상메서드(abstarct) : 메서드의 선언(o), 구현(x)
	
//	public abstract void func01();// ;(세미콜론) 포함

	public static void main(String[] args){
		Lec01 you=new Lec11();
		you.func01();

	}

}

















