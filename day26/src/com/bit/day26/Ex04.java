package com.bit.day26;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) {

		InputStream is = null;
		InputStreamReader isr =null;
		BufferedReader br= null;
		OutputStreamWriter osw =null;
		BufferedWriter bw= null;
		PrintWriter pw = null;
		
		char[] cbuf =new char[5];
		try {
//			is = new FileInputStream("test01.txt");
//			isr =new InputStreamReader(is);
			isr =new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw);
			
//			int su=-1;
			String msg=null;
			while((msg=br.readLine())!=null){
//				System.out.print((char)su);
//				System.out.print(new String(cbuf,0,su));
//				System.out.println(msg);
				
//				osw.write(msg);
//				osw.write("\n");
				
//				bw.write(msg);
//				bw.newLine();
				
				pw.println(msg);
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
