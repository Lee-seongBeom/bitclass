package com.bit.day13;

public class Ex08 {
	// 학생성적관리프로그램 (ver 0.1.0)
	// 문자열 이용
	
	
	// 1.보기   2. 입력   3. 수정  4.삭제  0.종료>>2

	// 국어>
	// 영어>
	// 수학>
	
	// 학번  국어  영어  수학   합계  평균
	//---------------------------------
	// 1	  90	90    90    270    90
	// 2	  90	80    90    260    00
	// 3	  80	80    80    240    80
	//
	
	public static void main(String[] args) {
		
		System.out.println("학생 성적 관리 프로그램 (ver 0.1.0) ");
		StringBuffer strInput =new StringBuffer();
		
		int cnt=1;
		boolean boo = true;
		while(boo){

			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료>> ");
					
			java.util.Scanner sc1 = new java.util.Scanner(System.in);
			int select = sc1.nextInt();
			
			if(select==1){
				
				System.out.println("학번	국어	영어	수학	합계	평균");
				System.out.println("---------------------------------------------");
				System.out.println(strInput);
			}else if(select ==2){
				
				String name[] ={"국어>","영어>","수학>"};
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
		
		
		
		System.out.println("--------------- 프로그램 종료 ---------------");
		System.out.println("학번	국어	영어	수학	합계	평균");
		System.out.println("---------------------------------------------");
		System.out.println(strInput);

		
	}

}














