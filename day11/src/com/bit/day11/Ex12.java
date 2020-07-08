package com.bit.day11;

class Lec12{

    Lec12(int a){//생성자
        System.out.println("create Lec12 obj,.,.");    
    }
    
    void func01(){ // 메소드
        System.out.println("Lec12 func01 .,.,.");
    }

}

public class Ex12 extends Lec12 {

    Ex12(){
        super(1234);
        System.out.println("create Ex12");
    }

    Ex12(int a){
        super(a);

    }

    Ex12(String a){
        // this();
        this();
    }

    public static void main(String[] args){

        Ex12 me =new Ex12();
        me.func01();
        // 호출은 가장 상위의 부모클래스 부터 호출됨
    }
}