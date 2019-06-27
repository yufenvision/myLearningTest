package thinkingInJava.innerclass.iterator;

/**
 * @Author: dyf
 * @Date: 2019/6/27 19:24
 * @Description:
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
