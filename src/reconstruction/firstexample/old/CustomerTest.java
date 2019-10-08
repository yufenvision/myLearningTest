package reconstruction.firstexample.old;

/**
 * @Author: dyf
 * @Date: 2019/9/23 16:01
 * @Description:
 */
public class CustomerTest {
    public static void main(String[] args){
        Customer c = new Customer("顾客1");
        c.addRental(new Rental(new Movie("普通",0), 2));
        c.addRental(new Rental(new Movie("新上映",1), 4));
        c.addRental(new Rental(new Movie("小孩子们",2), 3));
        System.out.println(c.statement());
    }
}
