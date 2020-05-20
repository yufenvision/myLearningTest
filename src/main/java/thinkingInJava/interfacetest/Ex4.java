package thinkingInJava.interfacetest;

/**
 * @Author: dyf
 * @Date: 2019/7/3 22:21
 * @Description:
 */
public class Ex4 {

    public static void testPrint(Dad d){
        ((Son)d).print();
    }
    public static void secondTestPrint(SecondDad d){
        d.print();
    }
    public static void main(String[] args){
        Son s = new Son();
        Ex4.testPrint(s);
        SecondSon ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }

}
