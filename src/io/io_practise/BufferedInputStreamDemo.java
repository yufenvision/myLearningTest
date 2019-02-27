package io.io_practise;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/1.txt"));
		byte[] b = new byte[5];
		int len;
		while((len = bis.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		bis.close();
		
		BufferedReader br = new BufferedReader(new FileReader("D:/1.txt"));
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}

}
