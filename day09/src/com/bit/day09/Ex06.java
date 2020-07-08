package src.com.bit.day09;

public class Ex06 {
    public static void main(String[] args){

        //다음에 배열에 값을 +2씩 하고 출력하라
        int[] su1={1,4,6,7,9};
        for(int i=0;i<su1.length;i++){
            System.out.print(su1[i]+2+"  ");
        }

        System.out.println("배열의길이 : "+su1.length);

        System.out.println();
   
        System.out.println();



        
        System.out.println("0~10중 홀수를 담는 배열을 생성하고 출력");

        /*
        // 1번 방법-----------------------
        int idx =0;
        int[] su3 = new int[5];
        for(int i=0; i<11; i++){
            if(i%2 == 1){
                su3[idx++] = i;
                
            }
            
        }
        //------------------------
       */


        //2번 방법------------------------
        int count = 0;
        for(int i =0; i<11;i++){
            if(i%2 == 1){
                count++; 
            }// 홀수 개수 카운트
        }

        int[] su3 = new int[count];
        int idx = 0;
        for(int i =0; i<11;i++){
            if(i%2==1){
                su3[idx++]=i;
            }
        }
        //----------------------------------
        

        for(int i = 0; i<su3.length; i++){
            System.out.print(su3[i]+" ");
        }



        System.out.println();
        System.out.println();




        

        // 알파벳 대문자를 담는 배열을 만들고출력
        int[] su4 = new int['Z'-'A'+1];
        
        char a2 = 'A';

        for(int i=1;i<su4.length;i++){
            su4[i] = a2+i;
            System.out.print((char)su4[i]+" ");
        }


    
        System.out.println();
        //다음을 오름차순 정렬 출력
        



/*
        int[] su2_1 = {7,1,10};
        int temp = 0;

        if(su2_1[0]<su2_1[1] && su2_1[0]<su2_1[2]){
            System.out.println(su2_1[0]);
            su2_1[0] = su2_1[0];
            
        }else if(su2_1[1]<su2_1[0] && su2_1[1]<su2_1[2]){
            System.out.println(su2_1[1]);
            temp=su2_1[0];
            su2_1[0] = su2_1[1];
            su2_1[1] = temp;
        }else if(su2_1[2]<su2_1[1] && su2_1[2]<su2_1[0]){
            System.out.println(su2_1[2]);
            temp=su2_1[0];
            su2_1[0] = su2_1[2];
            su2_1[2] = temp;
        }

        if(su2_1[1]<su2_1[2]){
            System.out.println(su2_1[1]);
        }else if(su2_1[1]>su2_1[2]){
            System.out.println(su2_1[2]);
            temp=su2_1[1];
            su2_1[1] = su2_1[2];
            su2_1[2] = temp;
        }

        System.out.println(su2_1[2]);


    */


    // {7,2,4,8,3}

    int[] su2={7,2,4,8,3};
    int temp = 0;


    for(int i=0; i<su2.length-1;i++){
        for(int j =i+1; j<su2.length;j++){
            if(su2[i]>su2[j]){
                temp = su2[i];
                su2[i]=su2[j];
                su2[j]=temp;
            }
        }
       
    }
    for(int i=0; i<su2.length; i++){
        System.out.print(su2[i]+" ");
    }

    
/*
    boolean boo = true;
    while(true){
        for(int i=0;i<su2.length-1;i++){
            if(su2[i]>su2[i+1]){
                temp= su2[i];
                su2[i] = su2[i+1];
                su2[i+1] = temp;
            }
        }
        if(su2[0]<su2[1] && su2[1]<su2[2] &&su2[2]<su2[3] &&su2[3]<su2[4] &&su2[4]<su2[5]){
            boo = false;
            System.out.println(su2);
        }
    }
    
*/
    






    }// void main end
} //class Ex06 end