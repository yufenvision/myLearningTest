package java_base.functional_code.callback;

import java.util.Random;

/**
 * @Author: dyf
 * @Date: 2020/5/14 15:49
 * @Description:
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void doHomework(Callback callback, String homework){
        int time = new Random().nextInt(50);
        String result = name + "花了" + time + "分钟，完成了" + homework;
        callback.result(result);
    }
}
