package com.bit.day10;

public class Ex07 {
    public static void main(String[] args){
        /*
        String[] arr;//배열 선언
        arr=new String[5];//배열 초기화
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */

        int[] arr1=new int[]{2,4,6,8};
        // 배열의 깊은복사
        int[] arr2=new int[arr1.length];
        for(int i=0; i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr2[i]);
        }
        arr1[1]=1234;
        System.out.println(arr1[1]); // 1234
        System.out.println(arr2[1]); // 4
        
    }
    
}