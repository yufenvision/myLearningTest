package tdd.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/8/14 19:13
 * @Description:
 */
public class CalculatorTest {


    @Test
    public void say_normal_number(){
        Calculator calculator = new Calculator(1);
        assertEquals("1",calculator.toString());
    }

    @Test
    public void say_fizz_if_divisible_By3(){
        Calculator calculator = new Calculator(3);
        assertEquals("fizz",calculator.toString());
    }

    @Test
    public void say_buzz_if_divisible_By5(){
        Calculator calculator = new Calculator(5);
        assertEquals("buzz",calculator.toString());
    }

    @Test
    public void say_buzz_if_divisible_By3And5(){
        Calculator calculator = new Calculator(15);
        assertEquals("fizz_buzz",calculator.toString());
    }
}
