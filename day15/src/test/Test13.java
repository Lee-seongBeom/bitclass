package test;

public class Test13 {

	public static void main(String[] args) {
		String msg = "1234568";
		boolean boo = true;
		
		if(msg.length()>=4 && msg.length()<=6){
			
			
			
			int cnt= 0;
			for(int i=0;i<msg.length();i++){
				if(msg.charAt(i)>='0' && msg.charAt(i)<='9'){
					cnt++;
				}
			}
			
			if(cnt==msg.length()){
				boo = true;
			}else{
				boo = false;
			}
			System.out.println(boo);
			
			
		}
		
	}

}
