package regexDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	/**
	 * http://192.168.5.100:8080/docs/RELEASE-NOTES.txt
	 * 构造方法：
	 * 	 URL(String protocol,String host,int port,String file)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		URL u = new URL("http","192.168.5.100",8080,"xx");
		InputStream is = u.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
		
		reader.close();
	}

}
