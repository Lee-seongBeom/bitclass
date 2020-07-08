package com.bit.day09;

public class Ex05 {
    public static void main(String[] args){
        // 배열
    
        
        int a1 = 1;
        int a2 = 3;
        int a3 = 5;
        int a4 = 7;
        int a5 = 9;
        
        // 배열의 특징은 정적할당 (한번 지정된 개수를 동적으로 늘리거나 줄일 수 없음)
        // 자료형[] 배열명 = new 자료형[개수]; -> 개수를 확보하기 위해 동일한 자료형이어야 함
        // 배열명[인덱스 번호]
        // 인덱스 번호
        //  1. 0부터
        //  2. 연속됨(중간에 누락불가능)
        //  3. 인덱스 번호의 끝은 개수-1


        int[] a=new int[5];;   // 또는 int b[];
        a[0]=2;
        a[1]=4;
        a[2]=6;
        a[3]=8;
        a[4]=10;

        
        int[] b = new int[]{1,3,5,7,9};

        int[] c = {10,11,12,13,14,15};

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
        System.out.println("------------");
        for(int i=0; i<5; i++){
            System.out.println(b[i]);
        }
        System.out.println("------------");
        for(int i=0; i<5; i++){
            System.out.println(c[i]);
        }


    }//void main end

}// class Ex05 end