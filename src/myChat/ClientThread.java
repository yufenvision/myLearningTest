package myChat;

import java.awt.TextArea;
import java.io.DataInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ݲ���ʾ
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
		//���������--�������
		DataInputStream dis = client.getDis();
		//��õ�ta��ʾ���
		TextArea ta = client.getTa();
		//�ѻ��������ʾ��ta�����
		while(true){
			try {
				String msg = dis.readUTF();
				String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				ta.append("�û���" + date + "\r\n"+"  "+msg+"\r\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
}
