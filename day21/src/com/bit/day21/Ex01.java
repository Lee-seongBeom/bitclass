package com.bit.day21;

import java.io.*;
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		//io
		// File
		
		//절대 경로 (모든 경로를 전부)
//		String path ="C:\\JavaWorkspace\\day21\\src";
//		String path ="C:\\JavaWorkspace\\day21\\test";
//		String path ="C:\\JavaWorkspace\\day21\\test01.txt";
		
		
		//상대 경로 (있는 위치로부터의 경로)
//		String path ="test01.txt";
//		String path =".\\test01.txt";
//		String path ="..\\day21\\test01.txt";
//		String path ="..\\day21\\src";
		String path =".";
		
		File file=new File(path);
		
		System.out.println("파일이 존재하는가? "+file.exists());
		System.out.println("파일인가? "+file.isFile());
		System.out.println("디렉토리인가? "+file.isDirectory());
		System.out.println("이름은? "+file.getName());
		System.out.println("location는? "+file.getPath());
		System.out.println("단순 절대경로는? "+file.getAbsolutePath());  
		try {
			System.out.println("일반 절대경로는? "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		System.out.println("Path는? " +file.getParentFile());
		System.out.println("rwx r읽기권한? " +file.canRead());
		System.out.println("rwx w쓰기권한? " +file.canWrite());
		System.out.println("rwx x쓰기권한? " +file.canExecute());
		System.out.println("size? " +file.length()+"byte");
		System.out.println("최종수정시간? "+new Date(file.lastModified()));
		String[] dirs = file.list();
		for(int i=0; i<dirs.length; i++){
			System.out.println(dirs[i]);
		}
		System.out.println(Arrays.toString(dirs));
		
		
	}

}


















