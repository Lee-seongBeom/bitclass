package com.bit.day25;

import java.io.*;
import java.util.*;


public class Ex07 {

	public static void main(String[] args) {
		
		String path = "grade.txt";
		File file = new File(path);
		
		FileWriter fw =null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		ArrayList<String> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		if(file.exists()){
			try {
//				file.createNewFile();
				
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				
				int cnt =0;
				while(true){
					byte[] by = null;
					char[] buf = null;
					String num,name,kor,eng,math;
					System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
					String input = sc.nextLine();

					if(input.equals("0")){
						
						System.out.println("이용해주셔서 감사");
						break;
					}else if(input.equals("1")){
						for(int i=0;i<cnt;i++){
							System.out.println(data);
						}
					}else if (input.equals("2")) {

						while(true){
							
							buf =new char[5]; 
							by = new byte[5]; 
							String[] stu = new String[5];
							System.out.print("학번>>");
							stu[0] = sc.nextLine();
							System.out.print("이름>>");
							stu[1] = sc.nextLine();
							System.out.print("국어>>");
							stu[2] = sc.nextLine();
							System.out.print("영어>>");
							stu[3] = sc.nextLine();
							System.out.print("수학>>");
							stu[4] = sc.nextLine();
							
							by = stu[0].getBytes();
							by = stu[1].getBytes();
							by = stu[2].getBytes();
							by = stu[3].getBytes();
							by = stu[4].getBytes();
							
							data.add(cnt,stu[0]);
							data.add(cnt,stu[1]);
							data.add(cnt,stu[2]);
							data.add(cnt,stu[3]);
							data.add(cnt,stu[4]);
							pw.println(data);
							cnt++;
							if(by!=null){break;}
							
							
							pw.write(buf,0,5);
							bw.newLine();
							
						}
						
									
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if(pw!=null)pw.close();
					if(fw!=null)fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
