package myPractise.netCode;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inetaddress = InetAddress.getByName("192.168.1.102"); 
		
		System.out.println(inetaddress.getHostName());
	}
}
