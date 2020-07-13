package com.bit.emp;

import java.sql.*;

public class Emp02Update {

	public int update(int sabun,String name,int pay){
		String sql="{call emp02update(?,'"+name+"',"+pay+","+sabun+")}";
		CallableStatement cstmt=null;
		try {
			cstmt = Oracle.getConnection().prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.INTEGER);
			cstmt.execute();
			return cstmt.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(cstmt!=null)cstmt.close();
				if(Oracle.getConnection()!=null)Oracle.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	public static void main(String[] args) {

	}

}
