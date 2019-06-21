package io.thinkinjava.basic_io_use;

import java.io.*;

/**
 * @Author: dyf
 * @Date: 2019/6/20 14:37
 * @Description: 缓存输入文件
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null){
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(BufferedInputFile.class.getResource("").getPath());
        System.out.println(ClassLoader.getSystemResource("").getPath());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(read("D:\\eclipse_neon\\eclipse\\workspace\\myTest\\src\\io\\thinkinjava\\basic_io_use\\BufferedInputFile.java"));
    }
}
