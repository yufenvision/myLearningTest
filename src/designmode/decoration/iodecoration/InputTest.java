package designmode.decoration.iodecoration;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: dyf
 * @Date: 2019/6/2 16:33
 * @Description:
 */
public class InputTest {
    public static void main(String[] args){
        int c;
        try (
//                InputStream in = new LowerCaseInputStream(new BufferedInputStream(
//                        new FileInputStream("D:\\gitWorkSpace\\myPractise\\myLearningTest\\src\\designmode\\decoration\\beverage\\test.txt")));
                InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                        InputTest.class.getResourceAsStream("test.txt")));
                ){
            //FileInputStream txt = (FileInputStream) InputTest.class.getClassLoader().getResourceAsStream("test.txt");
            while((c = in.read()) > 0){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
