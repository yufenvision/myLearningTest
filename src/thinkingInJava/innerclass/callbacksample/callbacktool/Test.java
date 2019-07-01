package thinkingInJava.innerclass.callbacksample.callbacktool;

/**
 * @Author: dyf
 * @Date: 2019/7/1 00:09
 * @Description:
 */
public class Test {
    public static void main(String[] args){
        TimeTool timeTool = new TimeTool();

        timeTool.testTime(new CallBack() {
            @Override
            public void excute() {
                //someClass.dosomething()
                int i = 0;
                while(i < 500){
                    System.out.print(i + ",");
                    i++;
                }
                System.out.println();
            }
        });

        timeTool.testTime(new Student());
    }
}
