class Bank{
	int money=0;
	
	public void add(int a){
		money+=a;

	}// void add


	public void minus(int a){
		money-=a;

		}// void minus


	public void print(){
		System.out.println("잔금: "+money+"원");
	} // void print



}// class Banks

class Ex07{

	public static void main(String[] args){

		Bank hana = new Bank();
		Bank woori = new Bank();

		System.out.println("우리은행에서 잔고확인 ----");
		woori.print();

		hana.add(1000);


		System.out.println("하나은행에서 잔고확인 ----");
		hana.print();

		hana.minus(200);
		hana.minus(250);
		
		
		woori.add(10000);
		
		hana.minus(300);

		System.out.println("하나은행에서 잔고확인 ----");
		hana.print();


		System.out.println("우리은행에서 잔고확인 ----");
		woori.print();


		/*
		Bank cd = new Bank();
		cd.add(1000);
		cd.print();
		cd.minus(500);
		cd.print();
		cd.minus(300);
		cd.add(2000);
		cd.print();
		*/


		System.out.println();




	}//void main

}//class Ex07