package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
	/**
	 * 模拟数据接收
	 * 		DatagramSocket
	 * 			DatagramScoket(int port)
	 * 		接收方法：
	 * 			void receive(DatagramPacket p)把接收到的数据放在p中
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramPacket dp = new DatagramPacket(new byte[14],14);
		DatagramSocket ds = new DatagramSocket(10086);
		ds.receive(dp);
		
		//如何从dp中取出数据？byte[] getData() 返回数据缓冲区
		System.out.println(new String(dp.getData()));
		
		ds.close();
	}
}
