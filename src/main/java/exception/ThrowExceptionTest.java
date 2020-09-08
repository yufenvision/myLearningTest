package exception;

/**
 * @Author: dyf
 * @Date: 2020/9/8 20:44
 * @Description:
 */
public class ThrowExceptionTest {
    public static void main(String[] args){
        //print();
        System.out.println(tryCatch());
        //add(2,1);

    }

    public static void print(){
        throw new RuntimeException("抛出print异常...");
        //System.out.println("xxxx");//编译错误，无法到达的代码
    }

    public static boolean tryCatch(){
        boolean flag = true;
        try{
//            throw new RuntimeException("try catch异常抛出...");
            print();
            flag = false;
            return flag;
        }catch (Exception e){
            System.out.println("进了catch");
            e.printStackTrace();
        }
        finally {
            flag = true;
            System.out.println("finally语句...");
            return flag;
        }
    }

    public static void add(int a, int b){
        if(a > b){
            throw new RuntimeException("抛出" + a + ">" + b + "的异常...");
        }
        System.out.println("异常后的代码执行");
    }


}
