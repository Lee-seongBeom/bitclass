package com.bit.day12;

public class PersonNumber {

	public static void main(String[] args) {

		// �ֹι�ȣ�Է� :090226-3124567
		// >> ����� 00�� �����Դϴ�.

		// �ֹι�ȣ�Է�:990206-2124567
		// >> ����� 00�� �����Դϴ�.

		// �ֹι�ȣ�Է�:9902062124567
		// >> �Է������� �ٽ�Ȯ���ϼ���(000000-0000000)

		// �ֹι�ȣ�Է�:990206-212456
		// >> �ֹι�ȣ �ڸ����� �ٽ� Ȯ���ϼ���
		
		String msg = null;
		
		while (true) {

			System.out.print("�ֹι�ȣ �Է� : ");
			java.util.Scanner sc1 = new java.util.Scanner(System.in);

			msg = sc1.nextLine();
			
			//����Ȯ��------------------------------------------
			
			if(msg.length()!=14){
				System.out.println("�ڸ����� �ٽ� Ȯ���ϼ���.");
				continue;
			}else if(msg.charAt(6)!='-'){
				System.out.println("�Է������� �ٽ� Ȯ���ϼ���(000000-0000000)");
				continue;
			}

			boolean boo =false;
			
			for(int i=0; i<msg.length();i++){
				if(i==6){
					continue;
					}
				if(!(msg.charAt(i)>='0' && msg.charAt(i)<='9')){
					boo = true;
				}
			}
			
			if(boo == true){
				continue;
			}
			
//			-----------------------------------------------------
			
			// msg ="200206-3234567";

			char year1 = msg.charAt(0);// '0'
			char year2 = msg.charAt(1);// '9'

			char gender = msg.charAt(7);

			int year = (year1 - '0') * 10 + (year2 - '0');
			if (gender == '3' || gender == '4') {
				System.out.print("����� " + (2020 - (2000 + year) + 1) + "�� ");
			} else if (gender == '1' || gender == '2') {
				System.out.print("����� " + (2020 - (1900 + year) + 1) + "�� ");
			}

			if (gender == '1' || gender == '3') {
				System.out.println(" �����Դϴ�.");
				break;
			} else if (gender == '2' || gender == '4') {
				System.out.println(" �����Դϴ�.");
				break;
			}

		}

	}

}
