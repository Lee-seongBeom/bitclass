package com.bit.day21;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("경로 입력>>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String path=input;
		File file = new File(path);
		if(file.exists()){
			String[] temp=file.list();
			
			
			
			String[] dirs = new String[temp.length+2];
			dirs[0]=".";
			dirs[1]="..";
			System.arraycopy(temp, 0,dirs , 2, temp.length);
			
			for(int i=0;i<dirs.length;i++){
				String filename =dirs[i];
				File f = new File(filename);
				long time = f.lastModified();
				Date day= new Date(time);
				
				SimpleDateFormat sdf = new SimpleDateFormat();
				sdf.applyPattern("YYYY-MM-dd a hh:mm");
				String msg = sdf.format(day);
				System.out.print(msg+"\t");

				if(f.isDirectory()){
					System.out.print("<DIR>\t");
				}else{
					System.out.print("    " +f.length()+"\t");
				}
				System.out.println(dirs[i]);
				
			}
			
		}else{
			System.out.println("err");
		}
		
		
		
		
		////////////////////////////////
//		Scanner sc = new Scanner(System.in);
//		System.out.print("경로를 입력>>");
//		String input = sc.nextLine();
//
//		String path = input;
//		File file = new File(path);
//		String[] dirs = file.list();
//
//		
//		Date dayTime = new Date(file.lastModified());
//		System.out.print(dayTime.getYear()+1900+"-"+(dayTime.getMonth()+1)+"-"+dayTime.getDay()+"  "
//				+dayTime.getHours()+":"+dayTime.getMinutes()+"  ");
//
//		if (file.isFile()) {
//			System.out.print("    ");
//		} else if (file.isDirectory()) {
//			System.out.print("<DIR>");
//		}
//		
//		System.out.println("\t" + file.getPath());
//		
//		String path2= input+".";
//		File file2=new File(path2);
//		
//		Date dayTime2 = new Date(file2.lastModified());
//		System.out.print(dayTime2.getYear()+1900+"-"+(dayTime2.getMonth()+1)+"-"+dayTime2.getDay()+"  "
//				+dayTime2.getHours()+":"+dayTime2.getMinutes()+"  ");
//
//		if (file2.isFile()) {
//			System.out.print("    ");
//		} else if (file2.isDirectory()) {
//			System.out.print("<DIR>");
//		}
//		
//		System.out.println("\t" + file2.getPath());
//		
//		
//		
//		for (int i = 0; i < dirs.length; i++) {
//			Date dayTime3= new Date(dirs[i].hashCode());
//			
//			System.out.print(dayTime3.toLocaleString()+"  ");
//			
//			System.out.println(dirs[i]);
//		}
//		

	}

}
