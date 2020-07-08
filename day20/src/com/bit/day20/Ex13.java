package com.bit.day20;
class Lec13{
	
	void func(){
		System.out.println("기능사용");
	}
}

class Template{
	static Box<BaseBall> newInstance(BaseBall ball){
		Box<BaseBall> lec=new Box<>();
		lec.push(ball);
		return lec;
	}
}
public class Ex13 {

	public static void main(String[] args) {
		Box<BaseBall> lec =Template.newInstance(new BaseBall());
		lec.pull().play();
	}
}
