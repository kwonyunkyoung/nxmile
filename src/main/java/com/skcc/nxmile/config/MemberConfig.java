package com.skcc.nxmile.config;

import com.skcc.nxmile.controller.MemberController;
import com.skcc.nxmile.repository.IMemberRepository;
import com.skcc.nxmile.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {

    @Autowired
    public IMemberRepository iMemberRepository;

    @Bean
    public MemberController memberController(){
        return new MemberController(memberService());
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(iMemberRepository);

    }
}
