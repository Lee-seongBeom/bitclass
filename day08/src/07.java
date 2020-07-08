class Bank{
	static int money;
	
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

		Bank bank = new Bank();
		bank.print()

		System.out.println();




	}//void main

}//class Ex07