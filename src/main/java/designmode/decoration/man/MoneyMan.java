package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 17:05
 * @Description:
 */
public class MoneyMan extends DecoratePerson {
    public MoneyMan(Person person) {
        super(person);
    }

    @Override
    public String say() {
        return person.say() + "我很会赚钱 ";
    }
}
