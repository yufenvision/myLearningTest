package designmode.creational_mode.factory.mouse.simplefactory;

import designmode.creational_mode.factory.mouse.DellMouse;
import designmode.creational_mode.factory.mouse.HpMouse;
import designmode.creational_mode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/16 20:54
 * @Description:
 */
public class MouseDemo {
    public static void main(String[] args){
        //具体类调用
        HpMouse d = new HpMouse();
        d.logo();
        DellMouse c = new DellMouse();
        System.out.println("-------------------");

        //工厂有了后，通过工厂给造
//        HpMouse dd = MouseFactory.createDog();
//        DellMouse cc = MouseFactory.createCat();
//        dd.eat();
//        cc.eat();

        //工厂改进后
        Mouse a = MouseFactory.createMouse("dell");
        a.logo();
        a = MouseFactory.createMouse("hp");
        a.logo();
        //NullPointerException
        a = MouseFactory.createMouse("apple");
        if(a != null){
            a.logo();
        }else{
            System.out.println("对不起，暂时不提供这种品牌的鼠标");
        }
    }
}
