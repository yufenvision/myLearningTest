package designmode.factory.factorymethod;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:48
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args){
        //需求：我要买只狗
        Factory f = new DogFactory();
        Animal a = f.createAnimal();
        a.eat();
        System.out.println("------------------");
        //需求：我要买只猫
        f = new CatFactory();
        a = f.createAnimal();
        a.eat();
    }
}
