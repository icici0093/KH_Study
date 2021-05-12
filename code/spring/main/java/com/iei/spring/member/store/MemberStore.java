package com.iei.spring.member.store;

import com.iei.spring.member.domain.Member;

public interface MemberStore {
	public Member selectOneMember(Member member);
	public int checkIdDup(String userId);
	public int insertMember(Member member);
	public int updateMember(Member member);
	public int deleteMember(String userId);
}
