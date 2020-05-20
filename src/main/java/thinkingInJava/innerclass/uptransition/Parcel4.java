package thinkingInJava.innerclass.uptransition;

/**
 * @Author: dyf
 * @Date: 2019/6/29 21:08
 * @Description:
 */
public class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLable() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }

    public static void main(String[] args){
        Parcel3 parcel3 = new Parcel3();
        //Parcel3.P3Contents xx = parcel3.contents();//因为是私有的所以不能访问，只能通过内部类实现接口来向上转型为接口，
        //parcel3.contents().value()//也不能调用方法
        Parcel4 parcel4 = new Parcel4();
        Contents c = parcel4.contents();
        c.value();
        Destination d = parcel4.destination("目的");
    }
}
