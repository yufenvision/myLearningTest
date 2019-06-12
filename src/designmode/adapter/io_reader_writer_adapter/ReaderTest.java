package designmode.adapter.io_reader_writer_adapter;

import java.io.*;

/**
 * @Author: dyf
 * @Date: 2019/6/12 15:54
 * @Description: 将字节输入流适配为字符输入流
 */
public class ReaderTest {
    public static void main(String[] args){
        try (InputStream in = ReaderTest.class.getResourceAsStream("file.txt")//这里的InputStream就是目标接口
        ){
            Reader reader = new InputStreamReader(in);//Reader是源角色，InputStreamReader是适配器
            char[] chars = new char[1024];
            reader.read(chars);
            System.out.println(new String(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
