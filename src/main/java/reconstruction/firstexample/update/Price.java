package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/23 11:12
 * @Description:
 * 我们有数种影片类型，它们以不同的方式回答相同的问题。
 */
abstract class Price {
    abstract  int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
