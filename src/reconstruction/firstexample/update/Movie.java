package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/19 16:15
 * @Description:
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_REALEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public double getCharge(int daysRented){
        double thisAmount = 0;
        switch (priceCode){
            case reconstruction.firstexample.old.Movie.REGULAR:
                thisAmount += 2;
                if(daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case reconstruction.firstexample.old.Movie.NEW_REALEASE:
                thisAmount += daysRented * 3;
                break;
            case reconstruction.firstexample.old.Movie.CHILDRENS:
                thisAmount += 1.5;
                if(daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if((priceCode == Movie.NEW_REALEASE) && daysRented > 1)
            return 2;
        return 1;
    }
}
