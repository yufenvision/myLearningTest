package io.object2byte;

import java.io.Serializable;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/28 14:31
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -2045252388780114447L;
    private String name;
    private Integer age;
    private Integer sex;

    public Student(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
