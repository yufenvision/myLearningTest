package designmode.factory.factorymethod;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:53
 * @Description:
 */
public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
