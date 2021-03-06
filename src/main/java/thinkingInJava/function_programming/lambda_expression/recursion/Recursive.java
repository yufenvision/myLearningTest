package thinkingInJava.function_programming.lambda_expression.recursion;

import java.util.function.Function;

/**
 * @Author: dyf
 * @Date: 2019/7/11 21:53
 * @Description:
 */
public class Recursive {
    Function<Integer, Integer> rs;
    public Recursive() {
        rs = n -> n == 0 ? 0 :
                  n == 1 ? 1 :
                  rs.apply(n - 1) + rs.apply(n - 2);
    }
    Integer getResultLambda(Integer n){
        return rs.apply(n);
    };

    Integer getResultNormal(Integer m){
        return m == 0 ? 0 :
               m == 1 ? 1 :
               getResultNormal(m - 1) + getResultNormal(m - 2);
    }

    public static void main(String[] args){
        Recursive recursive = new Recursive();
        for(int i = 0; i <= 10; i++)
            System.out.println(recursive.getResultLambda(i));
    }
}
