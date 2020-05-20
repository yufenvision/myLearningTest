package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/23 11:15
 * @Description:
 */
class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_REALEASE;
    }

    double getCharge(int daysRented){
        return daysRented * 3;
    }

    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
