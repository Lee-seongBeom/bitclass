package com.bit.day11;

import java.sql.Array;
import java.util.Arrays;

import javax.xml.ws.AsyncHandler;

public class Ex06 {
    public static void main(String[] args) {

        // 주민번호입력 :090226-3124567
        // >> 당신은 00세 남자입니다.

        // 주민번호입력:990206-2124567
        // >> 당신은 00세 여자입니다.

        // 주민번호입력:9902062124567
        // >> 입력패턴을 다시확인하세요(000000-0000000)

        // 주민번호입력:990206-212456
        // >> 주민번호 자리수를 다시 확인하세요

        while (true) {

            System.out.print("주민번호 입력 : ");
            java.util.Scanner sc1 = new java.util.Scanner(System.in);
            String msg1 = sc1.next();
            int frontNum = 0;
            int backNum = 0;
            // String[][] su11 = new String[2]

            char[] allSu = new char[14];

            for (int i = 0; i < allSu.length; i++) {
                allSu[i] = msg1.charAt(i);
            }
            if (allSu[6] == '-') {
                char[] frontSu = new char[2];// 앞 2자리
                for (int i = 0; i < 2; i++) {
                    frontSu[i] = allSu[i];
                }

                int frontSu1 = frontSu[0] - '0';
                int frontSu2 = frontSu[1] - '0';
                frontNum = frontSu1 * 10 + frontSu2;
                int year = 120 + 1;
                System.out.print(">>>당신은 " + (year - frontNum) + "세 ");

                char[] backSu = new char[7];// 뒤 1자리
                for (int i = 0; i < 1; i++) {
                    backSu[i] = allSu[i + 7];
                }

                backNum = backSu[0] - '0';
                if (backNum % 2 == 0) {
                    System.out.print("여자 입니다");
                    break;
                } else {
                    System.out.print("남자 입니다");
                    break;
                }
            } else {
                System.out.println("입력 패턴을 확인하세요 000000-0000000");
                continue;

            }

        }

    }

}