package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
		// ����ó�� (���� ȸ��)
		String msg="123�Ǥä�4";
//		for(int i=0;i<msg.length();i++){
//			if(Character.isDigit(msg.charAt(i))){
//			
//			}else{
//				System.out.println("���ڰ� �ƴ� ���ڰ� �����ϴ�.");
//				return ;
//			}
//		}
		
		try{
			System.out.println("�������� ������ �߻��Ҽ��� �ֽ��ϴ�.");
			Integer su = new Integer(msg);
			System.out.println("������ ������ �����ϴ�.");
			System.out.println("su="+su);
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println("������ ��ҽ��ϴ�.");
		}
		
		System.out.println("���α׷��� �����߾����ϴ�");
	}

}
