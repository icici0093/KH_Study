package member.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;

public class MemberService {
	
	private JDBCTemplate prepareConnection;
	
	public MemberService() {
		prepareConnection = JDBCTemplate.getConnection(); // 초기화는 생성자에서 하는 것이 원칙 !
	}

	public List <Member> printAll() {
		// JDBCTemplate을 이용해서 연결을 생성
		// 생성한 연결을 DAO에 넘겨줌 
		// => 결론적으로 DAO에서는 연결을 생성하는 코드가 빠짐!
		MemberDAO mDao = new MemberDAO();
		List <Member> list = null;
		Connection conn = null;
		try {
			conn = prepareConnection.createConnection();
			System.out.println("======== conn : " + conn);
			list = mDao.selectList(conn);
			System.out.println("======= DAO list : " + list.isEmpty());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return list; // 다른 곳으로 보내주는 역할 
		
	}

	public Member printOne(String inputMemberId) {
		MemberDAO mDao = new MemberDAO();
		Member member = null;
		Connection conn = null;
		try {
			conn = prepareConnection.createConnection();
			System.out.println("======== conn : " + conn);
			member = mDao.selectOneById(inputMemberId, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public List<Member> printOneByNAme(String inputMemberName) {
		MemberDAO mDao = new MemberDAO();
		List<Member> list = null;
		Connection conn = null;
		try {
			conn = prepareConnection.createConnection();
			list = mDao.selectOneByName(inputMemberName, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.insertMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.updateMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	public int deleteMember(String inputMemberId) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.deleteMember(inputMemberId, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
	//회원탈퇴기능 
	// MEMBER테이블에서 데이터를 삭제한 후에 
	// RETIRE_MEMBER 테이블에 데이터를 삽입하도록 만들었다고 가정 

	
	// Service에서 DAO 호출한 후에 DELETE문을 수행, 그리고 DAO에서 커밋
	// Service에서 DAO 호출한 후에 INSERT문을 수행, 그리고 DAO에서 커밋 
	
	// 만약 DELETE문을 수행하고 DAO에서 커밋한 후에 
	// INSERT문을 수행하고 DAO 커밋을 하려고 하는데 INSERT문에서 오류 발생 
	// DELETE문이 ROLLBACK 불가 
	// ==> DAO에서 커밋을 하면 ROLLBACK불가 상황 발생 
	// DAO에서 바로 커밋을 하지 않고 Service 커밋/롤백을 넘긴다. 
	
	// DELETE 성공 여부와 INSERT 성공 여부를 확인한 후에 COMMIT을 할 수 있게 됨.
	
//	public int deleteMember(Member member) {
//		MemberDAO mDao = new MemberDAO();
//		Connection conn = null;
//		int result = 0;
//		int result2 = 0;
//		
//		try {
//			conn = prepareConnection.createConnection();
//			result = mDao.deleteMember(member.getMemberId(), conn);
//			result2 = mDao.insertReMember(member, conn);
//			if(result > 0 && result2 > 0) {
//				JDBCTemplate.commit(conn);
//			}else {
//				JDBCTemplate.rollback(conn);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
}
