package com.bit.day20;

import java.util.ArrayList;
import java.util.List;

class Lec11<T>{
	T obj;
	
	void setObj(T obj){
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
	
	void func(List<? extends Number> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}


public class Ex11 {

	public static void main(String[] args) {
//		ArrayList<String> list =new ArrayList<String>();
		ArrayList<Integer> list =new ArrayList<>();
		Lec11<Number> lec=new Lec11();
		list.add(213);
		lec.func(list);
		
//		ArrayList<Object> list =new ArrayList<>();
//		Lec11<String> lec=new Lec11();
//		list.add("abc");
//		lec.func(list);
		
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(123);
//		Lec11<Number> lec=new Lec11();
//		lec.func(list);
//
		
		// Lec11<?> -> ���ϵ� Ÿ�� ( ���⿡ ���� Ÿ���� ������ ���� ����)
		// <?(�ڽ�) super Number(�θ�)>  =>>  Number ���� ���� (Number�� Object ����)
		// <? extends Number> =>>  Number ���� �Ʒ��� (Integer�� Double ����)
	}
}
