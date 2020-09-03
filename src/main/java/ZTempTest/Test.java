package ZTempTest;

/**
 * @Author: dyf
 * @Date: 2020/9/1 16:06
 * @Description:
 */
public class Test {

    public static void main(String[] args){
        Son son = new Son();
        System.out.println(son.name);

        Other other = new Other();
        System.out.println(other.father.p);
    }
}
