package java2new.java8optional.lambda.stream;

import java2new.java8optional.lambda.Student;

import java.util.List;

/**
 * @Author: dyf
 * @Date: 2019/7/23 22:23
 * @Description:
 */
public class OutstandingClass {
    private String name;
    private List<Student> students;

    public OutstandingClass(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
