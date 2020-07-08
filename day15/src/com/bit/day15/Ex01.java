package com.bit.day15;

public class Ex01 {

   public static void main(String[] args) {

      java.util.Scanner sc = new java.util.Scanner(System.in);

      while (true) {

         System.out.print("주민번호를 입력해주세요>>");
         String input = sc.nextLine();
         String gender = null;
         char X = input.charAt(0);

         if(input.length() == 14 && input.substring(6, 7).equals("-")){
            
            if (X>= '0' && X <= '9') {

               String frontNum = input.substring(0, 2);
               String genderNum = input.substring(7, 8);
               int year = 0;
               if (genderNum.equals("1") || genderNum.equals("3")) {
                  gender = "남성";
               } else if (genderNum.equals("2") || genderNum.equals("4")) {
                  gender = "여성";
               } else {
                  System.out.println("뒷자리를 다시 확인해주세요");
                  continue;
               }

               if (genderNum.equals("1") || genderNum.equals("2")) {
                  year = 120;
               } else if (genderNum.equals("3") || genderNum.equals("4")) {
                  year = 20;
               }
               System.out.println(input);
               System.out.println("당신의 나이는 "
                     + (year - Integer.parseInt(frontNum) + 1) + "세 "
                     + gender + "입니다.");
               break;

            } else {

               String frontNum1 = input.substring(0, 1);
               String frontNum2 = input.substring(1, 2);
               String genderNum = input.substring(7, 8);
               int year = 0;
               int a = 0;
               int b = 0;

               if (frontNum1.equals("일")) {
                  a = 10;
               } else if (frontNum1.equals("이")) {
                  a = 20;
               } else if (frontNum1.equals("삼")) {
                  a = 30;
               } else if (frontNum1.equals("사")) {
                  a = 40;
               } else if (frontNum1.equals("오")) {
                  a = 50;
               } else if (frontNum1.equals("육")) {
                  a = 60;
               } else if (frontNum1.equals("칠")) {
                  a = 70;
               } else if (frontNum1.equals("팔")) {
                  a = 80;
               } else if (frontNum1.equals("구")) {
                  a = 90;
               } else if (frontNum2.equals("공")) {
                  a = 0;
               }

               if (frontNum2.equals("일")) {
                  b = 1;
               } else if (frontNum2.equals("이")) {
                  b = 2;
               } else if (frontNum2.equals("삼")) {
                  b = 3;
               } else if (frontNum2.equals("사")) {
                  b = 4;
               } else if (frontNum2.equals("오")) {
                  b = 5;
               } else if (frontNum2.equals("육")) {
                  b = 6;
               } else if (frontNum2.equals("칠")) {
                  b = 7;
               } else if (frontNum2.equals("팔")) {
                  b = 8;
               } else if (frontNum2.equals("구")) {
                  b = 9;
               } else if (frontNum2.equals("공")) {
                  b = 0;
               }

               if (genderNum.equals("일") || genderNum.equals("삼")) {
                  gender = "남성";
               } else if (genderNum.equals("이") || genderNum.equals("사")) {
                  gender = "여성";
               } else {
                  System.out.println("뒷자리를 다시 확인해주세요");
                  continue;
               }

               if (genderNum.equals("일") || genderNum.equals("이")) {
                  year = 120;
               } else if (genderNum.equals("삼") || genderNum.equals("사")) {
                  year = 20;
               }
               System.out.println(input);
               System.out.println("당신의 나이는 " + (year - (a + b) + 1) + "세 "
                     + gender + "입니다.");
               break;

            }
            
         }else if(input.length()!=14 || !(input.substring(6,7).equals("-"))){
          System.out.println("주민번호를 확인해주세요. (000000-0000000)");
         }
      }
   }

}