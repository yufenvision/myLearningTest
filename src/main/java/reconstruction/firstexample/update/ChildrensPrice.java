package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/23 11:14
 * @Description:
 */
class ChildrensPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int daysRented){
        double result = 1.5;
        if(daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
