import java.sql.SQLException;
import java.util.Properties;

public class DB {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
//		String sql="insert into dept values (50,'관리부','서울')";
		
		new oracle.jdbc.driver.OracleDriver();
		
		java.sql.Connection conn =null;
		java.sql.Statement stmt =null;
		
		java.util.Properties prop=null;
		
		prop=new Properties();
		
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		
		try {
			conn = java.sql.DriverManager.getConnection(url,prop);
			stmt =conn.createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}



