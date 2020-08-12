package bitJeju.Studentmodel;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class StuDao {

	Connection conn=null;
	
	java.util.logging.Logger log=Logger.getGlobal();

	public StuDao() throws SQLException{
		
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		conn=DriverManager.getConnection(url,user,password);
	}
	
	
	// 회원 정보 모두
	public ArrayList<StuDto> selectAll() throws SQLException{
		
		ArrayList<StuDto> list= new ArrayList<StuDto>();
		
		String sql="select * from stuData";
		
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				StuDto bean=new StuDto();
				bean.setHakbun(rs.getInt("hakbun"));
				bean.setName(rs.getString("name"));
				bean.setId(rs.getString("id"));
				bean.setPw(rs.getString("pw"));
				bean.setPhoneNumber(rs.getInt("phoneNumber"));
				bean.setLev(rs.getInt("lev"));
				bean.setClassCode(rs.getInt("classCode"));
				bean.setGradeJava(rs.getInt("gradeJava"));
				bean.setGradeWeb(rs.getInt("gradeWeb"));
				bean.setGradeFrame(rs.getInt("gradeFrame"));
				
				list.add(bean);
				
				log.info(bean.toString());
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}

	public int selectOne(String id) throws SQLException{
		
		String sql="select hakbun from stuData where id = ?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int result=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()){
				result=rs.getInt("hakbun");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		System.out.println("result: "+result);
		return result;
		
	}
	// 회원 가입시 
	public void signUp(String name,String id,String pw,int phoneNumber) throws SQLException{
		//hakbun->seq.nextval  1.name  2.id  3.pw  4.phoneNumber int lev,int classCode,int gradeJava,int gradeWeb,int gradeFrame 
		String sql="insert into stuData (hakbun,name,id,pw,phoneNumber) values (stuData_seq.nextval,?,?,?,?)";
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,id);
			pstmt.setString(3,pw);
			pstmt.setInt(4,phoneNumber);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	
	/*
	//회원가입 완료
	public ArrayList<StuDto> signUpFinish(int hakbun) throws SQLException{
		
		ArrayList<StuDto> list=new ArrayList<StuDto>();
		String sql="select * from stuData where hakbun=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, hakbun);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				StuDto bean=new StuDto();
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setHakbun(rs.getInt("hakbun"));
				bean.setPw(rs.getString("pw"));
				bean.setPhoneNumber(rs.getInt("phoneNumber"));
				
				list.add(bean);
				log.info(list.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
		return list;
	}*/
	
	
	// 로그인 시
	public StuDto login(String id,String pw){

		String sql="select * from stuData where id=? and pw=?";
		
		StuDto bean=new StuDto();
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery();
			if(rs.next()){
//			hakbun,id,name,phoneNumber,lev
				bean.setHakbun(rs.getInt("hakbun"));
				bean.setId(rs.getString("id"));
				bean.setPw(rs.getString("pw"));
				bean.setName(rs.getString("name"));
				bean.setPhoneNumber(rs.getInt("phoneNumber"));
				bean.setLev(rs.getInt("lev"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	
	
	
}















