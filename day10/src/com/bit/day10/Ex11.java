package com.bit.day10;

public class Ex11 {

    // 로또 기본 로직
    public static void main(String[] args){


        int[] lotto = new int[45];
       
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


        /*
        for(int i=0;i<lotto.length;i++){
            lotto[i]=i;
        }

        int temp=0;

        for(int i=0; i<3; i++){
            temp=lotto[0];
            int ran=(int)(Math.random()*44)+1;
            lotto[0]=lotto[ran];
            lotto[ran]=temp;
        }
*/

        for(int i=0;i<6;i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.print("보너스번호 : "+lotto[7]);
    }
    
}