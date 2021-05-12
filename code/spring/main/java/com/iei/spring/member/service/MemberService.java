package com.iei.spring.member.service;

import com.iei.spring.member.domain.Member;

public interface MemberService {

	public Member loginMember(Member member);
	public int checkIdDup(String userId);
	public int registerMember(Member member);
	public int modifyMember(Member member);
	public int deleteMember(String userId);
}
