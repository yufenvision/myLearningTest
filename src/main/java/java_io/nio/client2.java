package java_io.nio;

import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;

/**
 * @Author: dyf
 * @Date: 2020/12/14 23:38
 * @Description:
 */
public class client2 {
    public static void main(String[] args) throws IOException {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((LocalDateTime.now() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
