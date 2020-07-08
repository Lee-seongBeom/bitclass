package src.com.bit.day09;

public class Ex07 {
    public static void main(String[] args) {
        // 1~6까지 랜덤한 수로 배열만들기
        // 중복없음

        int[] su = new int[6];
        int count = 4;
        int temp = 0;

        boolean boo = true;
        
        while (boo) {
            
            int a = (int) (Math.random() * 10);
            if(a < 1 || a > 6) {
                continue;                
            }  
            su[5]=a;

            if (a < 1 || a > 6) {
                continue;                
            } else {
                for(int i=5;i>=0;i--){                
                    for(int j=i-1;j>=0;j--){
                        if(su[i] != su[j]){
                            su[j]=a;
                            

                        }
                        System.out.print(" "+su[i]);
                    }
                    
                                        
                    count--;                    
                    if (count ==0) {
                        boo = false;
                    }
                    
                    break;
                }
                

            }
        }

    }

}