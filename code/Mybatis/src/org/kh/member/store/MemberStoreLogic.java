package org.kh.member.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.domain.Member;

public class MemberStoreLogic implements MemberStore{

	@Override
	public Member selectMemberOne(SqlSession session, Member member) {
		Member mem = session.selectOne("MemberMapper.loginMember", member);
		return mem;
	}

	@Override
	public Member selectMemberOneById(SqlSession session, String userId) {
		Member member = session.selectOne("MemberMapper.selectOneMember", userId);
		return member;
	}

	public ArrayList<Member> selectAllList(SqlSession session) {
		List<Member> mList = session.selectList("MemberMapper.selectAllMember");
		return (ArrayList<Member>)mList;
	}
	// searchType과 searchKeyword 두개를 Map에 담아서 쿼리문에서 사용하도록 함
	// selectList에서 사용할 수 있는 매개변수가 1개 뿐이기 때문..
	public ArrayList<Member> selectSearchList(SqlSession session, HashMap<String, String> searchMap) {
		List<Member> mList = session.selectList("MemberMapper.selectSearchList", searchMap);
		return (ArrayList<Member>)mList;
	}
	
	public int insertMember(SqlSession session, Member member) {
		int result = session.insert("MemberMapper.insertMember", member);
		return result;
	}

	public int updateMember(SqlSession session, Member member) {
		int result = session.update("MemberMapper.updateMember", member);
		return result;
	}

	public int deleteMember(SqlSession session, Member mem) {
		int result = session.delete("MemberMapper.deleteMember", mem);
		return result;
	}



}
