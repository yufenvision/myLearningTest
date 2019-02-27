package myChat;

import java.awt.TextArea;
import java.io.DataInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 接受数据并显示
 *
 */
public class ClientThread extends Thread{
	private Client client;
	
	public ClientThread(Client client){
		super();
		this.client = client;
	}
	@Override
	public void run(){
		//获得输入流--获得数据
		DataInputStream dis = client.getDis();
		//获得到ta显示组件
		TextArea ta = client.getTa();
		//把获得数据显示到ta组件中
		while(true){
			try {
				String msg = dis.readUTF();
				String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				ta.append("好基友" + date + "\r\n"+"  "+msg+"\r\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
}
