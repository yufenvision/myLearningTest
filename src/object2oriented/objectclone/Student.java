package object2oriented.objectclone;

import java.io.*;
import java.util.function.Function;

/**
 * @Author: dyf
 * @Date: 2019/7/24 21:43
 * @Description: 对象克隆
 */
public class Student implements Cloneable, Serializable{
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

    /*
    大家知道，Java可以把对象序列化写进一个流里面，反之也可以把对象从序列化流里面读取出来，但这一进一出，这个对象就不再是原来的对象了，就达到了克隆的要求。
    通过把对象写进ByteArrayOutputStream里，再把它读取出来。注意这个过程中所有涉及的对象都必须实现Serializable接口，由于涉及IO操作，这种方式的效率会比前面的低。
     */
    public Student serializableClone() throws IOException, ClassNotFoundException {
        Student clone;

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        clone = (Student) oi.readObject();

        return clone;
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

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Teacher teacher = new Teacher("张老师本尊", 40);
        Student student = new Student("小明本尊", 16, teacher);
        Student clone = (Student) student.ShallowClone();
//        Student clone = (Student) student.deepClone();
//        Student clone = (Student) student.serializableClone();

        System.out.println(clone == student);
        System.out.println(clone.equals(student));
        System.out.println(getAdress.apply(student.getName()) + "  |  " + getAdress.apply(student.getPassword()) + "  |  " + getAdress.apply(student.getTeacher()));
        System.out.println(getAdress.apply(clone.getName()) + "  |  " + getAdress.apply(clone.getPassword()) + "  |  " + getAdress.apply(clone.getTeacher()));
        System.out.println(student);
        System.out.println(clone);

        System.out.println("克隆对象做出改变================================");
        clone.setName("克隆学生");//为什么包装类型设置值后，引用就变了？
        clone.setPassword(123);//为什么包装类型设置值后，引用就变了？
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
