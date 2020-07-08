package com.bit.day13;

public class Ex05 {
	
	int a;
	
	Ex05(int a){
		this.a=a;
	}
	
	//객체의 비교대상이 value를 무엇으로 결정할것인가

	public boolean equals(Object me2){
		Ex05 me=(Ex05) me2;
		return (this.a==me.a);
		
	}
	
	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2=obj;
		Object obj3=new Object();
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(obj3));
//		obj.clone(); // 에러
		System.out.println("----------------------------");
		System.out.println(obj3);
		
		Ex05 me =new Ex05(5);
		Ex05 me2 = new Ex05(5);
//		System.out.println(me == me2);  
//		System.out.println(me.equals(me2)); 
		
//		String msg = "java";
//		String msg2 = new String("java");
//		
//		System.out.println(msg==msg2); // false
//		System.out.println(msg.equals(msg2)); // true
//		
//		Integer su1=new Integer(100);
//		Integer su2=new Integer(100);
//		
//		System.out.println(su1 == su2); //false
//		System.out.println(su1.equals(su2)); //true
		try{
			Object me3 = me.clone(); // Ex05 me3 = (Ex05)me.clone();
			System.out.println(me3==me);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
	

	
}
















