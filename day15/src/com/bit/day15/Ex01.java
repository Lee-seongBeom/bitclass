package com.bit.day15;

public class Ex01 {

   public static void main(String[] args) {

      java.util.Scanner sc = new java.util.Scanner(System.in);

      while (true) {

         System.out.print("�ֹι�ȣ�� �Է����ּ���>>");
         String input = sc.nextLine();
         String gender = null;
         char X = input.charAt(0);

         if(input.length() == 14 && input.substring(6, 7).equals("-")){
            
            if (X>= '0' && X <= '9') {

               String frontNum = input.substring(0, 2);
               String genderNum = input.substring(7, 8);
               int year = 0;
               if (genderNum.equals("1") || genderNum.equals("3")) {
                  gender = "����";
               } else if (genderNum.equals("2") || genderNum.equals("4")) {
                  gender = "����";
               } else {
                  System.out.println("���ڸ��� �ٽ� Ȯ�����ּ���");
                  continue;
               }

               if (genderNum.equals("1") || genderNum.equals("2")) {
                  year = 120;
               } else if (genderNum.equals("3") || genderNum.equals("4")) {
                  year = 20;
               }
               System.out.println(input);
               System.out.println("����� ���̴� "
                     + (year - Integer.parseInt(frontNum) + 1) + "�� "
                     + gender + "�Դϴ�.");
               break;

            } else {

               String frontNum1 = input.substring(0, 1);
               String frontNum2 = input.substring(1, 2);
               String genderNum = input.substring(7, 8);
               int year = 0;
               int a = 0;
               int b = 0;

               if (frontNum1.equals("��")) {
                  a = 10;
               } else if (frontNum1.equals("��")) {
                  a = 20;
               } else if (frontNum1.equals("��")) {
                  a = 30;
               } else if (frontNum1.equals("��")) {
                  a = 40;
               } else if (frontNum1.equals("��")) {
                  a = 50;
               } else if (frontNum1.equals("��")) {
                  a = 60;
               } else if (frontNum1.equals("ĥ")) {
                  a = 70;
               } else if (frontNum1.equals("��")) {
                  a = 80;
               } else if (frontNum1.equals("��")) {
                  a = 90;
               } else if (frontNum2.equals("��")) {
                  a = 0;
               }

               if (frontNum2.equals("��")) {
                  b = 1;
               } else if (frontNum2.equals("��")) {
                  b = 2;
               } else if (frontNum2.equals("��")) {
                  b = 3;
               } else if (frontNum2.equals("��")) {
                  b = 4;
               } else if (frontNum2.equals("��")) {
                  b = 5;
               } else if (frontNum2.equals("��")) {
                  b = 6;
               } else if (frontNum2.equals("ĥ")) {
                  b = 7;
               } else if (frontNum2.equals("��")) {
                  b = 8;
               } else if (frontNum2.equals("��")) {
                  b = 9;
               } else if (frontNum2.equals("��")) {
                  b = 0;
               }

               if (genderNum.equals("��") || genderNum.equals("��")) {
                  gender = "����";
               } else if (genderNum.equals("��") || genderNum.equals("��")) {
                  gender = "����";
               } else {
                  System.out.println("���ڸ��� �ٽ� Ȯ�����ּ���");
                  continue;
               }

               if (genderNum.equals("��") || genderNum.equals("��")) {
                  year = 120;
               } else if (genderNum.equals("��") || genderNum.equals("��")) {
                  year = 20;
               }
               System.out.println(input);
               System.out.println("����� ���̴� " + (year - (a + b) + 1) + "�� "
                     + gender + "�Դϴ�.");
               break;

            }
            
         }else if(input.length()!=14 || !(input.substring(6,7).equals("-"))){
          System.out.println("�ֹι�ȣ�� Ȯ�����ּ���. (000000-0000000)");
         }
      }
   }

}