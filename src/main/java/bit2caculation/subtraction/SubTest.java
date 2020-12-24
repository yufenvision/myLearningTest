package bit2caculation.subtraction;


/**
 * @Author: dyf
 * @Date: 2020/12/24 22:42
 * @Description:
 */
public class SubTest {
    public static void main(String[] args) {

        Bit2SubMachine bit2AddMachine = new Bit2SubMachine(2,true);
        System.out.println(bit2AddMachine.add("11", "01"));
        System.out.println("====================================================");
        Bit2SubMachine bit2AddMachine3 = new Bit2SubMachine(3,true);
        System.out.println(bit2AddMachine3.add("000", "000"));
        System.out.println(bit2AddMachine3.add("001", "001"));
        System.out.println(bit2AddMachine3.add("110", "010"));
        System.out.println(bit2AddMachine3.add("010", "010"));
        System.out.println(bit2AddMachine3.add("011", "011"));
        System.out.println(bit2AddMachine3.add("010", "001"));
        
        
        
    }
}
