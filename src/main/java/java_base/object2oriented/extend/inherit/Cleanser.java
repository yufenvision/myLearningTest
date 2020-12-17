package java_base.object2oriented.extend.inherit;/**
 * @Author: dyf
 * @Date: 2019/5/5 10:00
 * @Description:
 */

/**
 * @Author: dyf
 * @Date: 2019/5/5 10:00
 * @Description:
 */
public class Cleanser {
    private String s = "Cleanser";
    public void append(String a){ s += a;};
    public void dilute(){append(" dilute");}
    public void apply(){append(" apply");}
    public void scrub(){append(" scrub");}
    public String toString(){return s;};
    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
