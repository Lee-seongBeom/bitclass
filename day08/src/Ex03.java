class Ex03{

	static int a;

	public static void func01(int input){
		System.out.println("a= "+a);
	}


	public static void func02(int c){
		a++;
		int b =a;
		System.out.println("b= "+b);
	}
	

	public static void main(String[] args){

		a =12;
		
		func01(a);
		func02(a);

	}


}