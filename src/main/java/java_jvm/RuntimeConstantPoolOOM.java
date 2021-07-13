package java_jvm;

import java.util.HashSet;

/**
 * @Author: dyf
 * @Date: 2021/7/7 14:31
 * @Description:
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        String str1 = new StringBuffer("计算机").append("软件").toString();//如果“计算机软件”还没有放入常量池，这里返回的是常量池引用
        System.out.println(str1.intern() == str1);

        String str2 = new String("计算机软件");
        System.out.println(str2.intern() == str2);

        String str3 = new StringBuffer("ja").append("va").toString();
        System.out.println(str3.intern() == str3);
    }
}
