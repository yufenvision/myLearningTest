package bit2caculation.addition;

/**
 * @Description: 全加器
 * @Author: dyf
 * @Date: 2020/10/23 14:07
 */
public class AllAdd {

    private boolean a;//输入a
    private boolean b;//输入b
    private boolean carryInput;//进位输入
    private boolean sum;//加合输出
    private boolean carryOut;//进位输出

    public AllAdd() {
    }

    public AllAdd(boolean a, boolean b, boolean carryInput) {
        initABC(a, b , carryInput);
    }

    public void initABC(boolean a, boolean b, boolean carryInput) {
        this.a = a;
        this.b = b;
        this.carryInput = carryInput;
        HalfAdd halfAdd1 = new HalfAdd(a, b);
        HalfAdd halfAdd2 = new HalfAdd(carryInput, halfAdd1.isSum());
        sum = halfAdd2.isSum();
        carryOut = halfAdd1.isCarryOut() || halfAdd2.isCarryOut();
    }

    public void initABC(boolean a, boolean b) {
        initABC(a, b, false);
    }

    public boolean isSum() {
        return sum;
    }

    public boolean isCarryOut() {
        return carryOut;
    }

    public static void main(String[] args) {
        AllAdd allAdd = new AllAdd(true, true, false);
        System.out.println(allAdd.isSum());
        System.out.println(allAdd.isCarryOut());
    }
}
