package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/spring")
    @ResponseBody
    public Person spring() {
        return new Person("name", 1);
    }
}
