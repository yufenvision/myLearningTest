package thinkingInJava.arrays;

import java.util.Arrays;

/**
 * @Author: dyf
 * @Date: 2019/9/5 10:08
 * @Description: 用同一个值填充各个位置
 */
public class ArraysFill {
    public static void main(String[] args){
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        short[] a3 = new short[size];
        char[] a4 = new char[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];
        Arrays.fill(a1, true);
        System.out.println("a1 = " + Arrays.toString(a1));
        Arrays.fill(a9, "hello");
        System.out.println("a9 = " + Arrays.toString(a9));
        Arrays.fill(a9, 3,5, "world");
        System.out.println("a9 = " + Arrays.toString(a9));
    }

}
