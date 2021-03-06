package com.bit.day13;

class Student{
   int num;
   String name;
   int kor,eng,math;
   
   Student(int num){
      this.num=num;
   }
}

public class Ex08grade4 {

   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      
      System.out.print("총원>>");
      int max=Integer.parseInt(sc.nextLine());
      Student[] data = new Student[max];
      int cnt=0;
      
      while(true){
         System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
         String input =sc.nextLine();
         if(input.equals("0")){
            System.out.println("종료되었습니다.");
            break;
         }else if(input.equals("1")){

            System.out.println("\n----------------------------------------");
            System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
            System.out.println("---------------------------------------");
            for(int i=0;i<data.length;i++){
               Student stu=data[i];
               if(stu==null){
                  continue;
               }
               
               System.out.print(stu.num+"\t");
               System.out.print(stu.name+"\t");
               System.out.print(stu.kor+"\t");
               System.out.print(stu.eng+"\t");
               System.out.print(stu.math+"\t");
               System.out.println((stu.kor+stu.eng+stu.math)*100/3/100);
            }
            
         }else if(input.equals("2") && (cnt)<max){
            Student stu=new Student(++cnt);
            
            System.out.print("이름>>");
            stu.name=sc.nextLine();
            System.out.print("국어>>");
            stu.kor =Integer.parseInt(sc.nextLine());
            System.out.print("영어>>");
            stu.eng =Integer.parseInt(sc.nextLine());
            System.out.print("수학>>");
            stu.math =Integer.parseInt(sc.nextLine());
            
            data[cnt-1] = stu;            
            
         }else if(input.equals("3")){
            System.out.print("수정할 학번을 입력하세요.>>");
            int num =Integer.parseInt(sc.nextLine());
            Student stu=new Student(num);
            
            System.out.print("이름>>");
            stu.name=sc.nextLine();
            System.out.print("국어>>");
            stu.kor =Integer.parseInt(sc.nextLine());
            System.out.print("영어>>");
            stu.eng =Integer.parseInt(sc.nextLine());
            System.out.print("수학>>");
            stu.math =Integer.parseInt(sc.nextLine());
            
            data[num-1]=stu;
            
         }else if(input.equals("4")){
            System.out.print("삭제할 학번을 입력하세요.>>");
            int num =Integer.parseInt(sc.nextLine());
            data[num-1]=null;
         }
      }
      
   }

}