package com.bit.day25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex07grade {

	public static void main(String[] args) {
		
		String path="data3.bin";
		File file = new File(path);
		
		try {
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc =new Scanner(System.in);
		String title="�л������Է� ���α׷� ver 0.3.0";
		String bar = "";
		String input = null;
		for(int i=0;i<title.length();i++){
			bar+="---";
		}
		
		System.out.println(title);
		System.out.println(bar);
		System.out.println();
		System.out.println();
		
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		DataInputStream dis =null;
		DataOutputStream dos = null;
		
		while(true){
			
			System.out.print("\n1.���� 2.�Է� 3.���� 4.���� 0.���� >>");
			input = sc.nextLine();
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				break;
				
			}else if(input.equals("1")){
				System.out.println(bar);
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println(bar);
				
				try {
					fis = new FileInputStream(file);
					dis = new DataInputStream(fis);
					
					while(true){
						int num = dis.readInt();
						String name = dis.readUTF();
						int kor = dis.readInt();
						int eng = dis.readInt();
						int math = dis.readInt();
						
						System.out.print(num+"\t");
						System.out.print(name+"\t");
						System.out.print(kor+"\t");
						System.out.print(eng+"\t");
						System.out.print(math+"\n");
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (EOFException e) {
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						if (dis != null)
							dis.close();
						if (fis != null)
							fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("\n\n");
				
				
			}else if(input.equals("2")){
				System.out.print("�й� >>");
				int num= Integer.parseInt(sc.nextLine());
				
				System.out.print("�̸� >>");
				String name = sc.nextLine();
				
				System.out.print("���� >>");
				int kor= Integer.parseInt(sc.nextLine());
				
				System.out.print("���� >>");
				int eng= Integer.parseInt(sc.nextLine());
				
				System.out.print("���� >>");
				int math= Integer.parseInt(sc.nextLine());
				
				try {
					
					fis = new FileInputStream(file);
					dis = new DataInputStream(fis);

					// ���������� �о����
					ArrayList<Integer> nums = new ArrayList<Integer>();
					ArrayList<String> names = new ArrayList<String>();
					ArrayList<Integer> kors = new ArrayList<>();
					ArrayList<Integer> engs = new ArrayList<>();
					ArrayList<Integer> maths = new ArrayList<>();
					try {
						while (true) {
							nums.add(dis.readInt());
							names.add(dis.readUTF());
							kors.add(dis.readInt());
							engs.add(dis.readInt());
							maths.add(dis.readInt());
						}
						
					} catch (EOFException e) {}
					fos = new FileOutputStream(file);
					dos = new DataOutputStream(fos);
					
					// ���������� �պκ����� �ۼ�
					
					for(int i =0;i<nums.size();i++){
						dos.writeInt(nums.get(i));
						dos.writeUTF(names.get(i));
						dos.writeInt(kors.get(i));
						dos.writeInt(engs.get(i));
						dos.writeInt(maths.get(i));
					}
					
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						if(dos!=null)dos.close();
						if(fos!=null)fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
				
			}else if(input.equals("3")){
				
				
			}
			
		}
	}

}