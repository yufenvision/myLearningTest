package regexDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPDemo1 {

	/**
	 * 获得IP地址对象的放，通过调用静态 的公共方法
	 * static InetAddress getLocalHost() 返回本地主机。 
	 * static InetAddress[] getAllByName(String host) 在给定主机名的情况下，根据系统上配置的名称服务返回其 IP 地址所组成的数组。 
	   static InetAddress getByAddress(byte[] addr)  在给定原始 IP 地址的情况下，返回 InetAddress 对象。 
	   static InetAddress getByAddress(String host, byte[] addr) 根据提供的主机名和 IP 地址创建 InetAddress。 
	   static InetAddress getByName(String host) 在给定主机名的情况下确定主机的 IP 地址。 
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
