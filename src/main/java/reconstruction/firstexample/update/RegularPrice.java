package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/23 11:15
 * @Description:
 */
class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int daysRented){
        double result = 2;
        if(daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
