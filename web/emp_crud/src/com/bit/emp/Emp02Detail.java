package com.bit.emp;

import java.sql.*;

import com.bit.emp.dto.Emp02Bean;

public class Emp02Detail{
	
	public Emp02Bean detail(int sabun){
		Emp02Bean bean =new Emp02Bean();
		String sql="{call emp02detail("+sabun+",?)}";
		Connection conn =null;
		CallableStatement cstmt=null;
		ResultSet rs= null;

		try {
			conn=Oracle.getConnection();
			cstmt=conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			cstmt.execute();
			rs=(ResultSet) cstmt.getObject(1);
			
			if(rs.next()){
				bean.setSabun(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setNalja(rs.getDate(3));
				bean.setPay(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)rs.close();
				if(cstmt!=null)cstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	
//	public static void main(String[] args) {
//		Emp02Detail emp = new Emp02Detail();
//		Emp02Bean bean=emp.detail(3333);
//		System.out.println(bean.getSabun());
//		System.out.println(bean.getName());
//		System.out.println(bean.getNalja());
//		System.out.println(bean.getPay());
//	}

}
