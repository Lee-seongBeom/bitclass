package test;

public class Test {

//	public int sum(int a,int b){
//		return a+b;
//	}
	
//	public String say(){
//		return "hi";
//	}
	
	public void sum(int a, int b){
		System.out.println(a+"랑"+b+"의 합은 "+(a+b)+"입니다 .");
	}
	
	public void say(){
		System.out.println("hello");
	}
	
	
	
	public void say_nick(String nick){
		if("fool".equals(nick)){
			return;
		}
		System.out.println("나의 별명은 "+nick+" 입니다.");
	}
	
	
	int a=0;
	public void vartest(){
		this.a++;
	}
	
	
	public static void main(String[] args) {

		Test test = new Test();
		test.vartest();
		test.vartest();
		System.out.println(test.a);
		
		
	}

	
	

}
