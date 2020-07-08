package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String prefix = "AABBCCDDEEFFGG";
		String suffix = ".txt";
		try {
			File file = File.createTempFile(prefix, suffix);	// 임시 저장파일 생성
			System.out.println(file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}
