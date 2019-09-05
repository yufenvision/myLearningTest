package thinkingInJava.arrays;

import com.sun.org.apache.xpath.internal.compiler.FunctionTable;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: dyf
 * @Date: 2019/9/5 10:33
 * @Description:
 */
public class CopyingArrays {
    static int[] i = new int[7];
    static int[] j = new int[10];

    private static Function<Supplier<String>, String> getCostTime = v -> {
        long startTime = System.currentTimeMillis();
        v.get();
        long endTime = System.currentTimeMillis();
        return Long.toString(endTime - startTime);
    };


    private static Supplier<String> arrayCopy = () ->{
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        return null;
    },
        arrayCopyMethod = () ->{
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));
        return null;
    };


    public static void main(String[] args){
        System.out.println("消耗时间 ：" + getCostTime.apply(arrayCopy));
        System.out.println("消耗时间 ：" + getCostTime.apply(arrayCopyMethod));

        int[] k = new int[5];
        Arrays.fill(k,103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println("k = " + Arrays.toString(k));
        Arrays.fill(k,103);
        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println("i = " + Arrays.toString(i));

        //Objects:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u,new Integer(47));
        Arrays.fill(v,new Integer(99));
        System.out.println("u = " + Arrays.toString(u));
        System.out.println("v = " + Arrays.toString(v));
        System.arraycopy(v, 0, u, u.length/2, v.length);
        System.out.println("u = " + Arrays.toString(u));
        v[3] = new Integer(0);
        v[4] = 0;
        System.out.println("v = " + Arrays.toString(v));
        System.out.println("u = " + Arrays.toString(u));

        ForCopy[] copys1 = new ForCopy[3];
        ForCopy[] copys2 = new ForCopy[5];
        Arrays.fill(copys1, new ForCopy( new CopyObject(10086)));
        System.out.println("copys1 = " + Arrays.toString(copys1));
        Arrays.fill(copys2, new ForCopy("姓名", 10, new CopyObject(10086)));
        System.arraycopy(copys1, 0, copys2,0, copys1.length);
        System.out.println("copys2 = " + Arrays.toString(copys2));
//        copys1[0] = new ForCopy("修改", 00, new CopyObject(99999));//这里只是改变了copys1[0]变量的地址指向，之前指向的对象仍然被copys2引用
        copys1[0].setName("修改了！！！");//堆中的对象值改变，影响引用了它的copys2的值
        copys1[0].setAge(11);
        copys1[0].setCopyObject(new CopyObject(999999));
        System.out.println("copys1 = " + Arrays.toString(copys1));
        System.out.println("copys2 = " + Arrays.toString(copys2));
    }
}
