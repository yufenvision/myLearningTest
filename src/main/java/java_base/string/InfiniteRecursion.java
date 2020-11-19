package java_base.string;/**
 * @Author: dyf
 * @Date: 2019/4/28 17:07
 * @Description:
 */

/**
 * @Author: dyf
 * @Date: 2019/4/28 17:07
 * @Description:
 */
public class InfiniteRecursion {

    public String toString(){
        return "InfiniteRecursion address:" + super.toString()  + "\n";//修改为调用Obejct的toString方法，获得地址值
//        return "InfiniteRecursion address:" + this  + "\n";//由于重写了toString,这里存在一个+号后面的自动转型为string,所以产生了递归调用
    }

    public static void main(String[] args){
        System.out.println(new InfiniteRecursion());
    }
}
