package java_base.object2oriented.objectclone;

import java.io.Serializable;

/**
 * @Author: dyf
 * @Date: 2019/7/24 22:07
 * @Description:
 */
public class Teacher implements Cloneable,Serializable{

    private String name;
    private Integer age;

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args){
        Teacher teacher = new Teacher("哈哈",44);

    }

}
