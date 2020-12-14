package java_io.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: dyf
 * @Date: 2020/12/14 23:20
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream out = socket.getOutputStream();
        String s = "hello world";
        out.write(s.getBytes());
        out.close();
    }

}
