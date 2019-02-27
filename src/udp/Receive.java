package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
	/**
	 * ģ�����ݽ���
	 * 		DatagramSocket
	 * 			DatagramScoket(int port)
	 * 		���շ�����
	 * 			void receive(DatagramPacket p)�ѽ��յ������ݷ���p��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramPacket dp = new DatagramPacket(new byte[14],14);
		DatagramSocket ds = new DatagramSocket(10086);
		ds.receive(dp);
		
		//��δ�dp��ȡ�����ݣ�byte[] getData() �������ݻ�����
		System.out.println(new String(dp.getData()));
		
		ds.close();
	}
}
