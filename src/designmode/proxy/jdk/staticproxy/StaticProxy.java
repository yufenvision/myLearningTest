package designmode.proxy.jdk.staticproxy;

/**
 * @Author: dyf
 * @Date: 2020/5/19 17:38
 * @Description:
 */
public class StaticProxy implements IUserService {
    private Landlord landlord = new Landlord();


    @Override
    public void say(String word) {
        System.out.println("现在我代表房东说话");
        landlord.say(word);
    }
}
