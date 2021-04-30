package org.kh.member.service;

import org.kh.member.domain.Member;

public interface MemberService {

	public Member printMemberOne(Member member);
	public Member printMemberOneById(String userId);
}
