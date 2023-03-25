package com.skcc.nxmile.service;

import com.skcc.nxmile.domain.Member;
import com.skcc.nxmile.repository.IMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private IMemberRepository memberRepository;

    public Member save (Member member){

        return memberRepository.save(member);
    }


}
