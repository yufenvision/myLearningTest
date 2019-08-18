package tdd.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/8/14 19:13
 * @Description:
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

    private int input;
    private String expectedValue;

    public CalculatorTest(int input, String expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters(name = "{index}: args({0})={1}")
    public static Collection inputData(){
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {3, "fizz"},
                {5, "buzz"},
                {15, "fizz_buzz"},
        });
    }

    @Test
    public void test(){
        Calculator calculator = new Calculator(input);
        assertEquals(expectedValue, calculator.toString());
    }

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
