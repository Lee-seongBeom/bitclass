package com.bit.day22;

public class Ex03 {

	
	public static void main(String[] args) {
		
		
		//////////////////////////////////////
		
		Runnable work = new Runnable() {
			public void run() {
				System.out.println("thread work,,");

			}
		};
		Thread th1 = new Thread(work);
		Thread th2 = new Thread(work);
		th1.start();
		th2.start();
		
/////////////////////////////////////////////////////////
//		Thread th1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//
//			}
//		});
//		Thread th2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//
//			}
//		});
//////////////////////////////////////////////////////////
//		Thread th1 = new Thread() {
//			public void run() {
//				System.out.println("thread work..");
//			}
//		};
//
//		Thread th2 = new Thread() {
//			public void run() {
//				System.out.println("thread work..");
//			}
//		};
//		
//		th1.start();
//		th2.start();
		
		
	}

}
