package java_base.object2oriented.extend.proxy;
/**
 * @Author: dyf
 * @Date: 2019/5/5 11:00
 * @Description:
 */
public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){this.name = name;}

    public String toString() {
        return name;
    }
    public static void main(String[] args){
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
    //SpaceShip并非真正的SpaceShipControls类型，SpaceShipControls的所有方法在SpaceShip中都暴露了出来。代理解决了此难题
}
