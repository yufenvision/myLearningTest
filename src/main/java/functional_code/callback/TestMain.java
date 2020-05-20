package functional_code.callback;

/**
 * @Author: dyf
 * @Date: 2020/5/14 15:58
 * @Description:
 */
public class TestMain {
    public static void main(String[] args){
        Student student = new Student("小李");
        Teacher teacher1 = new Teacher("王老师", student, "语文作业");
        Teacher teacher2 = new Teacher("李老师", student, "数学作业");
        teacher1.say();
        teacher2.say();
    }
}
