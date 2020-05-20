package tdd.fizzbuzz;

/**
 * @Author: dyf
 * @Date: 2019/8/14 19:23
 * @Description: 写一个程序，打印出从1到100的数字，将其中3的倍数替换成“Fizz”，5的倍数替换成“Buzz”。既能被3整除、又能被5整除的数则替换成“FizzBuzz”。
 */
public class Calculator {
    private int num;

    public Calculator(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if(num%3 == 0 && num%5 == 0)
            return "fizz_buzz";
        else if(num%3 == 0)
            return "fizz";
        else if(num%5 == 0)
            return "buzz";
        else
            return String.valueOf(num);
    }

    public static void main(String[] args){
        int i = 1;
        while(i <= 100){
            System.out.println(new Calculator(i));
            i++;
        }
    }
}
