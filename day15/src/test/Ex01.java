package test;

public class Ex01 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true){
			System.out.print("�����Ϸ��� 0�� , �ܼ��� �Է�>>");
			int input = sc.nextInt();
			
			if(input ==0){
				System.out.println("������ ����");
				break;
			}else{
				for(int i=1;i<=9;i++){
					System.out.println(input+"x"+i+"="+(input*i));
				}
			}
		}
		
		
	}
}
