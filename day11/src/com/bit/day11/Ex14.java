package com.bit.day11;

public class Ex14 extends com.bit.day10.Ex20 {

    // 접근제한자
    // public > protected >= default > private
    // protected
    //  - default와 일번적으로 동일
    //  - 단, 상속을 통한 접근은 다른 패키지 일지라도 접근 허용

    public static void main(String[] args){
        Ex14 me = new Ex14();
        me.func01();

    }
}