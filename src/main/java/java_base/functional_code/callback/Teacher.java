package java_base.functional_code.callback;

/**
 * @Author: dyf
 * @Date: 2020/5/14 15:49
 * @Description:
 */
public class Teacher implements Callback {
    private String name;
    private String result;

    public Teacher(String name, Student s, String homework) {
        this.name = name;
        s.doHomework(this, homework);
    }

    @Override
    public void result(String result) {
        this.result = result;
    }

    public void say(){
        System.out.println(name + "说：" + result);
    }
}
