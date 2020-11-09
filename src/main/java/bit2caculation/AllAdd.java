package bit2caculation;

/**
 * @Description: 全加器
 * @Author: dyf
 * @Date: 2020/10/23 14:07
 */
public class AllAdd {

    private boolean a;
    private boolean b;
    private boolean carryInput;
    private boolean sum;
    private boolean carryOut;

    public AllAdd() {
    }

    public AllAdd(boolean a, boolean b, boolean carryInput) {
        initABC(a, b , carryInput);
    }

    public void initABC(boolean a, boolean b, boolean carryInput) {
        this.a = a;
        this.b = b;
        this.carryInput = carryInput;
        HalfAdd halfAdd1 = new HalfAdd();
        halfAdd1.initAB(a,b);
        HalfAdd halfAdd2 = new HalfAdd();
        halfAdd2.initAB(carryInput, halfAdd1.isSum());
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
