package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

/*
 * @RestController : REST 컨트롤러 선언
 * 1. 컨트롤러 역할 : @RestController가 지정된 클래스는 Spring MVC에서 컨트롤러로 식별. 이 클래스는 HTTP 요청을 수신하고 적절한 응답을 생성하는 역할을 한다.
 * 2. Response Body 자동 반환 : @RestController가 지정된 클래스의 메서드에서 객체를 반환하면, Spring은 이 객체를 HTTP응답으로 변환한다. -> 개발자가 직접 할 필요 없이 객체 반환으로 간단하게 응답 생성
 * - RESTful 서비스를 구축하는 과정에서 HTTP 요청을 받아들이고 응답을 생성하는 컨트롤러를 정의할 수 있으며, 이때 응답으로 반환되는 객체들은 자동으로 HTTP 응답 형식으로 변환됩니다.
 * */
@RestController
public class HelloController {

    @GetMapping("/hello") // "/hello" 엔드포인트에 대한 GET 요청 매핑
    // 'name' 매개변수를 받아 처리하는 메서드
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        // @RequestParam : query parameter. GET localhost:8080/hello?name=queryparameter
        // 포맷된 인사 메시지 반환
        return String.format("Hello %s!", name);
    }

    @PostMapping("/hello") // POST 요청을 "/hello" 엔드포인트에 매핑
    public String testPost(@RequestBody String value) { // 요청 본문의 내용을 문자열로 수신
        ObjectMapper objectMapper = new ObjectMapper(); // ObjectMapper 객체를 생성 (JSON 처리를 위해)

        try {
            Person person = objectMapper.readValue(value, Person.class); // 받은 JSON 문자열을 Person 객체로 변환
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("value = " + value);
        return value;   // JSON 형태
    }
}