package com.estsoft.hellospring.config;

import com.estsoft.hellospring.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MyConfigTest {

    // test 세부 단위
    //      * unit test
    //      * Integration test
    @Test
    void configTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        HelloController helloController = (HelloController) ac.getBean("helloController");  // getBean : 선언된 빈들을 가져올 수 있음.
        HelloController helloController2 = (HelloController) ac.getBean("helloController");

        assertTrue(helloController == helloController2);    // false면 testcase 실패

        String[] beans = ac.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println("bean : " + bean);
        }
    }
}