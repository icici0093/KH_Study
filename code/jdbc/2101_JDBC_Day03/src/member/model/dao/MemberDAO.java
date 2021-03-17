package member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import member.model.vo.Member;

public class MemberDAO {
	public MemberDAO() {} // 기본 생성자
	
	public List<Member> selectList(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM MEMBER ORDER BY ENROLL_DATE ASC";
		ArrayList<Member> list = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			System.out.println("======== rset : " + rset);
			if(rset != null) {
				list = new ArrayList<Member>();
				while(rset.next()) {
					Member mem = new Member();
					mem.setMemberId(rset.getString("MEMBER_ID"));
					mem.setMemberPwd(rset.getString("MEMBER_PWD"));
					mem.setMemberName(rset.getString("MEMBER_NAME"));
					mem.setGender(rset.getString("GENDER"));
					mem.setEmail(rset.getString("EMAIL"));
					mem.setAge(rset.getInt("AGE"));
					mem.setPhone(rset.getString("PHONE"));
					mem.setHobby(rset.getString("HOBBY"));
					mem.setAddress(rset.getString("ADDRESS"));
					mem.setEnrollDate(rset.getDate("ENROLL_DATE"));
					list.add(mem);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return list;
	}
	
	public Member selectOneById(String inputMemberId, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, inputMemberId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setGender(rset.getString("GENDER"));
				member.setEmail(rset.getString("EMAIL"));
				member.setAge(rset.getInt("AGE"));
				member.setPhone(rset.getString("PHONE"));
				member.setHobby(rset.getString("HOBBY"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return member;
	}

	public List<Member> selectOneByName(String inputMemberName, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE ?";
		ArrayList<Member> list = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, '%'+inputMemberName+'%'); // ? 부분
			rset = pstmt.executeQuery();
			if(rset != null) {
				list = new ArrayList<Member>();
				while(rset.next()) {
					Member member = new Member();
					member.setMemberId(rset.getString("MEMBER_ID"));
					member.setMemberPwd(rset.getString("MEMBER_PWD"));
					member.setMemberName(rset.getString("MEMBER_NAME"));
					member.setGender(rset.getString("GENDER"));
					member.setEmail(rset.getString("EMAIL"));
					member.setAge(rset.getInt("AGE"));
					member.setPhone(rset.getString("PHONE"));
					member.setHobby(rset.getString("HOBBY"));
					member.setAddress(rset.getString("ADDRESS"));
					member.setEnrollDate(rset.getDate("ENROLL_DATE"));
					list.add(member);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list; // 한번에 10개의 값
	}

	public int insertMember(Member member, Connection conn) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?,?,SYSDATE)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getPhone());
			pstmt.setString(8, member.getAddress());
			pstmt.setString(9, member.getHobby());
			result = pstmt.executeUpdate(); // INSERT가 성공했을 때 성공한 행의 개수를 리턴
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	public int updateMember(Member member, Connection conn) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE MEMBER SET MEMBER_PWD = ?, EMAIL = ?, PHONE = ?, ADDRESS = ? WHERE MEMBER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberPwd());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getAddress());
			pstmt.setString(5, member.getMemberId());
			result = pstmt.executeUpdate(); // 중요!
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int deleteMember(String inputMemberId, Connection conn) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM MEMBER WHERE MEMBER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, inputMemberId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	

	
	

}
