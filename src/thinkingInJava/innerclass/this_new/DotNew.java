package thinkingInJava.innerclass.this_new;

/**
 * @Author: dyf
 * @Date: 2019/6/22 21:36
 * @Description: 告知某些其它对象，去创建其某个内部类的对象
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
