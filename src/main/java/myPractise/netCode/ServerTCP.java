package myPractise.netCode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
	public static void main(String[] args) throws IOException {
		//创建服务器Socket对象
		ServerSocket ss = new ServerSocket(9999);
		
		//监听客户端的连接
		Socket s = ss.accept();//阻塞1，等client来连
		
		//获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);//阻塞2，一定要读到client的数据
		String server = new String(bys,0,len);
		System.out.println("server:"+server);
		
		//获取输出流
		OutputStream os = s.getOutputStream();
		os.write("数据已经收到".getBytes()); 
		
		//释放资源
		s.close();
		//ss.close();
		
	}
}
