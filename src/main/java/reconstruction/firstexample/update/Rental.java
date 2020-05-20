package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/19 16:17
 * @Description:
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge(){
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(){
        return movie.getFrequentRenterPoints(daysRented);
    };
}
