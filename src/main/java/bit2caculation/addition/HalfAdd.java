package bit2caculation.addition;

/**
 * @Description: 半加器
 * @Author: dyf
 * @Date: 2020/10/23 12:47
 */
public class HalfAdd {

    private boolean a;//输入a
    private boolean b;//输入b
    private boolean sum;//加和输出
    private boolean carryOut;//进位输出

    public HalfAdd() {
    }

    public HalfAdd(boolean a, boolean b) {
        initAB(a, b);
    }

    public void initAB(boolean a, boolean b){
        this.a = a;
        this.b = b;
        sum = (!(a && b)) && (a || b); //异或门
        carryOut = a && b; //与门
    }

    public boolean isSum() {
        return sum;
    }

    public boolean isCarryOut() {
        return carryOut;
    }

    public static void main(String[] args) {
        HalfAdd halfAdd = new HalfAdd();
        halfAdd.initAB(false, false);
        System.out.println(getBit(halfAdd.isCarryOut()) + getBit(halfAdd.isSum()));
        halfAdd.initAB(false, true);
        System.out.println(getBit(halfAdd.isCarryOut()) + getBit(halfAdd.isSum()));
        halfAdd.initAB(true, false);
        System.out.println(getBit(halfAdd.isCarryOut()) + getBit(halfAdd.isSum()));
        halfAdd.initAB(true, true);
        System.out.println(getBit(halfAdd.isCarryOut()) + getBit(halfAdd.isSum()));
    }

    public static String getBit(boolean flag){
        return flag ? "1" : "0";
    }

}
