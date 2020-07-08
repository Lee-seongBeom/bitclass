package com.bit.day10;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class Ex02 {

    int su;
    

    public Ex02(){
        this(1234); // 반드시 생성자의 객체 상단에 입력해야함
        System.out.println(this);
       
        //System.out.println(this.su);
        
    }

    public Ex02(int a){ 
        //super(); public Ex02()에서 this(1234)를 했기때문에 super()를 객체생성
        this.su=a;
        System.out.println("객체가 생성됨");
        System.out.println(this);
    }
    public static void main(String[] args){
       
        Ex02 me = new Ex02(1);
        System.out.println(me);
        System.out.println("su=  "+me.su);
        
    }
    
}