package com.bit.day11;

public class Ex02 {
    
    public static void main(String[] args){
        //byte ->Byte
        //short -> Short
        //long -> Long
        byte su11 = 10;
        Byte su1 = new Byte(su11); //new Byte(10)  error
 
        short su22 = 20;
        Short su2 = new Short("10"); //new Short(10)  error
        
        long su33 = 30L;
        Long su3 = new Long(10L); // new Long("10L")  error

        System.out.println(su1);
        System.out.println(su2);
        System.out.println(su3);

        
    }
    
}