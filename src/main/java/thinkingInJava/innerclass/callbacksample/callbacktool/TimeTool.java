package thinkingInJava.innerclass.callbacksample.callbacktool;

/**
 * @Author: dyf
 * @Date: 2019/7/1 00:07
 * @Description:
 */
public class TimeTool {

    public void testTime(CallBack callBack){
        long begin = System.currentTimeMillis();
        callBack.excute();//执行回调
        long end = System.currentTimeMillis();
        long usedTime = end - begin;
        System.out.println(callBack.getClass().getName() + "耗时： " + usedTime);
    }

}
