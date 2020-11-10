package designmode.proxy.jdk.staticproxy;

/**
 * @Author: dyf
 * @Date: 2020/5/19 17:38
 * @Description:
 */
public class StaticProxy implements HouseOwner {
    private Landlord landlord;

    public StaticProxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void say(String word) {
        System.out.println("现在是静态代理，在代表房东说话：");
        landlord.say(word);
    }
}
