package com.bit.day14;

public class Ex15 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		
//		System.out.println(arr1.toString());
		System.out.println("arr1 : "+java.util.Arrays.toString(arr1));
//		
//		int[] arr2= new int[arr1.length];
//		for(int i=0;i<arr2.length;i++){
//			arr2[i]=arr1[i];
//		}
//		int[] arr2= new int[2];
//		for(int i=0;i<arr2.length;i++){
//			arr2[i]=arr1[i+1];
//		}
//		System.out.println("arr2 : "+java.util.Arrays.toString(arr2));
//		----------------------------------------
//		int[] arr3= new int[arr1.length];
//		System.arraycopy(arr1, 1, arr3, 2, 2);

//		int[] arr3= new int[2];
//		System.arraycopy(arr1, 1, arr3, 0, 2);
//
//		System.out.println("arr3 : "+java.util.Arrays.toString(arr3));
//		-------------------------------------------
//		
//		int[] arr4= java.util.Arrays.copyOf(arr1, 2);
		int[] arr4= java.util.Arrays.copyOfRange(arr1, 1, 3);
		
		System.out.println("arr4 : "+java.util.Arrays.toString(arr4));
		
//		-------------------------------------------
		
		int[] rans = {41,2,23,10,11,28};
		java.util.Arrays.sort(rans); // 오름차순
		System.out.println(java.util.Arrays.toString(rans));
		
		System.out.println(java.util.Arrays.binarySearch(rans, 41)); // 위치 찾기  binarySearch를 하기위해선 반드시 sort를 해야 제대로 결과나옴
		
		

		
	}

}









