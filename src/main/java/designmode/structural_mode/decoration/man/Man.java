package designmode.structural_mode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:29
 * @Description: 具体的男人
 */
public class Man implements Person {

    @Override
    public String say() {
        return "男人说：";
    }
}
