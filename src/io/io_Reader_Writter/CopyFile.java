package io.io_Reader_Writter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CopyFile {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		copyFile("D:/333.txt","D:/print.txt");
	}
	
	public static void copyFile(String src,String des) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(src));
		PrintStream ps = new PrintStream(des);
		
		while(sc.hasNext()){
			ps.println(sc.next());
		}
		
		sc.close();
		ps.close();
	}
	
}
