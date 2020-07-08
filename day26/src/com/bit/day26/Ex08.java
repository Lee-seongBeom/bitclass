package com.bit.day26;

class Lec08 extends Thread{
	int tot;
	
	public void run(){
		synchronized (this){
			
			for(int i=0; i<50;i++){
				System.out.println(i+"를 더합니다");
				tot+=i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			notify();// 잠들어있는 쓰레드(wait)를 무작위로 깨움 (runnable상태로)
//			notifyAll();// 전부 runnable
		}
	}
}

public class Ex08{

	public static void main(String[] args) {
		Lec08 lec =new Lec08();
		lec.start();
		
		synchronized (lec){		
			try {
				lec.wait(1000);
				// wait : 대기시킴
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("tot :"+lec.tot);
	}

}









