package test;

import java.io.FileOutputStream;
import java.util.*;

public class Test16 {

	public static void main(String[] args) {
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		int[][] answer = new int[2][2];
		
		int num =0;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				arr1[i][j] = ++num;
						
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				arr2[i][j] = ++num;
				
			}
		}
		
		int a =arr1[0][1]+arr2[0][1];
		System.out.println(a);
		
//		for(int i=0;i<arr1.length;i++){
//			for(int j=0;j<arr1.length;j++){
//				
//				answer[i][j]= arr1[i][j]+arr2[i][j];
//			}
//		}
//		System.out.print(Arrays.toString(answer));
	}

}
