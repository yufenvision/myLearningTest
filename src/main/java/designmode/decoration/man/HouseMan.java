package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:42
 * @Description: 居家的男人
 */
public class HouseMan extends DecoratePerson {
    public HouseMan(Person person) {
        super(person);
    }

    @Override
    public String say() {
        return person.say() + "我很会做家务 ";
    }
}
