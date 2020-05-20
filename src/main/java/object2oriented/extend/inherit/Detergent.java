package object2oriented.extend.inherit;/**
 * @Author: dyf
 * @Date: 2019/5/5 10:01
 * @Description:
 */

/**
 * @Author: dyf
 * @Date: 2019/5/5 10:01
 * @Description:
 */
public class Detergent extends Cleanser {
    //change a method
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    //Add method to interface;
    public void foam(){append(" foam()");}
    //Test a new Class;
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing Base Class:");
        Cleanser.main(args);
    }
}
