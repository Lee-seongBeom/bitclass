package test;

import java.util.*;

public class Test14 {

	public static void main(String[] args) {
		// �迭 i��° �� ���� j���� ������ �ڸ��� �������� ��
		// k��°�� �ִ� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		int[] arr ={1,5,2,6,3,7,4};
		System.out.println("���� �Է�-");
		int i =sc.nextInt();
		int j= sc.nextInt();
		int[] arrCopy = new int[j-i+1];
		
		System.out.println(i+"��° ���ں��� "+j+"��° ���ڱ���");
		
		System.arraycopy(arr, i-1, arrCopy, 0, j-1);
		Arrays.sort(arrCopy);
		
		System.out.println(Arrays.toString(arrCopy));

		int k=sc.nextInt();
		int k1 =arrCopy[k-1];
		System.out.println(k1);
		
		
	}

}