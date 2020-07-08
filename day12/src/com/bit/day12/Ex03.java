package com.bit.day12;

public class Ex03 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		String msg="9ㅁ";
		int[] arr=new int[10];
		
		try {
			int su = Integer.parseInt(msg);
			double su2 = 10.0 / su;
			arr[su] = (int) su2;
			System.out.println("10/" + msg + "=" + su2);
		} catch (NumberFormatException e) {
			System.out.println("숫자로만 입력하세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위 밖으로 호출하였습니다.");
		}

	}

}
