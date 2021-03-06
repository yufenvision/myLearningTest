package java_base.string.constantPool;

import org.junit.Test;

/**
 * @Author: dyf
 * @Date: 2020/8/20 16:08
 * @Description:
 */
public class Other8Pool {
    public static void main(String[] args){
        /*
         * Java 基本类型的包装类的大部分都实现了常量池技术，即Byte,Short,Integer,Long,Character,Boolean；
         * 这5种包装类默认创建了数值[-128，127]的相应类型的缓存数据，但是超出此范围仍然会去创建新的对象。
         * 两种浮点数类型的包装类 Float,Double 并没有实现常量池技术。
         */
        int i = 33;
        Integer i1 = 33;
        Integer i2 = 33;
        System.out.println(i1 == i2);// 输出true
        System.out.println(i == i2);// 输出true
        int ii = 333;
        Integer iNew = new Integer(333);
        Integer i11 = 333;
        Integer i22 = 333;
        System.out.println(ii == i11);// 输出true
        System.out.println(ii == iNew);// 输出true
        System.out.println(i11 == iNew);// 输出false
        System.out.println(i11 == i22);// 输出false
        System.out.println(i11.equals(i22));//输出true
        Double i3 = 1.2;
        Double i4 = 1.2;
        System.out.println(i3 == i4);// 输出false

        System.out.println(new Long(1).equals(new Integer(1)));

    }
    @Test
    public void IntegerConstantPool(){
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));//true
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));//true
        System.out.println("i1=i4   " + (i1 == i4));//false
        System.out.println("i4=i5   " + (i4 == i5));//false
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));//true
        System.out.println("40=i5+i6   " + (40 == i5 + i6));//true
        /*
        语句i4 == i5 + i6，因为+这个操作符不适用于Integer对象，首先i5和i6进行自动拆箱操作，进行数值相加，即i4 == 40。
        然后Integer对象无法与数值进行直接比较，所以i4自动拆箱转为int值40，最终这条语句转为40 == 40进行数值比较。
         */
    }
}
