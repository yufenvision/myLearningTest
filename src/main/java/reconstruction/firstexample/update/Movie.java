package reconstruction.firstexample.update;

/**
 * @Author: dyf
 * @Date: 2019/9/19 16:15
 * @Description:
 *
 * 有三种类型的电影，顾客可以进行租赁
 * 租赁规则
 * 价格计算规则：
 * 普通片儿 —— 起步价2¥，超过2天的部分每天每部电影收费1.5元
 * 新片儿    —— 每天每部3元
 * 儿童片    —— 起步价2¥，超过3天的部分每天每部电影收费1.5元
 * 积分计算规则：
 * 每借一部电影积分加1，新片每部加2

 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_REALEASE = 1;

    private String title;
    private int priceCode;
    private Price price;


    public Movie(String title, int arg) {
        this.title = title;
        setPriceCode(arg);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

//    public void setPriceCode(int priceCode) {
//        this.priceCode = priceCode;
//    }
    public void setPriceCode(int arg) {
        switch (arg){
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_REALEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

//    public double getCharge(int daysRented){
//        double thisAmount = 0;
//        switch (priceCode){
//            case reconstruction.firstexample.old.Movie.REGULAR:
//                thisAmount += 2;
//                if(daysRented > 2)
//                    thisAmount += (daysRented - 2) * 1.5;
//                break;
//            case reconstruction.firstexample.old.Movie.NEW_REALEASE:
//                thisAmount += daysRented * 3;
//                break;
//            case reconstruction.firstexample.old.Movie.CHILDRENS:
//                thisAmount += 1.5;
//                if(daysRented > 3)
//                    thisAmount += (daysRented - 3) * 1.5;
//                break;
//        }
//        return thisAmount;
//    }
    public double getCharge(int daysRented){
        return price.getCharge(daysRented);
    }


    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
