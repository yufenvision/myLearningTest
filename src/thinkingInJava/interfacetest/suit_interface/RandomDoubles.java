package thinkingInJava.interfacetest.suit_interface;

import java.util.Random;

/**
 * @Author: dyf
 * @Date: 2019/7/4 20:31
 * @Description:
 */
public class RandomDoubles {
    private static Random rand = new Random(47);//为什么要new Random(47)?
    public double next(){
        return rand.nextDouble();
    }
    public static void main(String[] args){
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i< 7; i++){
            System.out.println(rd.next());
        }
    }
}
