package src.com.bit.day09;

public class Ex03 {

    //default 생성자는 접근제한자가 public
    
    final int su;//필드의 초기화
    final static int su2=33;
    Ex03(int a){

        // 객체는 ()괄호를 사용함으로써 이미 생성됨 
        // 객체 생성 시점에 하고 싶은 일
        // 해당 생성자의 호출은 객체 생성 시 단 한번만 이루어짐
        ///////////////////////////////////////////////////
        // 필;드의 초기화
        su = a;
    }

    public static void main(String[] args){
        // 상수형 변수 final  
   
        final int a; // final -> 더이상 값을 바꿀 수 없음
        a = 1111;  //변수 초기화
   
      //  a=2222; //변수 대입
        final double PI = 3.14;  // 이름은 대문자로만 작성하는것이 암묵적 약속
       
        Ex03 me = new Ex03(8888);
        Ex03 you = new Ex03(9999);


         
        System.out.println(me.su);
        System.out.println(you.su);
        
        System.out.println(a);
        System.out.println(PI);

    }
}