package thinkingInJava.interfacetest.strategy;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: dyf
 * @Date: 2019/7/4 17:11
 * @Description: Readable接口是单独为Scanner创建的，以使得Scanner不必将其参数限制为某个特定的类
 */
public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] captials = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;
    public RandomWords(int count){
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;//Indicates end of input;
        cb.append(captials[rand.nextInt(captials.length)]);
        for (int i = 0;i < 4; i++){
            cb.append(lowers[rand.nextInt(lowers.length)]);
            cb.append(vowels[rand.nextInt(vowels.length)]);
        }
        cb.append(" ");
        return 10;//Number of characters appended
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new RandomWords(10));
        while (scanner.hasNext())
            System.out.println(scanner.next());

    }

}
