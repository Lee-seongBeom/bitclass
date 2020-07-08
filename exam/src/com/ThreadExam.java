package com;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread t1 =new MyThread("1");
		MyThread t2 =new MyThread("2");
		
		synchronized (t1) {
			t1.start();
		}	
		
		t2.start();
		
		System.out.println("main end");
		
	}

}
