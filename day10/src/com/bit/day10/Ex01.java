package com.bit.day10;

public class Ex01 {

    // this 를 명시적으로 사용해야 할 때.
    //  -지역변수와 전역변수가 같은이름으로 동시에 존재하는데 필드에 접근하고싶으면 객체의 주소를 불러 사용할수 있다

    int su1 = 1234;
    /*  
    예시
    Ex01(int su1){
        this.su1 = su1;
    }
    */

    public void func01() {
        int su1= 1111;
        System.out.println("func01 run...");
        this.func02();
        System.out.println("su1= "+this.su1);
    }


    public void func01(Ex01 a) {
        System.out.println("func01(param:me) run...");

        System.out.println(a==this);
        System.out.println(a.su1);

        a.func02();
    }

    public void func02() {
        System.out.println("func02 run...");
    }

    public Ex01 func03(Ex01 me){
        System.out.println("func03 run..");
        return me;
    }

    public Ex01 func04(){
        System.out.println("func04 run..");
        return this;
    }

    public static void main(String[] args) {
        Ex01 me = new Ex01();
        me.func01(me);
        
        //me.func04().func04().func04().func04();
        //me.func03(me).func03(me).func03(me).func03(me);
        //System.out.println(this); <-존재 불가  스태틱메소드에서는 이미 스태틱영역에 할당돼있기때문에 this로 주소를 부를수없음

    }
}
