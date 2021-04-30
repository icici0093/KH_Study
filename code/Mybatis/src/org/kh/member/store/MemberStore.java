package org.kh.member.store;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.domain.Member;

public interface MemberStore {
	public Member selectMemberOne(SqlSession session, Member member);
	public Member selectMemberOneById(SqlSession session, String userId);
}
