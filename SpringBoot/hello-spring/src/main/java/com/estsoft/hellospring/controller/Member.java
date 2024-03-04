package com.estsoft.hellospring.controller;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity // 데이터베이스 테이블 생성 (Member 테이블)
public class Member {   // 데이터베이스의 데이터를 가져오겠다는 목적 단 하나. Setter 필요없음.
    // insert into member (name) values ("이름");     id: 1, name: 이름
    // insert into member (name) values ("이름2");    id: 2, name: 이름2


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;        // DB 테이블의 id와 컬럼 매칭

    @Column(name = "name", nullable = false)
    private String name;    // DB 테이블의 name과 컬럼 매칭

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
