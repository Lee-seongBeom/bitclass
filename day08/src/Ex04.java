class Ex04{

	int su=1234;



	public static void main(String[] args){

		Ex04 me = new Ex04();
		me.func01();
		me.plus();
		me.func01();


		me=new Ex04();
		me.func01();
		me.plus();
		me.func01();


		//System.out.println(me.su);
	}

	public void func01(){
		System.out.println("func01 su= "+su);
	}

	public void plus(){
		su++;
	}
}