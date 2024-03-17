package com.estsoft.hellospring.service;

import com.estsoft.hellospring.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void parseProfile(String value) {
        ObjectMapper objectMapper = new ObjectMapper(); // ObjectMapper 객체를 생성 (JSON 처리를 위해)
        try {
            Person person = objectMapper.readValue(value, Person.class); // 받은 JSON 문자열을 Person 객체로 변환
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("value = " + value);
    }
}