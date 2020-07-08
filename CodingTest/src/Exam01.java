
import java.util.*;

public class Exam01 {

	public static class Student{
		String num;
		
		int kor;
		int eng;
		int math;
		
		String name;
		
		public int sum(){
			return kor+eng+math;
		}
		
		public double avg(){
			return sum()*100/3/100.0;
		}
	}
	
	public static void main(String[] args) {
		DB db =new DB();
		
		ArrayList list =new ArrayList();
		
		System.out.println("학생성적관리프로그램(ver 1.0.0)");

		Scanner sc= new Scanner(System.in);
		
		while(true){
			System.out.print("1.전체 2.상세 3.입력 4.수정 5.삭제 0.종료>");
			String input = sc.nextLine();
			
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(input.equals("1")){ //전체보기
				System.out.println("학번\t이름\t국어\t영어\t수학"
						+ "\n-------------------------------------");
				
				for(int i=0;i<list.size();i++){
					System.out.print(list.get(i)+"\t");
					
					if(i%7==4){
						i+=2;
						System.out.println();
					}
				}
				
			}else if(input.equals("2")){ //상세보기
				System.out.print("학번>");
				String inputNum2 = sc.nextLine();
				for(int i=0;i<list.size();i++){
					if(inputNum2.equals(list.get(i))){
						System.out.print("학번>"+inputNum2+"\t");
						i++;
						System.out.println("이름:"+list.get(i++));
						
						System.out.print("국어:"+list.get(i++)+"\t");
						System.out.print("영어:"+list.get(i++)+"\t");
						System.out.println("수학:"+list.get(i++));
						
						System.out.println("총점:"+list.get(i++));
						System.out.println("평균:"+list.get(i));
						break;
					}
				}
				
			}else if(input.equals("3")){ //입력
				Student stu = new Student();
				System.out.print("학번 >>");
				stu.num = sc.nextLine();
				list.add(stu.num);

				System.out.print("이름 >>");
				stu.name = sc.nextLine();
				list.add(stu.name);
				
				System.out.print("국어 >>");
				stu.kor = Integer.parseInt(sc.nextLine());
				list.add(stu.kor);
				
				System.out.print("영어 >>");
				stu.eng = Integer.parseInt(sc.nextLine());
				list.add(stu.eng);
				
				System.out.print("수학 >>");
				stu.math = Integer.parseInt(sc.nextLine());
				list.add(stu.math);
				
				list.add(stu.sum());
				
				list.add(stu.avg());
				
			}else if(input.equals("4")){ //수정
				System.out.print("수정할 학번입력>");
				String inputNum4 = sc.nextLine();
				for(int i=0;i<list.size();i++){
					if(inputNum4.equals(list.get(i))){
						Student stu = new Student();
						i+=2;
						System.out.print("국어>");
						stu.kor = Integer.parseInt(sc.nextLine());
						
						System.out.print("영어>");
						stu.eng = Integer.parseInt(sc.nextLine());
						
						System.out.print("수학>");
						stu.math = Integer.parseInt(sc.nextLine());
						
						list.set(i++,stu.kor);
						list.set(i++,stu.eng);
						list.set(i++,stu.math);
						list.set(i++,stu.sum());
						list.set(i++,stu.avg());
						break;
					}
				}
			}else if(input.equals("5")){ //삭제
				System.out.print("삭제할 학번입력>");
				String inputNum5 = sc.nextLine();
				
				loop:
				for(int i=0;i<list.size();i++){
					if(inputNum5.equals(list.get(i))){
						for(int j=0;j<7;j++)list.remove(i);
						break loop;
					}
				}
			}else{
				System.out.println("0부터 5까지 숫자만 입력해주세요.");
			}
			
		}

	}

}





















