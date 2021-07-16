package designmode.behavioral_mode.observer.official_account;

/**
 * @Author: dyf
 * @Date: 2020/4/8 10:16
 * @Description:
 */
public class TestWechat {
    public static void main(String[] args){
        WechatServer wechatServer = new WechatServer();

        WechatUser zhangsan = new WechatUser("张三");
        WechatUser lisi = new WechatUser("李四");
        WechatUser wangwu = new WechatUser("王五");

        wechatServer.registerObserver(zhangsan);//张三关注该公众号
        wechatServer.registerObserver(lisi);//李四关注
        wechatServer.registerObserver(wangwu);//王五关注

        wechatServer.setInformation("微信公众号第一条消息");
        wechatServer.setInformation("PHP是世界上最好用的语言");

        wechatServer.removeObserver(wangwu);//王五听了以后取消关注

        wechatServer.setInformation("刚刚那条消息是个玩笑，哈哈哈");
    }
}
