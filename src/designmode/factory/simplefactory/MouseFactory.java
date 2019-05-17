package designmode.factory.simplefactory;

/**
 * @Author: dyf
 * @Date: 2019/5/16 20:55
 * @Description:
 */
public class MouseFactory {
    private MouseFactory(){

    }
//    public static HpMouse createMouse(){
//        return new HpMouse();
//    }
//    public static DellMouse createMouse(){
//        return new DellMouse();
//    }
    public static Mouse createMouse(String type){
        switch (type){
            case "hp": return new HpMouse();
            case "dell": return new DellMouse();
            default:return null;
        }
    }
}
