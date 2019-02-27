package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/**
	 * 模拟服务端（接受端）
	 * ① 内置一个ServerSocket
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(6666);
		Socket client = s.accept();
		BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println(r.readLine());
		r.close();
		s.close();
		
	}
}
