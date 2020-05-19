package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:35
 * @Description: 人类增强器，学习进化
 */
public class DecoratePerson implements Person {
    protected Person person;

    public DecoratePerson(Person person) {
        this.person = person;
    }

    public DecoratePerson() {
    }

    @Override
    public String say() {
        return person.say() + "经过我不懈的努力...";
    }
}
