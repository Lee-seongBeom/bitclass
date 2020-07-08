class Ex05{

	static int a=10 ;

	public static void func01(){

		a++;	
		System.out.println("        a= "+a); 
	}
	public static void main(String[] args){

		int a = 1234;
		a++;

		// 실행 순서 : '지역변수 -> 전역변수 ', 때문에 int a = 1234 이 우선임

		System.out.println("me1 a= "+Ex05.a);  // static 에 int a= 10 이 올라가 있기 때문에
							// class Ex05에는 a=10으로 전역변수선언

		System.out.println("me2 a= "+a); // void main 에 있는 a=1234 지역변수 선언

		func01();

		
		Ex05 me1 = new Ex05();
		Ex05 me2 = new Ex05();

		System.out.println("me1 a= "+me1.a);
		System.out.println("me2 a= "+me2.a);

		me1.a++;
		System.out.println("me1의 a++ ");
		System.out.println("me1 a= "+me1.a);
		System.out.println("me2 a= "+me2.a);


	}



}