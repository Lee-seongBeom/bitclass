package com;

public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 t1 =new MyThread2("t1");
		MyThread2 t2 =new MyThread2("t2");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
	}

}
