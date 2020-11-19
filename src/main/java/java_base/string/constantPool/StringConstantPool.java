package java_base.string.constantPool;

/**
 * @Author: dyf
 * @Date: 2020/8/20 15:07
 * @Description:
 */
public class StringConstantPool {
    public static void main(String[] args){
        String s1 = new String("计算机");
        /**
         *  String.intern() 是一个 Native 方法，它的作用是：
         *  如果运行时常量池中已经包含一个等于此 String 对象内容的字符串，则返回常量池中该字符串的引用；
         *  如果没有，则在常量池中创建与此 String 内容相同的字符串，并返回常量池中创建的字符串的引用。
         */
        String s2 = s1.intern();

        String s3 = "计算机";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//true
        System.out.println(s1.equals(s3) && s2.equals(s3) && s2.equals(s1));//true

        //String 字符串拼接
        String str1 = "str";
        String str2 = "ing";

        String str3 = "str" + "ing";//常量池中的对象
        String str4 = str1 + str2; //在堆上创建的新的对象,尽量避免多个字符串拼接，因为这样会重新创建对象。如果需要改变字符串的话，可以使用 StringBuilder 或者 StringBuffer。
        String str5 = "java_base/string";//常量池中的对象
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
    }

}
