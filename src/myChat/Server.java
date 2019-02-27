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
 * ① 画图形界面
 * ② 建立网络连接
 * ③ 开启显示的线程
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
		//启动显示的线程
		new ServerThread(this).start();
	}
	/*建立网络连接*/
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
	/*画图形界面*/
	private void initUI(){
		ta = new TextArea();
		ta.setEditable(false);
		tf = new TextField();
		send = new Button("发送");
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		p.add(send, "East");
		
		this.add(ta,"Center");
		this.add(p, "South");
		
		addListener();
		
		this.setTitle("SB木木");
		this.setSize(300,400);
		this.setLocation(650, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/*发送按钮添加监听*/
	private void addListener(){
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//先得到数据
				String msg = tf.getText();
				//得到当前时间
				String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				//设置到ta中显示
				if(msg.length() != 0){
					ta.append("自己："+date + "\r\n"+"  "+msg+"\r\n");
					//把数据写入socket中准备传输
					try {
						dos.writeUTF(msg);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				tf.setText(""); //清空输入框
				tf.requestFocus(); //让tf获得焦点
			}
		});
	}
}
