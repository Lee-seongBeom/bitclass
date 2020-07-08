package com.bit.day22;

public class Ex05 {

	public static void main(String[] args) {
		Runnable work = new Runnable() {
			public void run() {
				Thread me = Thread.currentThread();
				System.out.println(me.getName()+" 시작");
				
				for(int i=0;i<5;i++){
					System.out.println(me.getName()+" work"+i);
				}
				System.out.println(me.getName()+" 종료");
				
			}
		};
		
		Thread th1 = new Thread(work,"첫번째");
		Thread th2 = new Thread(work,"두번째");
		Thread th3 = new Thread(work,"세번째");
		
		//setPriority - 우선순위 정함 (1~10)  제일 높은 순위=10(max)  <->  1
		th1.setPriority(Thread.MIN_PRIORITY);//1
		th2.setPriority(Thread.NORM_PRIORITY);//5
		th3.setPriority(Thread.MAX_PRIORITY);//10
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
