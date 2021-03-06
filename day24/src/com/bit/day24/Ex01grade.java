package com.bit.day24;

import java.io.*;
import java.util.*;

public class Ex01grade {

	public static void main(String[] args) {
		String path = "data.bin";
		ArrayList<HashMap<String, String>> data = new ArrayList<>();
		
		// Map 활용 성적관리프로그램
			
		//data loading
		File loadFile = new File(path);
		FileInputStream fis = null;
		
		ArrayList<Byte> buf=new ArrayList<>();

		if (loadFile.exists()) {
			try {
				fis = new FileInputStream(loadFile);

				while (true) {
					int su = fis.read();
					if (su == -1) {
						break;
					}
					buf.add((byte) su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			Object[] obj = buf.toArray();
			
			byte[] by = new byte[obj.length];

			for(int i=0;i<by.length;i++){
				by[i]=(byte)obj[i];
			}
			
			String msg = new String(by);
			System.out.println(msg);
			String[] msgs = msg.split("\n");
			for(int i=0;i<msgs.length;i++){
				String temp = msgs[i];
				String[] ele = temp.split(",");
				
				HashMap<String, String> map = new HashMap<>();
				
				map.put("num", ele[0]);
				map.put("name", ele[1]);
				map.put("kor", ele[2]);
				map.put("eng", ele[3]);
				map.put("math", ele[4]);
				data.add(map);
			}
			
		}
		
		///////////
		System.out.println("성적관리프로그램 (ver 0.2.2");
		System.out.println("--------------------------------\n");

		// HashMap<Integer, Object[]> data2 =null;
		// HashMap<Integer, Student> data3 =null;
		// HashMap<Integer, HashMap<String,Object>> data4 =null;

		Scanner sc = new Scanner(System.in);

		String input = null;
		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
			input = sc.nextLine();

			if (input.equals("0")) {
				// save

				File file = new File(path);
				String tempDate = "";
				FileOutputStream fos = null;
				//파일에 데이터를 작성하기 위해 먼자 파일이 존재하지 않으면 파일 생성

				if (!file.exists()) {
					
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					//파일에 데이터를 쉽게 작성하기위해
					//데이터를 문자열로 가공
//					추후 문자열을 읽어드릴때
//					얼마만큼 나눠서 읽어드릴지 결정하기위해
//					한 학생은 \n을 기준으로
//					한학생의 각 데이터(학번,이름,국,영,수)는 , 를 기준으로
					
					for (int i = 0; i < data.size(); i++) {
						HashMap<String, String> stu = data.get(i);
						String num = stu.get("num");
						String name = stu.get("name");
						String kor = stu.get("kor");
						String eng = stu.get("eng");
						String math = stu.get("math");
						tempDate += num + "," + name + "," + kor + "," + eng
								+ "," + math + "\n";
					}
				}
				
				try {
					fos = new FileOutputStream(file);
					
					byte[] su = tempDate.getBytes();
					for (int i = 0; i < su.length; i++) {
						fos.write((int) su[i]);
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (fos != null) {
							fos.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				System.out.println("이용해줘서 감사");
				break;
			} else if (input.equals("1")) {

				System.out.println("--------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("--------------------------------------");
				for (int i = 0; i < data.size(); i++) {
					HashMap<String, String> stu = data.get(i);
					int num = Integer.parseInt(stu.get("num"));
					String name = stu.get("name");
					int kor = Integer.parseInt(stu.get("kor"));
					int eng = Integer.parseInt(stu.get("eng"));
					int math = Integer.parseInt(stu.get("math"));
					int total = kor + eng + math;
					double avg = total * 100 / 3 / 100.0;
					System.out.print(num + "\t");
					System.out.print(name + "\t");
					System.out.print(kor + "\t");
					System.out.print(eng + "\t");
					System.out.print(math + "\t");
					System.out.print(total + "\t");
					System.out.println(avg);

				}
				System.out.println("--------------------------------------");

			} else if (input.equals("2")) {
				HashMap<String, String> stu = new HashMap<String, String>();
				System.out.print("학번>>");
				stu.put("num", sc.nextLine());
				System.out.print("이름>>");
				stu.put("name", sc.nextLine());
				System.out.print("국어>>");
				stu.put("kor", sc.nextLine());
				System.out.print("영어>>");
				stu.put("eng", sc.nextLine());
				System.out.print("수학>>");
				stu.put("math", sc.nextLine());
				data.add(stu);

			} else if (input.equals("3")) {
				System.out.print("수정할 학번>>");
				input = sc.nextLine();
				for (int i = 0; i < data.size(); i++) {
					HashMap<String, String> stu = data.get(i);
					if (input.equals(stu.get("num"))) {
						stu.put("num", input);
						System.out.print("이름>>");
						stu.put("name", sc.nextLine());
						System.out.print("국어>>");
						stu.put("kor", sc.nextLine());
						System.out.print("영어>>");
						stu.put("eng", sc.nextLine());
						System.out.print("수학>>");
						stu.put("math", sc.nextLine());
						break;
					}
				}

			} else if (input.equals("4")) {
				System.out.print("삭제할 학번>>");
				input = sc.nextLine();
				for (int i = 0; i < data.size(); i++) {
					HashMap<String, String> stu = data.get(i);
					if (input.equals(stu.get("num"))) {
						data.remove(i);
						break;
					}
				}

			} else {
				System.out.println(" 입력오류 \n 다시확인하고 입력하세요,");
			}

		}

	}
}
