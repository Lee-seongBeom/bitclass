package com.bit.day11;
class Ball1{
    private int num;
    boolean check;

    Ball1(int num){
        this.num=num;
        check=false;
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void printNum(){
        System.out.print(num+" ");
    }

    int showNum(){
        return num;
    }

}


public class lotto3 {
    

    public static void main(String[] args){
        
        Ball1[] box = new Ball1[45]; //공을 생성해 박스에 담음
        for(int i=0;i<box.length; i++){
            box[i] = new Ball1(i+1);
        }
    
        // 박스를 흔들어 섞어줌
        // Ball1 temp =null;
        // for(int i=0;i<1000;i++){
        //     temp=box[0];
        //     int ran = (int)(Math.random()*44)+1;
        //     box[0] = box[ran];
        //     box[ran] = temp;
        // }

        int[] note = new int[6];
        int cnt=0;

        while(true){
            int ran=(int)(Math.random()*45);// 0~44
            Ball1 ball = box[ran];
            if(ball.checking()==true){ // 앞에서 한번 뽑았던것 - 중복

            }else{ // false 이면 한번도 안뽑았던것 - 중복X
                ball.printNum();
                note[cnt] = ball.showNum();
                ball.marking();
                cnt++;
                if(cnt ==6){
                    break;
                }
            }
        }

        //오름차순 정렬
        int tmp=0;
        for(int i=0;i<note.length-1;i++){
            for(int j=i+1;j<note.length;j++){
                if(note[i]>note[j]){
                    tmp=note[i];
                    note[i]=note[j];
                    note[j]=tmp;

                }
            }
        }

        System.out.println("\n이번주 당첨번호는 ");
        for(int i=0;i<note.length;i++){
            System.out.print(note[i]+" ");
        }
        System.out.println("입니다 \n 축하드립니다.");
    }
}