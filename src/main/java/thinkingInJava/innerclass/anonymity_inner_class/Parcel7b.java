package thinkingInJava.innerclass.anonymity_inner_class;

import thinkingInJava.innerclass.uptransition.Contents;

/**
 * @Author: dyf
 * @Date: 2019/6/29 22:22
 * @Description:
 */
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents(){return new MyContents();}

    public static void main(String[] args){
        Parcel7b parcel7b = new Parcel7b();
        Contents p = parcel7b.contents();
        System.out.println(p.value());
    }
}
