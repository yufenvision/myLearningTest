package object2oriented.objectclone;

import java.util.function.Function;

/**
 * @Author: dyf
 * @Date: 2019/7/24 21:43
 * @Description: 对象克隆
 */
public class Student implements Cloneable{
    private String name;
    private Integer password;
    private Teacher teacher;

    public Student(String name, Integer password, Teacher teacher) {
        this.name = name;
        this.password = password;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    protected Object ShallowClone() throws CloneNotSupportedException {
        return super.clone();//这样是浅克隆，只会克隆student一层，不会克隆他的引用对象teacher，只会复制地址值
    }

    protected Object deepClone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.setTeacher((Teacher) s.getTeacher().clone());//这样才是深克隆，前提teacher也要实现cloneable接口，覆写clone方法
        return s;
    }



    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if(s.getName().equals(name) && s.getPassword() == password && s.getTeacher().equals(teacher))return true;
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", teacher=" + teacher +
                '}';
    }

    static Function<Object, String> getAdress = s -> s.getClass().getName() + Integer.toHexString(s.hashCode());//获取对象的地址值

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("张老师本尊", 40);
        Student student = new Student("小明本尊", 16, teacher);
//        Student clone = (Student) student.ShallowClone();
        Student clone = (Student) student.deepClone();

        System.out.println(clone == student);
        System.out.println(clone.equals(student));
        System.out.println(getAdress.apply(student.getName()) + "  |  " + getAdress.apply(student.getPassword()) + "  |  " + getAdress.apply(student.getTeacher()));
        System.out.println(getAdress.apply(clone.getName()) + "  |  " + getAdress.apply(clone.getPassword()) + "  |  " + getAdress.apply(clone.getTeacher()));
        System.out.println(student);
        System.out.println(clone);

        System.out.println("克隆对象做出改变================================");
        clone.setName("克隆学生");//为什么包装类型设置值后，地址就变了？
        clone.setPassword(123);//为什么包装类型设置值后，地址就变了？
        clone.getTeacher().setName("克隆张老师");

        System.out.println("名字一样：" + (clone.getName() == student.getName()));
        System.out.println("密码一样：" + (clone.getPassword() == student.getPassword()));
        System.out.println("老师一样：" + (clone.getTeacher() == student.getTeacher()));//克隆出来的老师依然是一样的，这是浅克隆

        System.out.println(getAdress.apply(student.getName()) + "  |  " + getAdress.apply(student.getPassword()) + "  |  " + getAdress.apply(student.getTeacher()));
        System.out.println(getAdress.apply(clone.getName()) + "  |  " + getAdress.apply(clone.getPassword()) + "  |  " + getAdress.apply(clone.getTeacher()));
        System.out.println(student);
        System.out.println(clone);

    }

}
