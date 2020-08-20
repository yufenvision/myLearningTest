package mutipleThread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Author: dyf
 * @Date: 2020/8/19 17:17
 * @Description:
 */
public class MutiThread {

    public static void main(String[] args){
        //获取Java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }

        /**
         * [5] Attach Listener //添加事件
         * [4] Signal Dispatcher // 分发处理给 JVM 信号的线程
         * [3] Finalizer //调用对象 finalize 方法的线程
         * [2] Reference Handler //清除 reference 线程
         * [1] main //main 线程,程序入口
         */


    }

}
