package mmms.member.db;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connecttion getConnection() {
		
		con"jdbc:oracle:thin:@localhost:1521:orcl"
	}
	
	
	
	
	
	
	//transaction 처리 메소드
	public static void commit(Connection con) {
		try {
			con.commit();//insert,update,delete
		} catch (SQLException e) {
		
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();//insert,update,delete
		} catch (SQLException e) {
			
		}
	}
}
