package com.example.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;  // 빈 주입

    public List<Member> getAllMembers() {
        return memberRepository.findAll();    // 멤버 목록 얻기
    }
}