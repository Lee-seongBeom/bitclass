package com.bit.day21;

import java.io.File;

public class Ex07 {

	public static void main(String[] args) {

		String path="test\\ex";
		File file =new File(path);
//		file.mkdir();
//		file.delete();
		file.mkdirs();
//		file.deleteOnExit();
	}

}
