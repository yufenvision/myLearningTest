package tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	/**
	 * 模拟客户端发送数据
	 * ① 内置一个socket对象
	 * ② 通过①来获得一个输出流，并把数据写入socket当中
	 * ③ 建立连接
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getLocalHost(),6666);
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println("今晚有空吗？");
		ps.close();
		s.close();
	}
}
