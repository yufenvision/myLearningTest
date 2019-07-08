package thinkingInJava.function_programming.new_old_compare;

/**
 * @Author: dyf
 * @Date: 2019/7/8 20:41
 * @Description:
 */
public class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
