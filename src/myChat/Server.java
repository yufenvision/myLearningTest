package myChat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

/**
 * �� ��ͼ�ν���
 * �� ������������
 * �� ������ʾ���߳�
 *
 */
public class Server extends JFrame{
	private TextArea ta;
	private TextField tf;
	private Button send;
	private Socket socket;
	private ServerSocket server;
	private DataOutputStream dos;
	private DataInputStream dis;
	
	public TextArea getTa() {
		return ta;
	}
	public DataInputStream getDis() {
		return dis;
	}
	public Server(){
		initUI();
		initConn();
		//������ʾ���߳�
		new ServerThread(this).start();
	}
	/*������������*/
	private void initConn(){
		try {
			server = new ServerSocket(10086);
			socket = server.accept();
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
		}catch(UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/*��ͼ�ν���*/
	private void initUI(){
		ta = new TextArea();
		ta.setEditable(false);
		tf = new TextField();
		send = new Button("����");
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		p.add(send, "East");
		
		this.add(ta,"Center");
		this.add(p, "South");
		
		addListener();
		
		this.setTitle("SBľľ");
		this.setSize(300,400);
		this.setLocation(650, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/*���Ͱ�ť��Ӽ���*/
	private void addListener(){
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ȵõ�����
				String msg = tf.getText();
				//�õ���ǰʱ��
				String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				//���õ�ta����ʾ
				if(msg.length() != 0){
					ta.append("�Լ���"+date + "\r\n"+"  "+msg+"\r\n");
					//������д��socket��׼������
					try {
						dos.writeUTF(msg);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				tf.setText(""); //��������
				tf.requestFocus(); //��tf��ý���
			}
		});
	}
}
