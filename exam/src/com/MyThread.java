package com;

public class MyThread extends Thread {

	String str;
	public MyThread(String str){
		this.str = str;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(str);
			
			try {
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
