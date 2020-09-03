package ZTempTest;

/**
 * @Author: dyf
 * @Date: 2020/9/1 16:02
 * @Description:
 */
public class Father {

    String name = "父";

    protected String p = "保护的";

    public Father(String name, String p) {
        this.name = name;
        this.p = p;
    }

    public Father() {
    }

    private void show(){
        String xx = "";
    }

    private void show(String xx){
        System.out.println("xx");
    }
}
