package com.bit.day12;

public class Ex05 {

	public static void main(String[] args) {
		String msg= "2";		

		int[] arr={1,2,3,4,5};
		
		try{
			int su = Integer.parseInt(msg);
			System.out.println(arr[su]);
		}catch(NumberFormatException e){
			
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(Exception e){
			
		}// catch 부모클래스가 밑에 있어야 함
		
		
	}

}
