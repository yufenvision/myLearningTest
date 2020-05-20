package designmode.singleton;

/**
 * @Author: dyf
 * @Date: 2019/6/24 21:46
 * @Description: 最好的单例实现方式用枚举类
 */
public enum SingletonEnum {
    INSTANCE1("实例1",1),INSTANCE2("实例2",2);

    SingletonEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "SingletonEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
