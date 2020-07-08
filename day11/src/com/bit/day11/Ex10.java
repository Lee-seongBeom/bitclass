package com.bit.day11;
class Father{

    int money=1000;

    void work(){
        money+=100;
        System.out.println("돈벌어온다");

    }

    void push(){
        money-=10;
    }
}

class Son extends Father{

    int money=0;

    // 메서드 오버라이드 -> 상속시 부모와 똑같은 이름을 재 정의 함으로써 내가 정의한 기능을 사용하는게 오버라이드
    // 다중 상속 불가능 . 오직 단일상속
    // 모든 클래스는 최상단의 object 를 상속받는다 
    // class Ex10 (extends object) <- 생략

    void work(){
        money +=10;
        System.out.println("용돈을 받는다");
    }
}



public class Ex10 {

    public String toString(){
        return "나 자신";
    }
    public static void main(String[] args){

        // Father fa = new Father();
        // fa.work();
        // fa.work();
        // fa.work();
        // fa.push();
        
        Son son = new Son();
        System.out.println(son.money);
        son.work();
        System.out.println(son.money);
        son.push();
        System.out.println(son.money);

        Object obj = new Object();
        System.out.println(obj.toString());
        Ex10 me = new Ex10();
        System.out.println(me.toString());
        System.out.println(me);
    }
}