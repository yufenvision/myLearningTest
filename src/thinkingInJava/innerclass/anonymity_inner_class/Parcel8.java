package thinkingInJava.innerclass.anonymity_inner_class;

import thinkingInJava.innerclass.uptransition.Destination;

/**
 * @Author: dyf
 * @Date: 2019/6/29 22:35
 * @Description: Wrapping是普通类，这里等于是创建了一个继承wrapping的匿名类？
 */
public class Parcel8 {
    //Wrapping是普通类，这里等于是创建了一个继承wrapping的匿名类？
    public Wrapping wrapping(int x){//尽管Wrapping只是一个具有具体实现的普通类，但它还是被其导出类当做公共“接口”来使用
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }

    //特别注意：在Java8中已经去掉要对final的修饰限制，但其实只要在匿名内部类使用了，该变量还是会自动变为final类型（只能使用，不能赋值)
    public Destination destination(final String dest){//如果定义个内部类，并且希望它使用在一个其外部定义的对象，那么编译器会要求其参数引用是final的??
        return new Destination() {
            private String lable = dest;
            @Override
            public String readLable() {
                return lable;
            }
        };
    }

    public static void main(String[] args){
        Parcel8 parcel8 = new Parcel8();
        Wrapping w = parcel8.wrapping(10);
        System.out.println(w.value());
        String s = "哈哈";
        Destination d = parcel8.destination(s);
        System.out.println(d.readLable());
        s = "嘻嘻";
        System.out.println(d.readLable());

    }
}
