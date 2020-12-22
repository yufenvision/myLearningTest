package bit2caculation.addition;

import bit2caculation.addition.Bit2AddMachine;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/23 15:00
 */
public class AddTest {


    public static void main(String[] args) {
        Bit2AddMachine bit2AddMachine = new Bit2AddMachine(2);
        System.out.println(bit2AddMachine.add("00", "00"));
        System.out.println(bit2AddMachine.add("01", "01"));
        System.out.println(bit2AddMachine.add("00", "01"));
        System.out.println(bit2AddMachine.add("10", "10"));
        System.out.println(bit2AddMachine.add("11", "11"));
        System.out.println(bit2AddMachine.add("10", "01"));
        System.out.println("====================================================");
        Bit2AddMachine bit2AddMachine3 = new Bit2AddMachine(3);
        System.out.println(bit2AddMachine3.add("000", "000"));
        System.out.println(bit2AddMachine3.add("001", "001"));
        System.out.println(bit2AddMachine3.add("000", "001"));
        System.out.println(bit2AddMachine3.add("010", "010"));
        System.out.println(bit2AddMachine3.add("011", "011"));
        System.out.println(bit2AddMachine3.add("010", "001"));


    }

}
