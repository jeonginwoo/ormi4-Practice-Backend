package com.example.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;	    // 빈 주입

    @GetMapping("/members")
    public List<Member> getAllMembers(Object o) {
        return memberService.getAllMembers();
    }
}