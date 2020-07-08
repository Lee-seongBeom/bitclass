class Ex02{


	static int su1 ;// 값을 넣고싶으면 초기화와 함께 해야함
	static String msg ; // 전역변수 String 값을 넣지않고 출력하면 null

	public static void main(String[] args){

		System.out.println(msg+"aaa");
		func01();
		Ex02 me = new Ex02();
		me.func02();

	}
	

	public static void func01(){
		System.out.println(su1);
	}

	public void func02(){
		System.out.println(su1);
	}
}