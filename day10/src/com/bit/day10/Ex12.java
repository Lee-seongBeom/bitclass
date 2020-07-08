package com.bit.day10;
class Random{

    
    
    
    int[] lotto = new int[45];

    void print_num(){  // 중복하지않은 1~45 랜덤배열
        
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
    }

    void output(int i){ // 랜덤숫자 개수 정하기 + 보너스 번호
        print_num();
        for(int j=0; j<i; j++){
            System.out.print(lotto[j]+" ");
        }

        System.out.print(" 보너스 번호: "+lotto[i]);
    }

   

}


public class Ex12 {


   
    public static void main(String[] args){

       Random random = new Random();
       random.output(8);
        
    }
    
}