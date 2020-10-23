package bit2Caculation;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/23 15:41
 */
public class Bit2AddMachine {

    private char[] a;
    private char[] b;
    private String result;

    public String getResult() {
        return result;
    }

    public void init(String a1, String b1){
        this.a = a1.toCharArray();
        this.b = b1.toCharArray();
        AllAdd allAdd0 = new AllAdd();
        allAdd0.initABC(bit(a[1]),bit(b[1]));
        AllAdd allAdd1 = new AllAdd();
        allAdd1.initABC(bit(a[0]),bit(b[0]),allAdd0.isCarryOut());
        char[] c = {bit(allAdd1.isCarryOut()), bit(allAdd1.isSum()), bit(allAdd0.isSum())};
        result = "";
        for (char c1 : c) {
            result+=c1;
        }
    }

    public boolean bit(char c){
        return c == '0'? false : true;
    }

    public char bit(boolean b){
        return b? '1' : '0';
    }

}
