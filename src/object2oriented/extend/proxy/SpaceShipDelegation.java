package object2oriented.extend.proxy;
/**
 * @Author: dyf
 * @Date: 2019/5/5 11:04
 * @Description:
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    //Delegated methods;
    public void back(int velocity){
        controls.back(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void forward(int velocity){
        controls.forward(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }
    public void up(int velocity){
        controls.up(velocity);
    }
    public void turboBoost(){
        controls.turboBoost();
    }
    public static void main(String[] args){
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protecor");
        protector.forward(100);
    }
    //我们使用代理时有更多的控制力，因为我们可以选择只提供在成员对象中的方法的某个子集
}
