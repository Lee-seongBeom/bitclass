package test;

public class Ex01 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true){
			System.out.print("종료하려면 0번 , 단수를 입력>>");
			int input = sc.nextInt();
			
			if(input ==0){
				System.out.println("구구단 종료");
				break;
			}else{
				for(int i=1;i<=9;i++){
					System.out.println(input+"x"+i+"="+(input*i));
				}
			}
		}
		
		
	}
}
