package designmode.structural_mode.adapter.io_reader_writer_adapter;

import java.io.*;

/**
 * @Author: dyf
 * @Date: 2019/6/12 15:54
 * @Description: 将字节输入流适配为字符输入流
 */
public class ReaderTest {
    public static void main(String[] args){
        try (InputStream in = ReaderTest.class.getResourceAsStream("/file.txt")//这里的InputStream就是源角色
        ){
            Reader reader = new InputStreamReader(in);//Reader是目标接口，InputStreamReader是适配器(字节流转字符流)
            char[] chars = new char[1024];
            reader.read(chars);
            System.out.println(new String(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
