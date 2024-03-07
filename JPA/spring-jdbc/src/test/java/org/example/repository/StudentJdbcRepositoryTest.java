package org.example.repository;

import org.example.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@ExtendWith(SpringExtension.class)
//@DataJpaTest //need starter-jpa. so let's do with boottest
@SpringBootTest
@Transactional      //Transactional annotation rollbacks @Test methods calls
class StudentJdbcRepositoryTest {

//    @Mock
//    private JdbcTemplate jdbcTemplate;
//
//    @Test
//    public void whenMockJdbcTemplate_thenReturnCorrectStudentCount() {
//        StudentJdbcRepository sut = new StudentJdbcRepository(jdbcTemplate);
//        ReflectionTestUtils.setField(sut, "jdbcTemplate", jdbcTemplate);
//        Mockito.when(jdbcTemplate.queryForObject("SELECT COUNT(1) FROM student", Integer.class))
//                .thenReturn(1);
//
//        assertEquals(1, sut.countOfStudents());
//    }

    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @Test
    void test_countOfStudents() {
        int result = studentJdbcRepository.countOfStudents();
        Assertions.assertEquals(2, result);
    }

    @Test
    void test_selectListOfStudentName() {
    }

    @Test
    void test_insertStudent() {
        Student student = new Student();
        student.setName("아이유");
        student.setAge(30);
        studentJdbcRepository.insertStudent(student);

        List<Student> list = studentJdbcRepository.selectListOfStudent();
        Student result = list.stream().filter( x -> x.getName().equals("아이유")).findAny().orElse(null);
        Assertions.assertNotNull(result);
    }

    @Test
    void test_getStudent() {
    }

    @Test
    void test_getStudentById() {
    }

    @Test
    void test_testInsertStudent() {
    }

    @Test
    void test_selectListOfStudent() {
    }

    @Test
    void test_findStudents() {
    }

    @Test
    void test_selectStudentById() {
    }
}