package com.bit.dept.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Dept04Test {

	public static void main(String[] args) {
		try {
			Dept04Dao dao=new Dept04Dao();
			System.out.println("connection: "+(dao.conn!=null));
			// Run java application
			// list
			dao=new Dept04Dao();
			ArrayList<Dept04Dto> list =dao.selectAll();
			System.out.println("list: "+(list!=null));
			System.out.println("list size 예상치:5    결과치 :"+(list.size()));
			
//			for(Dept04Dto bean:list){
//				System.out.println(bean);
//			}
			
			///// insert
			dao=new Dept04Dao();
			int result= dao.insertOne("tester1", "test1");
			System.out.println("insert: "+result);
			
			// max
			dao=new Dept04Dao();
			int max=dao.maxDeptno();
			System.out.println("최근 입력deptno max = "+max);
			
			//update
			dao=new Dept04Dao();
			Dept04Dto target=new Dept04Dto(max,"edit1","edit2");
			result = dao.updateOne(target.getDeptno(), target.getDname(), target.getLoc());
			System.out.println("update: "+ (result>0));
			
			//detail
			dao=new Dept04Dao();
			Dept04Dto dto=dao.selectOne(max);
			System.out.println("수정 예상치: "+target);
			System.out.println("수정 결과치: "+dto);
			System.out.println("update2:  "+(target.equals(dto)));
			///// delete
			dao=new Dept04Dao();
			result=dao.deleteOne(6);
			System.out.println("delete : "+(result>0)); // result는 수행의 개수  cnt느낌
			
			//count
			dao=new Dept04Dao();
			result= dao.rowCount();
			System.out.println("row 5? : "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}








