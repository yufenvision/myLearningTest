package java_base.exception;

import java.io.IOException;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/22 15:53
 */
public class PrintStackTraceTest {


    public static void main(String[] args) {
        System.out.println(getStr());
    }


    public static String getStr(){
        try{
            throw new IOException();
        }catch (IOException e){
            e.printStackTrace();
            return "捕获了异常";
        }
    }

}
