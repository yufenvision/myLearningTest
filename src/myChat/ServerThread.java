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
public class ServerThread extends Thread{
	private Server server;
	
	public ServerThread(Server server){
		super();
		this.server = server;
	}
	@Override
	public void run(){
		//���������--�������
		DataInputStream dis = server.getDis();
		//��õ�ta��ʾ���
		TextArea ta = server.getTa();
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
