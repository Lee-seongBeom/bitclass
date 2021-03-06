package com.bit.Day0622_1;

import java.sql.*;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex02 {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";

		String sql="select * from test01 order by deptno desc";

		Connection conn =null;
		Statement stmt =null;
		java.sql.ResultSet rs =null;
		
		oracle.jdbc.driver.OracleDriver driver =null;
		driver =new OracleDriver();
		//두줄없이 new OracleDriver(); 가능
		java.util.Properties prop= new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		
		
		try {
			conn=DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			
			rs= stmt.executeQuery(sql);

			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
