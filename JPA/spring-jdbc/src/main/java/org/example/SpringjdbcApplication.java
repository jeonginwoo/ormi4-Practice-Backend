package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//        (exclude = {DataSourceAutoConfiguration.class})
public class SpringjdbcApplication {

    //https://github.com/spring-projects/spring-framework/blob/main/spring-jdbc/src/test/java/org/springframework/jdbc/core/JdbcTemplateTests.java

    public static void main(String[] args) {
        SpringApplication.run(SpringjdbcApplication.class, args);
    }
}
