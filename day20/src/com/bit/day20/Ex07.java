package com.bit.day20;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		Map map1=new HashMap();
		//key�� �ߺ��� �Ұ���
		//value�� �ߺ��� ����
		//���� Ű -> null
		
		map1.put("key1","val1");
		map1.put("key2","val2");
		map1.put("key3","val3");
		map1.put(1234,"val4");
		map1.put(true,"True!");
		map1.put(false,"false!");
		map1.put(null,"abcd");
		
		System.out.println(map1.get(null));
		

	}
}