package reconstruction.firstexample.update;

import reconstruction.firstexample.update.Movie;
import reconstruction.firstexample.update.Rental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author: dyf
 * @Date: 2019/9/20 10:07
 * @Description:
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
        Enumeration rentalss = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentalss.hasMoreElements()){
            Rental each = (Rental) rentalss.nextElement();
            //我喜欢尽量出去这一类临时变量。虽然计算了两次，但是很容易被优化
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent enter points";
        return result;
    }


//    private double amountFor(Rental rental){
//        double thisAmount = 0;
//        //最好不要在另一个对象的属性基础上运用switch语句。如果不得不使用，也应该在对象自己的数据上使用，而不是别人的数据上使用
//        //这暗示getCharge()应该移动到Movie类里面去
//        switch (rental.getMovie().getPriceCode()){
//            case Movie.REGULAR:
//                thisAmount += 2;
//                if(rental.getDaysRented() > 2)
//                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
//                break;
//            case Movie.NEW_REALEASE:
//                thisAmount += rental.getDaysRented() * 3;
//                break;
//            case Movie.CHILDRENS:
//                thisAmount += 1.5;
//                if(rental.getDaysRented() > 3)
//                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
//                break;
//        }
//        return thisAmount;
//    }

    public double getTotalCharge(){
        double result = 0;
        Enumeration rentalss = rentals.elements();
        while(rentalss.hasMoreElements()){
            Rental each = (Rental) rentalss.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentalss = rentals.elements();
        while(rentalss.hasMoreElements()){
            Rental each = (Rental) rentalss.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
