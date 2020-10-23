package bit2Caculation;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/23 15:00
 */
public class Test {





    public static void main(String[] args) {
        Bit2AddMachine bit2AddMachine = new Bit2AddMachine();
        bit2AddMachine.init("00","00");
        System.out.println(bit2AddMachine.getResult());
        bit2AddMachine.init("01","01");
        System.out.println(bit2AddMachine.getResult());
        bit2AddMachine.init("00","01");
        System.out.println(bit2AddMachine.getResult());
        bit2AddMachine.init("10","10");
        System.out.println(bit2AddMachine.getResult());
        bit2AddMachine.init("11","11");
        System.out.println(bit2AddMachine.getResult());
        bit2AddMachine.init("10","01");
        System.out.println(bit2AddMachine.getResult());
    }

}
