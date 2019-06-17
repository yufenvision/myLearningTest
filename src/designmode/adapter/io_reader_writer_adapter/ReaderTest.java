package designmode.adapter.io_reader_writer_adapter;

import java.io.*;

/**
 * @Author: dyf
 * @Date: 2019/6/12 15:54
 * @Description: 将字节输入流适配为字符输入流
 */
public class ReaderTest {
    public static void main(String[] args){
        try (InputStream in = ReaderTest.class.getResourceAsStream("file.txt")//这里的InputStream就是被适配接口（源角色）
        ){
            Reader reader = new InputStreamReader(in);//Reader是目标接口，InputStreamReader是适配器
            char[] chars = new char[1024];
            reader.read(chars);
            System.out.println(new String(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //对象适配器模式充满着良好的OO设计原则：使用对象组合，以修改的接口包装被适配者，被适配者的任何子类，都可以搭配着适配器使用
    }
}
