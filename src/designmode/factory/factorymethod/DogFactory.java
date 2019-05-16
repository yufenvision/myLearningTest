package designmode.factory.factorymethod;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:50
 * @Description:
 */
public class DogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
