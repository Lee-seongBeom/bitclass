public class Ex01{


	// 클래스의 구성요소
	// 1. 클래스
	// 2. 변수

	static int a;   // 클래스 변수, 전역 변수, ...
	int b ;		// 멤버 필드, 인스턴스 변수, ...




	public static void main(String[] args){




		int a = 1234;

		Ex01 me = new Ex01();

		me.func();


	}
	

	public void func(){

		a++;

		System.out.println("a = "+a);


	}
	


}