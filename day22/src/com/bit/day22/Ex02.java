package com.bit.day22;

public class Ex02 implements Runnable{
	
	String name;
	
	Ex02(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02("me");
		Ex02 you= new Ex02("you");
		
		Thread th1= new Thread(me);
		Thread th2= new Thread(you);
		
		th1.start();
		th2.start();
		
	}
	
	public void run(){
		System.out.println(name+"스레드 시작");
		
		for(int i=0;i<5;i++){
			System.out.println(name+"스레드 일  "+i);
		}
		
		
		System.out.println(name+"스레드 끝,,`,");
		
	}

}
