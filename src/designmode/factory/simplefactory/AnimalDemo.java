package designmode.factory.simplefactory;

import java.util.Optional;

/**
 * @Author: dyf
 * @Date: 2019/5/16 20:54
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args){
        //具体类调用
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        System.out.println("-------------------");

        //工厂有了后，通过工厂给造
//        Dog dd = AnimalFactory.createDog();
//        Cat cc = AnimalFactory.createCat();
//        dd.eat();
//        cc.eat();

        //工厂改进后
        Animal a = AnimalFactory.createAnimal("dog");
        a.eat();

        //NullPointerException
        a = AnimalFactory.createAnimal("pig");
        if(a != null){
            a.eat();
        }else{
            System.out.println("对不起，暂时不提供这种动物");
        }
    }
}
