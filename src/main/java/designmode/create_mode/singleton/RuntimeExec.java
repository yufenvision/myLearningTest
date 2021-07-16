package designmode.create_mode.singleton;

import java.io.IOException;

/**
 * @Author: dyf
 * @Date: 2019/5/20 22:37
 * @Description:
 * Runtime：每个Java应用程序都有一个Runtime类实例，使应用程序能够与其运行的环境相连接。
 * exec(String command)
 */
public class RuntimeExec {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
//        r.exec("cmd");//打不开，兼容性问题？
//        r.exec("notepad");
//        r.exec("calc");
//        r.exec("shutdown -s -t 600");
        r.exec("shutdown -a");
    }
}
