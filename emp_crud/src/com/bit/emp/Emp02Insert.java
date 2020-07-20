package com.bit.emp;

import java.sql.*;

public class Emp02Insert {

	public void insert(int sabun,String name,int pay){
		//sql = {call ���ν�����}
		String sql="{call emp02insert("+sabun+",'"+name+"',"+pay+")}";
		Connection conn=null;
		CallableStatement cstmt=null;
		try{
			conn=Oracle.getConnection();
			cstmt=conn.prepareCall(sql);
			cstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
				try {
					if(cstmt!=null)cstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		Emp02Insert me = new Emp02Insert();
		me.insert(6666,"tester6" , 6000);
		System.out.println("�Է¿Ϸ�,,");
	}

}







