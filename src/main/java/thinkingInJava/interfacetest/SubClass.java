package thinkingInJava.interfacetest;

/**
 * @Author: dyf
 * @Date: 2019/7/3 21:35
 * @Description:
 */
public class SubClass extends BaseAbstract {

    private int i = 0;

    @Override
    public void print() {
        System.out.println("子类的变量i: " + i);
    }
    /* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero
		* 2. Dad() called
		* 3. s.print() called in BaseAbstract() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
    public static void main(String[] args){
        SubClass s = new SubClass();
        s.print();
    }
}
