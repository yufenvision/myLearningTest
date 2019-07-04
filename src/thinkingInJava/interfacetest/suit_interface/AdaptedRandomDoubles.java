package thinkingInJava.interfacetest.suit_interface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Author: dyf
 * @Date: 2019/7/4 20:43
 * @Description: 通过接口提供的伪多重继承机制，我们可以生成既是RandomDoubles又是Readable的新类
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble())
            System.out.println(s.nextDouble() + " ");
    }
}
