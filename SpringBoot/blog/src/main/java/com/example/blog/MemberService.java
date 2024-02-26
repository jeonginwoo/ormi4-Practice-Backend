package com.example.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;  // 빈 주입

    public List<Member> getAllMembers() {
        return memberRepository.findAll();    // 멤버 목록 얻기
    }

    public void test() {
        // 1. 생성(Create)
        memberRepository.save(new Member(1L, "길동"));

        // 2. 조회(Read)
        Optional<Member> member = memberRepository.findById(1L);	// 단건 조회
        List<Member> memberList = memberRepository.findAll();		// 전체 조회

        // 3. 삭제(Delete)
        memberRepository.deleteById(1L);
    }
}