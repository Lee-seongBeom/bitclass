package com.bit.day10;
class Random_1{

    
    //int top_num; // 첫 숫자
    private int end_num; // 마지막 숫자
    private int len_num=6; // 배열 크기
    private int top_num;
    int[] lotto = new int[len_num];
   

    Random_1(int top_num,int end_num, int len_num){
        this.top_num = top_num;
        this.end_num = end_num;
        this.len_num = len_num;
    }

    void print_num(){  // 중복하지않은 top_num ~ end_num 까지 랜덤배열
        
        for(int i=0;i<len_num;i++){
            int ran=(int)(Math.random()*end_num)+1;
            if(ran<top_num || ran>end_num){
                i--;
                continue;
            }else{
                lotto[i]=ran;
            }
            for(int j=0;j<=i-1;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
            
        }

        for(int i=0; i<len_num;i++){
            System.out.print(lotto[i]+" ");
        }

        

    }

}


public class Ex12_1 {


   
    public static void main(String[] args){

       Random_1 random = new Random_1(10,25,6);
       random.print_num();
        
    }
    
}