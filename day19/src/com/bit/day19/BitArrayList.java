package com.bit.day19;

public class BitArrayList {
	
//  처리 성능은 떨어지지만 열람 기능이 우수
//	장점 : read
//	단점 : insert, update, delete
	

	private Object[] arr;
	
	public BitArrayList(){
		arr=new Object[0];
	}
	
	public void add(Object su){
		Object[] temp =new Object[arr.length+1];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr=temp;
		arr[arr.length-1]=su;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
	
	public int size(){
		return arr.length;
	}
}