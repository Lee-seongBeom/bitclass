package com.bit.day22;

public class Ex04 {

	public static void main(String[] args){
		
		Thread me = Thread.currentThread();
		System.out.println(me.getName()+" "
				+ "start");
		
		Thread th = new Thread(){
			public void run(){
				System.out.println(getName()+"start,,,,");
				
				for(int i='A';i<='Z';i++){
					System.out.print((char)i+" ");
				}
				System.out.println();
				System.out.println(getName()+"end,,,,");
				
			}
		};
		
		th.start();
		System.out.println(" end");
	}

}
