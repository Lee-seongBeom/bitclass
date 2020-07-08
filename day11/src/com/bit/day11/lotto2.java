package com.bit.day11;
class Ball{
    private int num;
    boolean check;

    Ball(int num){
        this.num=num;
        check=false;
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void showNum(){
        System.out.print(num+" ");
    }

}


public class lotto2 {
    

    public static void main(String[] args){
        
        Ball[] box = new Ball[45]; //공을 생성해 박스에 담음
        for(int i=0;i<box.length; i++){
            box[i] = new Ball(i+1);
        }
    
        // 박스를 흔들어 섞어줌
        // Ball temp =null;
        // for(int i=0;i<1000;i++){
        //     temp=box[0];
        //     int ran = (int)(Math.random()*44)+1;
        //     box[0] = box[ran];
        //     box[ran] = temp;
        // }

        //int[] note = new int[6];
        int cnt=0;

        while(true){
            int ran=(int)(Math.random()*45);// 0~44
            Ball ball = box[ran];
            if(ball.checking()==true){ // 앞에서 한번 뽑았던것 - 중복

            }else{ // false 이면 한번도 안뽑았던것 - 중복X
                ball.showNum();
                ball.marking();
                cnt++;
                if(cnt ==6){
                    break;
                }
            }
        }
    }
}