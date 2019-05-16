package designmode.factory.simplefactory;

/**
 * @Author: dyf
 * @Date: 2019/5/16 20:55
 * @Description:
 */
public class AnimalFactory {
    private AnimalFactory(){

    }
//    public static Dog createDog(){
//        return new Dog();
//    }
//    public static Cat createCat(){
//        return new Cat();
//    }
    public static Animal createAnimal(String type){
        switch (type){
            case "dog": return new Dog();
            case "cat": return new Cat();
            default:return null;
        }
    }
}
