package org.kh.member.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.domain.Member;
import org.kh.member.store.MemberStoreLogic;

import common.SqlSessionTemplate;

public class MemberServiceImpl implements MemberService{

	@Override
	public Member printMemberOne(Member member) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member mem = new MemberStoreLogic().selectMemberOne(session, member);
		session.close();
		return mem;
	}

	@Override
	public Member printMemberOneById(String userId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member member = new MemberStoreLogic().selectMemberOneById(session, userId);
		session.close();
		return member;
	}

	public ArrayList<Member> printAllList() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> mList = new MemberStoreLogic().selectAllList(session);
		session.close();
		return mList;
	}

	public ArrayList<Member> findMemberList(HashMap<String, String> searchMap) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> mList = new MemberStoreLogic().selectSearchList(session, searchMap);
		session.close();
		return mList;
	}
	
	public int registMember(Member member) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().insertMember(session, member);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}

	public int modifyMember(Member member) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().updateMember(session, member);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result; // 잊지 말고 리턴!!
	}
	
	public int removeMember(Member mem) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().deleteMember(session, mem);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}




}
