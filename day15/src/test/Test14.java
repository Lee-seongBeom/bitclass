package test;

import java.util.*;

public class Test14 {

	public static void main(String[] args) {
		// 배열 i번째 수 부터 j번재 수까지 자르고 정렬했을 때
		// k번째에 있는 수 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] arr ={1,5,2,6,3,7,4};
		System.out.println("숫자 입력-");
		int i =sc.nextInt();
		int j= sc.nextInt();
		int[] arrCopy = new int[j-i+1];
		
		System.out.println(i+"번째 숫자부터 "+j+"번째 숫자까지");
		
		System.arraycopy(arr, i-1, arrCopy, 0, j-1);
		Arrays.sort(arrCopy);
		
		System.out.println(Arrays.toString(arrCopy));

		int k=sc.nextInt();
		int k1 =arrCopy[k-1];
		System.out.println(k1);
		
		
	}

}
