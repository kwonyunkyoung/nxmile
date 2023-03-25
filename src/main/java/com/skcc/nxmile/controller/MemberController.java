package com.skcc.nxmile.controller;

import com.skcc.nxmile.domain.Member;
import com.skcc.nxmile.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    @ResponseBody
    // @ModelAttribute 생략
    public String createForm(Member form) {
        return "ok";
    }

    @GetMapping(value = "/new")
    public String createForm() {
        return "createMemberForm";
    }

    @PostMapping(value = "/new")
    @ResponseBody
    // @ModelAttribute 생략
    public Member create(Member form) {

        Member member = new Member();
        member.setName(form.getName());

        return  memberService.save(member);
    }

}