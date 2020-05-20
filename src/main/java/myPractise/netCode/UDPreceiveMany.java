package myPractise.netCode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 可以接收多次
 *
 */
public class UDPreceiveMany {
	public static void main(String[] args) throws IOException {
		//创建接收端的Socket对象
		DatagramSocket ds = new DatagramSocket(12300);
		
		while(true){
			//创建一个包裹
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			
			//接收数据
			ds.receive(dp);
			
			//解析数据
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println("from"+ip+"data is:"+s);
			
		}
		
		//释放资源
		//接收端应该一直开着等待接收数据，是不需要关闭
		//ds.close();
	}
}
