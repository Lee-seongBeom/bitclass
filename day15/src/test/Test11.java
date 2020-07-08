package test;

import java.util.*;

class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int su = 0;

		while (true) {
			int num = 2;

			System.out.print("숫자입력 >>");
			int input = sc.nextInt();

			while (true) {
				int cnt = 0;

				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						cnt++;
					} else {
						continue;
					}
				}
				if (cnt == 2) {
					System.out.print(num + " ");
					su++;
				}

				num++;
				if (num == input) {
					break;
				}

			}
			System.out.println("\n개수 : " + su);

		}
	}
}