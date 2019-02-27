package io.io_Reader_Writter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo1 {

	/**
	 * Scanner��ȡ�ļ�
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("D:/111.txt"));
		//next��ȡ�����ļ�
//		while(s.hasNext()){
//			System.out.println(s.next());
//		}
		//nextLine��ȡ�����ļ�
//		s.useDelimiter("_");
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		
		s.close();
	}

}
