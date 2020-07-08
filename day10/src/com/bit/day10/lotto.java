package com.bit.day10;

public class lotto {
    public static void main(String[] args){
        //로또 생성기
        // 랜덤값 6개 출력 중복X

        int[] lotto=new int[7];
        for(int i=0;i<lotto.length;i++){
            int ran=(int)(Math.random()*45)+1;
            lotto[i]=ran;
            for(int j=0;j<=i-1;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<lotto.length;i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println();
        // 오름차순 출력
        
        int temp=0;
        for(int i=0;i<lotto.length-1;i++){
            for(int j=i+1;j<lotto.length;j++){
                if(lotto[i] >lotto[j]){
                     temp = lotto[i];
                     lotto[i] = lotto[j];
                     lotto[j] = temp;
                }
            }
        }
        for(int i=0;i<lotto.length-1;i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.print("\t 보너스번호: "+lotto[6]);
        


    }
}