package reconstruction.firstexample.old;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author: dyf
 * @Date: 2019/9/19 16:18
 * @Description: 顾客类
 * 需求描述：
 *
 * 有三种类型的电影，顾客可以进行租赁
 *
 * 租赁规则
 * 价格计算规则：
 * 普通片儿 —— 起步价2¥，超过2天的部分每天每部电影收费1.5元
 * 新片儿    —— 每天每部3元
 * 儿童片    —— 起步价2¥，超过3天的部分每天每部电影收费1.5元
 *
 * 积分计算规则：
 * 每借一部电影积分加1，新片每部加2
 *
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentalss = rentals.elements();
        String result = "Rental Record for" + getName() + "\n";
        while(rentalss.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentalss.nextElement();

            //determine amounts for each line
            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmount += 2;
                    if(each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_REALEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            //每部电影添加积分
            frequentRenterPoints ++;
            //新片每部电影加2分
            if((each.getMovie().getPriceCode() == Movie.NEW_REALEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //打印每一条租借记录
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent enter points";
        return result;
    }

}
