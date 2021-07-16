package designmode.behavior_mode.observer.official_account;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dyf
 * @Date: 2020/4/8 10:10
 * @Description:
 */
public class WechatServer implements Observable {
    private List<Observer> observers;
    private String message;

    public WechatServer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty())observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(v -> v.update(message));
    }

    public void setInformation(String message){
        this.message = message;
        System.out.println("微信服务更新消息：" + message + " --->>>");
        //消息更新，通知所有观察者
        notifyObserver();
        System.out.println("------------------------------------------------------------------------");
    }
}
