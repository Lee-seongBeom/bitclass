package src.com.bit.day09;

class Ex02{  

	//접근 제한자
	// public >> default >> private
	//  1.public - 어디서나 접근 허용
	//	2.default - 그냥 안적으면 default , 동일패키지에서만 접근 허용
	//  3.private - 동일클래스 내부에서만 접근허용  // private class 는 문법 오류

	public int su;

	
	
	public static void main(String[] args){

		Ex01.func04();
	}

}