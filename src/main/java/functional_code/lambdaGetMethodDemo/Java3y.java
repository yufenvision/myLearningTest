package functional_code.lambdaGetMethodDemo;

/**
 * @Author: dyf
 * @Date: 2020/9/16 23:04
 * @Description:
 */
public class Java3y {
    // 静态方法
    public static void MyNameStatic(String name) {
        System.out.println(name);
    }

    // 实例方法
    public void myName(String name) {
        System.out.println(name);
    }

    public String xxSay(String name, String word){
        return name + "说： " + word;
    }

    // 无参构造方法
    public Java3y() {
    }
}
