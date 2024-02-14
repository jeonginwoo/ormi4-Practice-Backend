package ch10_제네릭.wildcard;

import java.util.Arrays;

public class WildCardExample {

    public static void registerCourse(Course<?> course) {    //모든 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {    //학생 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {    // 직장인과 일반인 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생1"));
        personCourse.add(new Student("학생2"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인1"));
        workerCourse.add(new Worker("일반인1"));
        workerCourse.add(new Worker("일반인2"));
        workerCourse.add(new Worker("일반인3"));
        workerCourse.add(new Worker("직장인2"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생1"));
        studentCourse.add(new Student("학생2"));
        studentCourse.add(new Student("학생3"));
        studentCourse.add(new HighStudent("고등학생2"));
        studentCourse.add(new HighStudent("고등학생3"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생1"));
        highStudentCourse.add(new HighStudent("고등학생2"));
        highStudentCourse.add(new HighStudent("고등학생3"));
        highStudentCourse.add(new HighStudent("고등학생4"));
        highStudentCourse.add(new HighStudent("고등학생5"));

        // 모든 과정 등록 가능
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        // 학생 과정만 등록 가능
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        // 직장인과 일반인 과정만 등록 가능
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);

    }
}
