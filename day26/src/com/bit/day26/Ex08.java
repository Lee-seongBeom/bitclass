package com.bit.day26;

class Lec08 extends Thread{
	int tot;
	
	public void run(){
		synchronized (this){
			
			for(int i=0; i<50;i++){
				System.out.println(i+"�� ���մϴ�");
				tot+=i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			notify();// �����ִ� ������(wait)�� �������� ���� (runnable���·�)
//			notifyAll();// ���� runnable
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
				// wait : ����Ŵ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("tot :"+lec.tot);
	}

}








