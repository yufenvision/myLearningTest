package myTest.anyTest;

import java.util.ResourceBundle;

public class GetProperties {
	public static void main(String[] args) {
		//hhh.properties在包myTest.anyTest下
		ResourceBundle resource = ResourceBundle.getBundle("myTest.anyTest.hhh");
		System.out.println(resource.getString("server_ip"));
		
		//xx.properties在src目录下
		ResourceBundle resource1 = ResourceBundle.getBundle("xx");
		System.out.println(resource1.getString("server_ip"));
		
	}
}
