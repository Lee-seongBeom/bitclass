package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String prefix = "AABBCCDDEEFFGG";
		String suffix = ".txt";
		try {
			File file = File.createTempFile(prefix, suffix);	// 烙矫 历厘颇老 积己
			System.out.println(file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}
