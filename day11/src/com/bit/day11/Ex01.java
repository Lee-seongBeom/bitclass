package com.bit.day11;

import javafx.beans.binding.IntegerExpression;

class Ex01 {
    public static void main(String[] args){
        // 래퍼 클래스 (박싱&언박싱) = ((오토)래핑&언래핑)
        // 타입에서 객체로 싸면 박싱 <-> 객체에서 빠져나오면 언박싱

        Integer su4 = 1234; //1234는 int // autoboxing (자동으로 객체화)

        // 기본자료형에 해당하는 클래스
        // int -> Integer
        int su1 = 100;
        Integer su2 = new Integer(1000);
        Integer su3 = new Integer("2000");
        System.out.println(su2+su3); // -> 연산을 수행하기 위해선 unboxing을 통해 int 타입으로 연산 수행해 따라서 결과는 int 타입 
                                        // unboxing ( 객체에서 나옴 )
        System.out.println("int min val : "+Integer.MIN_VALUE);  //인트의 최소값       ----------
        System.out.println("int max val : "+Integer.MAX_VALUE);  //인트의 최대값       인트의 범위
        System.out.println("int size : "+Integer.SIZE);
        System.out.println("int byte : "+Integer.BYTES);
        System.out.println("---------------------------");

        Integer su5=new Integer(129);
        byte by=su5.byteValue();
        short sho=su5.shortValue();
        int su6=su5.intValue();
        long su77 = su5.longValue();

        System.out.println(su5.byteValue());
        System.out.println(su5.shortValue());
        System.out.println(su5.intValue());
        
        Integer su7 = new Integer(100);
        Integer su8 = new Integer(100);

        System.out.println(su7==su8); // 래퍼런스 비교
        System.out.println(su7.equals(su8)); // 래퍼런스 비교가 아닌 value 비교
        System.out.println(100==su7); // su7를 객체에서 끌어냄 -> 언박싱

        String msg = "1234";
        Integer su9 = Integer.valueOf(msg); //Integer 를 return
        System.out.println(su9+1); // su9가 언박싱되어 계산됨

        int su10 = Integer.parseInt(msg); // parseInt는 int 로 return
        System.out.println(su10+1); // su10는 이미 int로 변환되어 박싱이나 언박싱이 필요없음
        
        int su11 = Integer.max(12,9);
        System.out.println(su11);
        int su12 = Integer.min(12,9);
        System.out.println(su12);

        int su13=1;
        int su14 = Integer.reverse(su13);
        System.out.println(su13+"의 보수는 : "+su14);


        System.out.println("------------");
        int su15=16;
        System.out.println("10진수: "+su15);
        System.out.println("2진수: "+Integer.toBinaryString(su15));
        System.out.println("8진수: 0"+Integer.toOctalString(su15));
        System.out.println("16진수: 0x"+Integer.toHexString(su15));

        int su16=123;
        int su17=0;
        Integer su19=11;
        
        int su18=Integer.compare(su16, su17);  // Integer.compare - 수 비교
        int su20=su19.compareTo(su17); // su19.compartTo - 수 비교  위와 같음
        System.out.println(su18);
        System.out.println(su20);

    }
}