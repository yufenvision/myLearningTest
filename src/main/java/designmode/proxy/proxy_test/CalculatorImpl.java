package designmode.proxy.proxy_test;

/**
 * @Author: dyf
 * @Date: 2020/11/10 20:40
 * @Description:
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
