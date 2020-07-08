package com.bit.day10;

public class Ex04 {

    static String msg2;
    public static void main(String[] args){
        String msg1 ="문자열";
        String msg3="";
        String msg4=new String();
        char[] ch ={'문','자','열'};
        String msg5 = new String(ch);
        String msg6 = new String("문자열");
        String msg7 ="문자열";
        System.out.println(msg1==msg6); // false 인 이유는 저장돼 있는 위치가 다르기 때문에 다른객체로인식 new는 힙 영역 
        System.out.println(msg1==msg7); // 하나의 객체로 돌려 쓰는것이기 때문에 true;

        String msg8="문자"+"열";
        String msg9="문자";
        String msg10=msg9+"열"; // 새로운 객체
        System.out.println(msg8);
        System.out.println(msg7==msg8); // true;
        System.out.println(msg7==msg10); //false; 

        byte[] by = {65,66,67,68};
        String msg11 = new String(by);
        System.out.println(msg11);

        byte[] by2 = new byte[128];
        
        for(int i=0;i<by2.length;i++){
            by2[i]=(byte)i;
        }

        String msg12 = new String(by2);
        System.out.println(msg12);
        
    }
    
}