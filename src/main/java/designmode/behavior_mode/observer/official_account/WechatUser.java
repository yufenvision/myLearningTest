package designmode.behavior_mode.observer.official_account;

/**
 * @Author: dyf
 * @Date: 2020/4/8 10:14
 * @Description:
 * 具体观察者，实现update方法
 */
public class WechatUser implements Observer{
    private String name;
    private String message;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name + "收到推送消息： " + message);
    }
}
