package com.bit.day10;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args){
        //로또 번호 생성기
        //1~45까지 숫자 6개
        // 랜덤, 중복 X
        // 오름차순 정렬 출력
        //-------------------
        // 보너스 번호
        int[] arr = new int[46];
        for(int i=1;i<arr.length;i++){
           arr[i]=i;
        }// 0~45 입력

        int[] result= new int[6]; // result배열 6개의 공간 생성
        boolean boo1 = true;
        while(boo1){
        
            for(int i=0;i<result.length;i++){
                int random_num = (int) (Math.random() * 100);
                if(random_num>=1 && random_num <=45){
                    result[i] = random_num;
                    //System.out.println(result[i]);
                }else{
                    i--;
                }
                if(i==result.length-1){
                    boo1=false;
                }
            }
        }
        
        boolean boo2 = true;

        for(int i=0;i<result.length;i++){
            
        }/*
        while(boo2){
            int random_num = (int) (Math.random() * 100);
        
            if (random_num >= 1 && random_num <= 45) {
                result[i] = random_num;
                // System.out.println(result[i]);
            } else {
                i--;
            }
            for(int i=0;i<result.length;i++){
                for(int j=i+1;j<result.length;j++){
                    if (result[i] == result[j]) {
                        result[j] = random_num;
                        j--;
                    }
                }
            }
        }*/
    }
}

/////////// 6개 랜덤변수 생성 중복함