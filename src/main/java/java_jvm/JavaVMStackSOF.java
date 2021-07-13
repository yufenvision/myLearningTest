package java_jvm;

import javax.sound.midi.Soundbank;

/**
 * @Author: dyf
 * @Date: 2021/7/6 21:50
 * @Description:
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }

    }
}
