package io.thinkinjava.basic_io_use;

import java.io.*;

/**
 * @Author: dyf
 * @Date: 2019/6/20 15:37
 * @Description: available方法查询还有多个可供读取的字符，下面这个例子演示了怎样一次一个字节地读取文件
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("D:\\eclipse_neon\\eclipse\\workspace\\myTest\\src\\io\\thinkinjava\\basic_io_use\\TestEOF.java")
                )
        );
        while(in.available() != 0){
            System.out.print((char) in.readByte());
        }
    }
}
