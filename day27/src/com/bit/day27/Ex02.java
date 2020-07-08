package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		java.net.URL url = null;
		// url
		
		// 프로토콜://호스트:포트번호/패스?쿼리#지시자
//		String spec = "https://gwanghwamun.seoul.go.kr/main.do";
		String spec = "http://www.jejusi.go.kr/sijang/sijangHistory.do";
//		String spec = "https://naver.com";
		
		try {
			url = new URL(spec);
			System.out.println("프로토콜:   "+url.getProtocol());
			System.out.println("도메인 or IP:   "+url.getHost());
			// http - default port:80
			// https - default port:443
			System.out.println("포트번호:   "+url.getPort());
			System.out.println("디폴트 포트번호:   "+url.getDefaultPort());
			System.out.println("path경로:   "+url.getPath());
			System.out.println("url쿼리:   "+url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
