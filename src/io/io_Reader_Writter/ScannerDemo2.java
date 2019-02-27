package io.io_Reader_Writter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println(s.next());
		s.close();
		
		//ʹ��BufferReader����ȡ����̨����
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println(br.readLine());
//
//		
//		br.close();
	}
}
