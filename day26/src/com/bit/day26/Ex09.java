package com.bit.day26;

import javafx.scene.control.Toggle;

class Lec09 extends Thread{

	int tot;
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		for(int i=0;i<50;i++){
			System.out.println(i+"를 누적합니다.");
			tot+=i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" end...");
	}
}
public class Ex09 {
	
	public static void toggle(Lec09 lec){
		//getState() 스레드의 상태확인
//		Thread.State.NEW
//		Thread.State.RUNNABLE
//		Thread.State.BLOCKED
//		Thread.State.TIMED_WATTING
//		Thread.State.WAITING
//		Thread.State.TERMINATED
		
		if(lec.getState() == Thread.State.NEW){
			lec.start();
		}else if(lec.getState() == Thread.State.RUNNABLE){
			lec.suspend();
//			lec.sleep(2000);
		}else if(lec.getState() == Thread.State.TIMED_WAITING){
			lec.stop();
		}
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		Lec09 lec =new Lec09();
		lec.start(); //쓰레드 시작
		toggle(lec);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		toggle(lec);
		
//		lec.suspend(); // 일시정지
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.resume(); //재개
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.stop(); // 정지
		
		System.out.println("main end...");
		
	}

}
