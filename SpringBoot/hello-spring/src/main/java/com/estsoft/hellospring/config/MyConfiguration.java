package com.estsoft.hellospring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 이거 없으면 스프링이 알 수 없다 (@Component 어노테이션을 통해서 빈으로 등록)
@ComponentScan(basePackages = "com.estsoft")
public class MyConfiguration {

}
