package com.bit.day22;

public class Ex05 {

	public static void main(String[] args) {
		Runnable work = new Runnable() {
			public void run() {
				Thread me = Thread.currentThread();
				System.out.println(me.getName()+" ����");
				
				for(int i=0;i<5;i++){
					System.out.println(me.getName()+" work"+i);
				}
				System.out.println(me.getName()+" ����");
				
			}
		};
		
		Thread th1 = new Thread(work,"ù��°");
		Thread th2 = new Thread(work,"�ι�°");
		Thread th3 = new Thread(work,"����°");
		
		//setPriority - �켱���� ���� (1~10)  ���� ���� ����=10(max)  <->  1
		th1.setPriority(Thread.MIN_PRIORITY);//1
		th2.setPriority(Thread.NORM_PRIORITY);//5
		th3.setPriority(Thread.MAX_PRIORITY);//10
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
