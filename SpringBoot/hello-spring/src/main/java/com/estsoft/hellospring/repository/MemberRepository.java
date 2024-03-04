package com.estsoft.hellospring.repository;

import com.estsoft.hellospring.controller.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPA
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> { // Member : entity, Long : id
}
