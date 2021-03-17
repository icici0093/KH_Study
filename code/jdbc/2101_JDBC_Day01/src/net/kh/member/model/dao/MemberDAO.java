package net.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import net.kh.member.model.vo.Member;

public class MemberDAO {
	// 생성자
	public MemberDAO() {}
	
	// 테이블에 있는 데이터 전체를 조회하기 위해서 사용 
	public ArrayList<Member> selectList() {
		// JDBC 코딩
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null; // 데이터가 여러개이므로 배열 사용
		try {
			// 드라이브 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DBMS 연결 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student", "student");
			// sql실행을 위해 statement 생성
			stmt = conn.createStatement();
			// 쿼리문 실행 -> 결과값 받기
			rset = stmt.executeQuery("SELECT * FROM MEMBER");
			// 
			if(rset != null) {
				list = new ArrayList<Member>();
				while(rset.next()) {
					Member member = new Member();
					member.setMemberId(rset.getString("MEMBER_ID"));
					member.setMemberPwd(rset.getString("MEMBER_PWD"));
					member.setMemberName(rset.getString("MEMBER_NAME"));
					member.setGender(rset.getString("GENDER"));
					member.setAge(rset.getInt("AGE"));
					member.setEmail(rset.getString("EMAIL"));
					member.setPhone(rset.getString("PHONE"));
					member.setAddress(rset.getString("ADDRESS"));
					member.setHobby(rset.getString("HOBBY"));
					member.setEnrollDate(rset.getDate("ENROLL_DATE"));
					list.add(member);
				}
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
		return list;
	}
	
	public Member selectOneById(String memberId) {
		// JDBC 코딩
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		Member member = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student", "student");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT * FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'");
			
			if(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setGender(rset.getString("GENDER"));
				member.setAge(rset.getInt("AGE"));
				member.setEmail(rset.getString("EMAIL"));
				member.setPhone(rset.getString("PHONE"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setHobby(rset.getString("HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
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
		return member;
	}
	
	public ArrayList<Member> selectOneByName(String memberName) {
		// JDBC 코딩
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student", "student");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT * FROM MEMBER WHERE MEMBER_NAME = '" + memberName + "'");
			if(rset != null) {
				list = new ArrayList<Member>();
				while(rset.next()) {
					Member member = new Member();
					member.setMemberId(rset.getString("MEMBER_ID"));
					member.setMemberPwd(rset.getString("MEMBER_PWD"));
					member.setMemberName(rset.getString("MEMBER_NAME"));
					member.setGender(rset.getString("GENDER"));
					member.setAge(rset.getInt("AGE"));
					member.setPhone(rset.getString("PHONE"));
					member.setAddress(rset.getString("ADDRESS"));
					member.setEmail(rset.getString("EMAIL"));
					member.setHobby(rset.getString("HOBBY"));
					member.setEnrollDate(rset.getDate("ENROLL_DATE"));
					list.add(member);
				}
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
		return list;
	}

	public int insertMember(Member inputMember) {
		// TODO Auto-generated method stub
		// JDBC코딩
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student", "student");
			stmt = conn.createStatement();
			// result 에는 1,0 값이 들어감
			result = stmt.executeUpdate("INSERT INTO MEMBER VALUES('" 
										+ inputMember.getMemberId()+"',"
										+"'"+inputMember.getMemberPwd()+ "'," 
										+"'" + inputMember.getMemberName()+ "',"
										+"'" + inputMember.getGender()+ "',"
										+"'" + inputMember.getAge() + "',"
										+"'" + inputMember.getEmail() + "',"
										+"'" + inputMember.getPhone() + "',"
										+"'" + inputMember.getAddress() + "',"
										+"'" + inputMember.getHobby() + "',"
										+"SYSDATE)");
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int deleteMember(String inputMemberId) {
		// TODO Auto-generated method stub
		// JDBC 코딩
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","student");
			stmt = conn.createStatement();
			result = stmt.executeUpdate("DELETE FROM MEMBER WHERE MEMBER_ID = '" + inputMemberId+"'");
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		return result;
	}

	public int updateMember(Member modifyMember) {
		// TODO Auto-generated method stub
		// jdbc 코드
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","student");
			stmt = conn.createStatement();
			result = stmt.executeUpdate("UPDATE MEMBER SET "
					+ "MEMBER_PWD = '"+modifyMember.getMemberPwd()+"',"
					+ "EMAIL ='"+ modifyMember.getEmail() +"'," 
					+ "PHONE = '" +modifyMember.getPhone() +"',"
					+"ADDRESS ='" + modifyMember.getAddress() + "'" 
					+ "WHERE MEMBER_ID ='" + modifyMember.getMemberId()+"'");
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
