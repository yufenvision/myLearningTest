package designmode.construct_mode.decoration.iodecoration;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: dyf
 * @Date: 2019/6/2 16:33
 * @Description: IO装饰模式,
 * InputStream类是抽象组件，
 * FileInputStream是具体组件,
 * FilterInputStream是装饰器角色，
 * LowerCaseInputStream或BufferedInputStream是具体装饰器角色
 */
public class InputTest {
    public static void main(String[] args){
        int c;
        try (
//                InputStream in = new BufferedInputStream(InputTest.class.getResourceAsStream("test.txt"));
                InputStream in = new LowerCaseInputStream(InputTest.class.getResourceAsStream("/test.txt"));
                ){

//            while((c = in.read()) > 0){
//                System.out.print((char)c);
//            }
                byte[] bytes = new byte[in.available()];
                String s = new String(bytes, 0 , in.read(bytes));
                System.out.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
