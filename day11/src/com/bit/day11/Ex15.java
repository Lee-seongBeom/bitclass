package com.bit.day11;

class Lec15{

    public void func01(){
        System.out.println("Lec15 func01,..,");

    }
}
public class Ex15 extends Lec15{

   
    public void func01(){
        System.out.println("Ex15 func01.,.,.");

    }

    public void func02(){
        System.out.println("Ex15 func02.,.,.");

    }


    
    public static void main(String[] args) {
        
        // Lec15 me =new Ex15();  // 실제 객체는 Ex15 기 때문에 Lec15 me = new Ex15(), Ex15 me =new Ex15() 가 같음
        // me.func01();

        // 다형성
        Lec15 me =new Ex15();
        me.func01();

        Ex15 you = (Ex15)me;
        Lec15 me2 =you; // 부모타입은 자식타입이 자동형변환이 가능하지만 반대로 자식타입에 부모타입을 받으려면 강제형변환이 필요함
        you.func02();

        System.out.println("------------------------------");

        // Integer su = new Integer(1234);
        // Double su = new Double(3.14);

        Number su =new Integer(1234);
        Number su1 =new Double(3.14);
        Number su2 = 1234;
        Number su3 = 3.14;
        System.out.println("su = "+su);
        System.out.println("su1= "+su1);
        System.out.println("su2= "+su2);
        System.out.println("su3= "+su3);

        func03(3);
        func03(3.14);
        func03("aa");
        func03('A');

    }
    public static void func03(Object a){
        System.out.println(a);
    }
}