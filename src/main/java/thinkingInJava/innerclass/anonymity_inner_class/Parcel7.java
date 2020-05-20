package thinkingInJava.innerclass.anonymity_inner_class;

import thinkingInJava.innerclass.uptransition.Contents;

/**
 * @Author: dyf
 * @Date: 2019/6/29 22:05
 * @Description: 创建一个继承自Contents类的匿名类对象
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {//Insert a class definition
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
    public static void main(String[] args){
        Parcel7 parcel7 = new Parcel7();
        Contents p = parcel7.contents();
        System.out.println(p.value());
    }
}
