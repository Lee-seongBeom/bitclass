package test;

import java.util.Arrays;


public class StudentVer1 {
	
	public static void main(String[] args){
		String[] part = new String[5];
		String[] comp = new String[part.length-1];
		
		part[0]="a1";
		part[1]="a2";
		part[2]="a3";
		part[3]="a4";
		part[4]="a5";
		String temp ="";
		
		for (int i = 0; i < comp.length; i++) {
			for(int j=i+1;j<comp.length;j++){
				int ran = (int) ((Math.random() * comp.length) + 1);
				if(comp[i].equals(comp[j])){
					j--;
					continue;
				}else{
					comp[i] = part[ran];
				}
				
			}
			
//			System.out.print(ran + " ");

		}
		
		System.out.println(Arrays.toString(comp));
		
	}
	
}
