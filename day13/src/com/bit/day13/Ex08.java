package com.bit.day13;

public class Ex08 {
	// �л������������α׷� (ver 0.1.0)
	// ���ڿ� �̿�
	
	
	// 1.����   2. �Է�   3. ����  4.����  0.����>>2

	// ����>
	// ����>
	// ����>
	
	// �й�  ����  ����  ����   �հ�  ���
	//---------------------------------
	// 1	  90	90    90    270    90
	// 2	  90	80    90    260    00
	// 3	  80	80    80    240    80
	//
	
	public static void main(String[] args) {
		
		System.out.println("�л� ���� ���� ���α׷� (ver 0.1.0) ");
		StringBuffer strInput =new StringBuffer();
		
		int cnt=1;
		boolean boo = true;
		while(boo){

			System.out.println("1.����  2.�Է�  3.����  4.����  0.����>> ");
					
			java.util.Scanner sc1 = new java.util.Scanner(System.in);
			int select = sc1.nextInt();
			
			if(select==1){
				
				System.out.println("�й�	����	����	����	�հ�	���");
				System.out.println("---------------------------------------------");
				System.out.println(strInput);
			}else if(select ==2){
				
				String name[] ={"����>","����>","����>"};
				String a;
				String input1[]=new String[3];
				int sum=0;
				strInput.append(cnt +"\t");
				for(int i=0;i<3;i++){
					System.out.print(name[i]);
					java.util.Scanner sc2 = new java.util.Scanner(System.in);
					
//					sum+=Integer.parseInt(sc2.nextLine());
					
					strInput.append("\t");
				}
				
				
				strInput.append("\n"+sum);
				strInput.append("\n");
				cnt++;
				
			}else if(select ==3){
				
			}else if(select ==4){
				
			}else if(select ==0){
				boo=false;
			}
			
			
		}
		
		
		
		System.out.println("--------------- ���α׷� ���� ---------------");
		System.out.println("�й�	����	����	����	�հ�	���");
		System.out.println("---------------------------------------------");
		System.out.println(strInput);

		
	}

}














