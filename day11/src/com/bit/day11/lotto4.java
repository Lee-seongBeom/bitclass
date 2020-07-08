package com.bit.day11;
class Ball2{
    private int num;
    boolean check;
    String color;

    Ball2(int num){
        this.num=num;
        check=false;

        if(num<11){
            color ="노랑";
        }else if(num<21){
            color ="파랑";
        }else if(num<31){
            color ="빨강";
        }else if(num<41){
            color ="회색";
        }else{
            color ="초록";
        }
        
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void printNum(){
        System.out.println(color+"공"+num+"  ");
    }

    int showNum(){
        return num;
    }

}


public class lotto4 {
    

    public static void main(String[] args){
        
        Ball2[] box = new Ball2[45]; //공을 생성해 박스에 담음
        for(int i=0;i<box.length; i++){
            box[i] = new Ball2(i+1);
        }
    
        // 박스를 흔들어 섞어줌
        // Ball2 temp =null;
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
            Ball2 ball = box[ran];
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