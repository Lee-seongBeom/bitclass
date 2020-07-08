package com.bit.day10;

public class Ex05 {

    public static void main(String[] args){
        String msg1 = "java ";
        String msg2 ="Framework";
        String msg3 =msg1+msg2;
        String msg4 = msg1.concat(msg2); //concat을 이용한 결과는 항상 새로운 객체로 뽑아냄
        System.out.println(msg4);

        String msg7 = "ABCD EFG";
        
        for(int i=0;i<msg7.length();i++){
            System.out.println(msg7.charAt(i));
        }
        char[] ch1 ={'A','B','C','D'};
        String msg8 = new String(ch1);
        System.out.println(msg8);

        System.out.println("--------------------");
        char[] ch2 =msg8.toCharArray();
        //System.out.println(msg8.toCharArray());
        for(int i=0;i<ch2.length;i++){
            System.out.println(ch2[i]);
        }

        
    } // void main end
    
} //class Ex05 end