package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		java.net.URL url = null;
		// url
		
		// ��������://ȣ��Ʈ:��Ʈ��ȣ/�н�?����#������
//		String spec = "https://gwanghwamun.seoul.go.kr/main.do";
		String spec = "http://www.jejusi.go.kr/sijang/sijangHistory.do";
//		String spec = "https://naver.com";
		
		try {
			url = new URL(spec);
			System.out.println("��������:   "+url.getProtocol());
			System.out.println("������ or IP:   "+url.getHost());
			// http - default port:80
			// https - default port:443
			System.out.println("��Ʈ��ȣ:   "+url.getPort());
			System.out.println("����Ʈ ��Ʈ��ȣ:   "+url.getDefaultPort());
			System.out.println("path���:   "+url.getPath());
			System.out.println("url����:   "+url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
