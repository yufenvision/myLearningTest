package designmode.construct_mode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:44
 * @Description: 男人试炼场
 */
public class ManTest {

    public static void main(String[] args){
        Person man = new Man();
        Person man1 = new DecoratePerson(man);
        System.out.println(man1.say());
        //可以通过这种方式，无限增强
        Person man2 = new HouseMan(man1);
        System.out.println(man2.say());

        Person man3 = new MoneyMan(man2);
        System.out.println(man3.say());
    }

}
