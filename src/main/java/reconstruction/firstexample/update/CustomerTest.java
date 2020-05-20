package reconstruction.firstexample.update;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/9/23 16:01
 * @Description:
 * 需求描述：
 *
 * 有三种类型的电影，顾客可以进行租赁
 *
 * 租赁规则
 * 价格计算规则：
 * 普通片儿 —— 起步价2¥，超过2天的部分每天每部电影收费1.5元
 * 新片儿    —— 每天每部3元
 * 儿童片    —— 起步价1.5¥，超过3天的部分每天每部电影收费1.5元
 *
 * 积分计算规则：
 * 每借一部电影积分加1，新片每部加2
 */
public class CustomerTest {
    @Test
    public void test_allMovie_2days_rent(){
        Customer c2 = new Customer("2天顾客");
        setRentDays(c2, 2);
        System.out.println(c2.statement());
        assertEquals(9.5, c2.getTotalCharge(), 0.00);//delta是个精度值
        assertEquals(4, c2.getTotalFrequentRenterPoints());
    }

    @Test
    public void test_allMovie_3days_rent(){
        Customer c3 = new Customer("3天顾客");
        setRentDays(c3, 3);
        System.out.println(c3.statement());
        assertEquals(14, c3.getTotalCharge(), 0.00);//delta是个精度值
        assertEquals(4, c3.getTotalFrequentRenterPoints());
    }

    @Test
    public void test_allMovie_4days_rent(){
        Customer c4 = new Customer("4天顾客");
        setRentDays(c4, 4);
        System.out.println(c4.statement());
        assertEquals(20, c4.getTotalCharge(), 0.00);//delta是个精度值
        assertEquals(4, c4.getTotalFrequentRenterPoints());
    }

    @Test
    public void test_2new1regularMovie_5days_rent(){
        Customer c = new Customer("5天2部新片1部普通影片顾客");
        c.addRental(new Rental(new Movie("普通片儿",0), 5));
        c.addRental(new Rental(new Movie("新上映片",1), 5));
        c.addRental(new Rental(new Movie("新上映片",1), 5));
        System.out.println(c.statement());
        assertEquals(36.5, c.getTotalCharge(), 0.00);//delta是个精度值
        assertEquals(5, c.getTotalFrequentRenterPoints());
    }

    private void setRentDays(Customer c, int days){
        c.addRental(new Rental(new Movie("普通片儿",0), days));
        c.addRental(new Rental(new Movie("新上映片",1), days));
        c.addRental(new Rental(new Movie("儿童片儿",2), days));
    }
}
