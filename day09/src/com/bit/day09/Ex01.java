package src.com.bit.day09;

class Ex01{
	// --------클래스의 구성요소-----------
	// 메서드 (객체의 기능)
	//	1. static - 클래스 메서드
	//  2. non-static - 인스턴스 메서드
	// 변수 (객체의 속성)
	//  1. static - 정적, 전역 메서드
	//  2.non static - 멤버 필드
	// 생성자
	//  생성자의 이름 == 클래스명
	//  클래스명(인자..){	}
	//  default 생성자 - 클래스명(){ }
	//  default 생성자의 경우는 다른 생성자가 존재하지 않을 시 생략 가능.   ex) 
	int su = 1234;
	static int su2 = 4321;
	
	public static void func04(){
		System.out.println("static method func01()");
	}

	public void func02(){
		System.out.println("non-static method func02()");
	}

	public static void main(String[] args){

		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Ex01 me;  //변수 선언
		me = new Ex01(); //변수 초기화

	

		System.out.println("su = "+me.su);
	} //void main end


}// class Ex01 end