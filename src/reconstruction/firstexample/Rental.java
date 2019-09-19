package reconstruction.firstexample;

/**
 * @Author: dyf
 * @Date: 2019/9/19 16:17
 * @Description:
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this.movie = _movie;
        this.daysRented = _daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
