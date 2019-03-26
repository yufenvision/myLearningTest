package gather.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties ppt = new Properties();
		
		ppt.setProperty("1","红烧豆腐");
		ppt.setProperty("2","撒地方");
		ppt.setProperty("3","啊啊");
		ppt.setProperty("4","GHJ");
		ppt.setProperty("5","123");
		System.out.println(ppt);
		
		
		//��ô��Ŵ����ļ�
		PrintStream ps = new PrintStream("1.txt");
		ppt.list(ps);
		
		//��ô�Ӵ����ж����ļ�
		Properties ppt1 = new Properties();
		FileInputStream fies = new FileInputStream("E:\\eclipse\\workspace\\practise\\1.txt");
		ppt1.load(fies);
		System.out.println(ppt1);
	}

}
