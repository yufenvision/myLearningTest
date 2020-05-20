package myPractise.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable{
private DatagramSocket ds;
	
	public ReceiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
