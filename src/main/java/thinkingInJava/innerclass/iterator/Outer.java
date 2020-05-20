package thinkingInJava.innerclass.iterator;

/**
 * @Author: dyf
 * @Date: 2019/6/27 19:49
 * @Description: 练习：使得Outer类包含一个private String域（由构造器初始化），而Inner包含一个显示这个域的toString()方法。创建一个Inner类型对象并显示它
 */
public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }
    private class Inner{
        public String toString(){
            return "from Inner , Outer's name is : " + name;
        }
    }
    public Inner inner(){
        return new Inner();
    }
}
