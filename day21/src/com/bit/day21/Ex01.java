package com.bit.day21;

import java.io.*;
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		//io
		// File
		
		//���� ��� (��� ��θ� ����)
//		String path ="C:\\JavaWorkspace\\day21\\src";
//		String path ="C:\\JavaWorkspace\\day21\\test";
//		String path ="C:\\JavaWorkspace\\day21\\test01.txt";
		
		
		//��� ��� (�ִ� ��ġ�κ����� ���)
//		String path ="test01.txt";
//		String path =".\\test01.txt";
//		String path ="..\\day21\\test01.txt";
//		String path ="..\\day21\\src";
		String path =".";
		
		File file=new File(path);
		
		System.out.println("������ �����ϴ°�? "+file.exists());
		System.out.println("�����ΰ�? "+file.isFile());
		System.out.println("���丮�ΰ�? "+file.isDirectory());
		System.out.println("�̸���? "+file.getName());
		System.out.println("location��? "+file.getPath());
		System.out.println("�ܼ� �����δ�? "+file.getAbsolutePath());  
		try {
			System.out.println("�Ϲ� �����δ�? "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		System.out.println("Path��? " +file.getParentFile());
		System.out.println("rwx r�б����? " +file.canRead());
		System.out.println("rwx w�������? " +file.canWrite());
		System.out.println("rwx x�������? " +file.canExecute());
		System.out.println("size? " +file.length()+"byte");
		System.out.println("���������ð�? "+new Date(file.lastModified()));
		String[] dirs = file.list();
		for(int i=0; i<dirs.length; i++){
			System.out.println(dirs[i]);
		}
		System.out.println(Arrays.toString(dirs));
		
		
	}

}


















