package thinkingInJava.innerclass.this_new;

/**
 * @Author: dyf
 * @Date: 2019/6/22 21:23
 * @Description: 如果你需要生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和this.
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
            //Father plain "this" would be Inner's "this"
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

}
