import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDAO {
	public static void main(String [] args) {
		// 1. 드라이버 등록, Class.forName()
		// 2. DBMS 연결 생성, DriverManager.getConnection(url,id,pwd)
		// 3. Statement 생성 connection.createStatement()
		// 4. 쿼리문 실행 statement.executeQuery(query)
		// 5. 결과값 받기 ResultSet rset
		// 6. 자원해제 close()
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student", "student");
			stmt = conn.createStatement(); // 3 
			rset = stmt.executeQuery("SELECT * FROM MEMBER"); // 4. 쿼리문 실행
			
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				System.out.println("아이디 : " + memberId + "비번 : " + memberPwd + 
						"이름 : " + memberName);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
