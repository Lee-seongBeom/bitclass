package com.bit.day10;

public class Ex06 {
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9}; //=new int[]{1,3,5,7,9}
        int a = 6;
        System.out.println(arr1.toString()); // int a 는 기본자료형이기때문에 a.toString() 불가
        // arr1 는 객체기 때문에 참조변수 가능
        int[] arr2={1,3,5,7,9};
        int[] arr3=arr2; //배열의 얕은 복사 (Shallow copy)  // 하나의 객체를 가르키고 있기때문에 하나의 배열만 바꿔도 다른 배열도 같은결과를 부름
        System.out.println(arr1 == arr2);
        System.out.println("----------------");
        System.out.println(arr3==arr2);
        arr3[2] = 10;
        func01(arr3);// 얕은 복사
        System.out.println("----------------");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr3[i]);
        }
        
    
    }

    public static void func01(int[] su){
        su[3] = 1234;

    }
        
}