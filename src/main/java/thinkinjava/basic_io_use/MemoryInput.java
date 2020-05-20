package thinkinjava.basic_io_use;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Author: dyf
 * @Date: 2019/6/20 15:22
 * @Description: 从内存输入
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in = new StringReader(new BufferedInputFile().read("D:\\eclipse_neon\\eclipse\\workspace\\myTest\\src\\io\\thinkinjava\\basic_io_use\\MemoryInput.java"));
        int c;
        while((c = in.read()) != -1){
            System.out.print((char)c);
        }
        in.close();
    }
}
