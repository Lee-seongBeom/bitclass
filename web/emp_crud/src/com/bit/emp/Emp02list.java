package com.bit.emp;

import java.sql.*;
import java.util.ArrayList;

import com.bit.emp.dto.Emp02Bean;

public class Emp02list {

	public ArrayList<Emp02Bean> list(){
		ArrayList<Emp02Bean> list =new ArrayList<Emp02Bean>();
		String sql="{call emp02list(?)}";
		Connection conn=null;
		CallableStatement cstmt=null;
		ResultSet rs=null;
		try {
			conn=Oracle.getConnection();
			cstmt=conn.prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			cstmt.execute();
			rs=(ResultSet) cstmt.getObject(1);
			while(rs.next()){
//				System.out.print(rs.getInt(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getDate(3)+"\t");
//				System.out.print(rs.getInt(4)+"\n");
				Emp02Bean bean = new Emp02Bean();
				
				bean.setSabun(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setNalja(rs.getDate(3));
				bean.setPay(rs.getInt(4));
				list.add(bean);
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
		return list;
	}
	public static void main(String[] args) {
		Emp02list me = new Emp02list(); 
		ArrayList<Emp02Bean> list =me.list();
		
		for(int i=0;i<list.size();i++){
			Emp02Bean bean = list.get(i);
			System.out.print(bean.getName()+"\t");
			System.out.print(bean.getNalja()+"\n");
		}
	}

}
