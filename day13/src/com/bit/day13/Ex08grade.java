package com.bit.day13;

public class Ex08grade {
	public static void main(String[] args) {
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		
		String title="�л������������α׷� (ver 0.1.0)";
		String menu="\n1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		String data="�й�\t����\t����\t����\t�հ�\t���";
		data+="\n---------------------------------------------\n";
		
		
//		String input="";
		int input=0;
		int cnt=0;
		System.out.print(title);
		
		
		while(true){
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0){break;}
			else if(input == 1){
				System.out.println(data);
			}else if(input ==2){
				cnt++;
				System.out.print("����>>");
				int kor=sc.nextInt();
				System.out.print("����>>");
				int eng=sc.nextInt();
				System.out.print("����>>");
				int math=sc.nextInt();
				
				int sum = kor+eng+math;
				
				double avg=sum*100/3/100.0;
				
				data+=(cnt+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\n");
			}
			if(input==3){
				System.out.print("�й�>>");
				int num =sc.nextInt();
				
				System.out.print("����>>");
				int kor=sc.nextInt();
				System.out.print("����>>");
				int eng=sc.nextInt();
				System.out.print("����>>");
				int math=sc.nextInt();
				
				int sum = kor+eng+math;
				
				double avg=sum*100/3/100.0;
				
				String msg=num+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg;
				
				int idx = data.indexOf("\n"+num); // ���ϴ� ��ȣ�� �ִ� �ε�����ȣ ��
				
				String data1 = data.substring(0,idx+1); // 2�� �Է��ϸ�  ó������ ����+2 ������ 
				String data2 = data.substring(data.indexOf("\n",idx+1)); // ����+(2+1)���� ������
				data=data1+msg+data2; // �� ���̿� �����ϰ����ϴ� msg �� �ִ°����� �����ϴ°�
			}
			if(input==4){
				
				System.out.print("�й�>>");
				int num =sc.nextInt();
				
				int idx = data.indexOf("\n"+num); // ���ϴ� ��ȣ�� �ִ� �ε�����ȣ ��
				
				String data1 = data.substring(0,idx+1); //�պκ�
				String data2 = data.substring(data.indexOf("\n",idx+1)); // ����num��° +1 =>> ã�����ϴ� ������ ������ ã��
				data=data1+data2;
				
			}
		
			
			
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
