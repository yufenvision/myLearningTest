package thinkingInJava.innerclass.uptransition;

/**
 * @Author: dyf
 * @Date: 2019/6/29 21:14
 * @Description:
 */
public class Parcel3 {

    private class P3Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected class P3Destination{
        private String label;
        private P3Destination(String whereTo){
            label = whereTo;
        }
        public String readLable() {
            return label;
        }
    }

    public P3Destination destination(String s){
        return new Parcel3.P3Destination(s);
    }
    public P3Contents contents(){
        return new Parcel3.P3Contents();
    }

    public static void main(String[] args){
        Parcel3 parcel3 = new Parcel3();
        Parcel3.P3Contents xx = parcel3.contents();
        System.out.println(parcel3.contents().value());

        Parcel4 parcel4 = new Parcel4();
        Contents c = parcel4.contents();
        System.out.println(c.value());
        Destination d = parcel4.destination("目的");
        System.out.println(d.readLable());
    }
}
