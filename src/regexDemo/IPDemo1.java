package regexDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPDemo1 {

	/**
	 * ���IP��ַ����ķţ�ͨ�����þ�̬ �Ĺ�������
	 * static InetAddress getLocalHost() ���ر��������� 
	 * static InetAddress[] getAllByName(String host) �ڸ���������������£�����ϵͳ�����õ����Ʒ��񷵻��� IP ��ַ����ɵ����顣 
	   static InetAddress getByAddress(byte[] addr)  �ڸ���ԭʼ IP ��ַ������£����� InetAddress ���� 
	   static InetAddress getByAddress(String host, byte[] addr) �����ṩ���������� IP ��ַ���� InetAddress�� 
	   static InetAddress getByName(String host) �ڸ����������������ȷ�������� IP ��ַ�� 
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		InetAddress ip1 = InetAddress.getLocalHost();
		InetAddress ip2 = InetAddress.getByName("yuf-set");
		InetAddress ip3 = InetAddress.getByAddress(new byte[]{(byte)192,(byte)168,1,102});
		System.out.println(ip1);
		System.out.println(ip2);
		System.out.println(ip3);
		byte[] b = ip1.getAddress();
		System.out.println(Arrays.toString(b));
		System.out.println((byte)192);
		System.out.println(ip1.isReachable(1));
	}

}
