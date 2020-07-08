package com.bit.day13;

public class Ex08grade {
	public static void main(String[] args) {
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		
		String title="학생성적관리프로그램 (ver 0.1.0)";
		String menu="\n1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		String data="학번\t국어\t영어\t수학\t합계\t평균";
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
				System.out.print("국어>>");
				int kor=sc.nextInt();
				System.out.print("영어>>");
				int eng=sc.nextInt();
				System.out.print("수학>>");
				int math=sc.nextInt();
				
				int sum = kor+eng+math;
				
				double avg=sum*100/3/100.0;
				
				data+=(cnt+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\n");
			}
			if(input==3){
				System.out.print("학번>>");
				int num =sc.nextInt();
				
				System.out.print("국어>>");
				int kor=sc.nextInt();
				System.out.print("영어>>");
				int eng=sc.nextInt();
				System.out.print("수학>>");
				int math=sc.nextInt();
				
				int sum = kor+eng+math;
				
				double avg=sum*100/3/100.0;
				
				String msg=num+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg;
				
				int idx = data.indexOf("\n"+num); // 원하는 번호가 있는 인덱스번호 앞
				
				String data1 = data.substring(0,idx+1); // 2를 입력하면  처음부터 개행+2 전까지 
				String data2 = data.substring(data.indexOf("\n",idx+1)); // 개행+(2+1)부터 끝까지
				data=data1+msg+data2; // 그 사이에 수정하고자하는 msg 를 넣는것으로 수정하는것
			}
			if(input==4){
				
				System.out.print("학번>>");
				int num =sc.nextInt();
				
				int idx = data.indexOf("\n"+num); // 원하는 번호가 있는 인덱스번호 앞
				
				String data1 = data.substring(0,idx+1); //앞부분
				String data2 = data.substring(data.indexOf("\n",idx+1)); // 개행num번째 +1 =>> 찾고자하는 개행의 다음것 찾기
				data=data1+data2;
				
			}
		
			
			
		}
		
		System.out.println("이용해주셔서 감사합니다.");
	}

}
