package com.estsoft.hellospring.domain;

import lombok.*;

@Getter // getter
@Setter // setter
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 모든 필드값 가진 생성자
@ToString   // toString 오버라이드
public class Person {   // {"name" : "", "age" : 12}
    private String name;
    private int age;
}