package com.skcc.nxmile.service;

import com.skcc.nxmile.domain.Member;
import com.skcc.nxmile.repository.IMemberRepository;


public class MemberService {

    private final IMemberRepository memberRepository;

    public MemberService(IMemberRepository iMemberRepository) {
        this.memberRepository = iMemberRepository;
    }

    public Member save (Member member){

        return memberRepository.save(member);
    }


}
