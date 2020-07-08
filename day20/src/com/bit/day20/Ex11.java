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
		
		// Lec11<?> -> 와일드 타입 ( 여기에 대해 타입을 결정을 아직 안함)
		// <?(자식) super Number(부모)>  =>>  Number 기준 위로 (Number나 Object 가능)
		// <? extends Number> =>>  Number 기준 아래로 (Integer나 Double 가능)
	}
}
