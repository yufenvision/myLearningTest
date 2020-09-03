/**
 * @Author: dyf
 * @Date: 2020/9/1 11:26
 * @Description:
 */
public class TempTest {

    public static void main(String[] args){
        Long l1 = 100L;
        Long l2 = 100L;
        Long l3 = new Long(100L);
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);
        System.out.println(l1.equals(l3));



    }

}
