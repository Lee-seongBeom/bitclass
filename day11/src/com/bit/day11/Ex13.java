package com.bit.day11;

class Lec13{  //final class 상속불가, 최하위 순서로 가기때문에
    void func01(){
        System.out.println("Lec13 func01...");
    }

    private void func02(){ // private 을 붙이면 해당 클래스에서만 접근이 가능하여 오버라이드로 상속
        System.out.println("Lec13 func02.,.,.");
    }
}

public class Ex13 extends Lec13{


    // public > defalut > private
    // 부모보다 같거나 더 넓은방향으로는 오버라이드가능
    // 그 밑은 에러
    void func01(){
        super.func01();
        System.out.println("Ex13 func01...");
    }

    void func02(){
       System.out.println("Ex13 func02");
    }
    public static void main(String[] args){
        Ex13 me = new Ex13();
        me.func01();
        me.func02();
        
    }
    
    
}