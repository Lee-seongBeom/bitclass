package com.bit.day11;

public class Test {
    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);

       // int n = in.nextInt();
        String input = in.next();
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            sum += input.charAt(i) - '0';
            System.out.println(sum);
        }

       

    }
    
}