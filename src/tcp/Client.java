package tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	/**
	 * ģ��ͻ��˷�������
	 * �� ����һ��socket����
	 * �� ͨ���������һ�����������������д��socket����
	 * �� ��������
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getLocalHost(),6666);
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println("�����п���");
		ps.close();
		s.close();
	}
}
