package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Send {
	/**
	 * DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
          	�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String msg = "�������";
		byte[] buf = msg.getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),10086);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}
}
