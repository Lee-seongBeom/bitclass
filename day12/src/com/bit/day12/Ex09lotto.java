package com.bit.day12;

public class Ex09lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int cnt = 0;

		try {
			while (true) {
				lotto[cnt++] = (int) (Math.random() * 45) + 1;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("배열이 넘어갔습니다");
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
