package designmode.create_mode.factory.mouse.factorymethod;

import designmode.create_mode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:48
 * @Description:
 */
public class MouseDemo {
    public static void main(String[] args){
        //需求：我要买个戴尔的鼠标
        Factory f = new DellMouseFactory();
        Mouse a = f.createMouse();
        a.logo();
        System.out.println("------------------");
        //需求：我要买个惠普的鼠标
        f = new HpMouseFactory();
        a = f.createMouse();
        a.logo();
    }
}
