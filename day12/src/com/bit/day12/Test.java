package com.bit.day12;

public class Test {

	public static void main(String[] args) {
		// �ֹι�ȣ�Է� :090226-3124567
		// >> ����� 00�� �����Դϴ�.

		// �ֹι�ȣ�Է�:990206-2124567
		// >> ����� 00�� �����Դϴ�.

		// �ֹι�ȣ�Է�:9902062124567
		// >> �Է������� �ٽ�Ȯ���ϼ���(000000-0000000)

		// �ֹι�ȣ�Է�:990206-212456
		// >> �ֹι�ȣ �ڸ����� �ٽ� Ȯ���ϼ���
		while (true) {
			System.out.print("�ֹι�ȣ�Է�: ");
			// String msg = "200226-3124567";
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String msg = sc.nextLine();
			char[] arr = msg.toCharArray();
			if (arr[6] == '-' && arr.length == 14 ) {
				
				
				int[] ju1 = new int[6];
				int[] ju2 = new int[7];

				for (int i = 0; i < ju1.length; i++) {

					ju1[i] = arr[i] - '0';
				}

				for (int i = 0; i < ju2.length; i++) {

					ju2[i] = arr[i + ju1.length + 1] - '0';

				}

				int age = 0;
				int age12 = 120 - (ju1[0] * 10 + ju1[1]) + 1;
				int age34 = 20 - (ju1[0] * 10 + ju1[1]) + 1;
				if (ju2[0] == 1 || ju2[0] == 2) {
					age = age12;
				} else if (ju2[0] == 3 || ju2[0] == 4) {
					age = age34;
				}

				String gender = "";
				if (ju2[0] == 1 || ju2[0] == 3) {
					gender = "����";
				} else if (ju2[0] == 2 || ju2[0] == 4) {
					gender = "����";
				}

				System.out.println("����� " + age + "�� " + gender + "�Դϴ�. ");
				break;
			} else {
				System.out.println("����");
			}

		}

	}

}
