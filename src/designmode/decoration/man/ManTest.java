package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:44
 * @Description: 男人试炼场
 */
public class ManTest {

    public static void main(String[] args){
        IMan man = new Man();
        IMan man1 = new SuperMan(man);
        System.out.println(man1.say());
        //可以通过这种方式，无限增强
        IMan man2 = new HouseMan(man1);
        System.out.println(man2.say());
        IMan man3 = new MoneyMan(man2);
        System.out.println(man3.say());

    }
}
