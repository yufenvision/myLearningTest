package myPractise.downLoad;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class WordDownLoad {
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("<div class=\"step2-container__content\" style=\"width: 860px;height: 430px;border:1px solid #e2e2e2;color: #525252;\" titleid=\"11\">".substring(12, 16));
		String url = "c:/qss/temp";
	
		File file = new File(url);
		if(!file.exists()){
			file.mkdirs();
		}
		String path = url + "/" + "word.doc";
//		String path = url + "/" + "word.html";
		//将txt文件读取出来，存到字符串
		InputStream is = new FileInputStream("c:/qss/temp/word1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuffer bf = new StringBuffer();
		String read = null;
		bf.append("<html><body>");
		while((read=br.readLine())!=null){
//			System.out.println(read.trim());
			bf.append(read.trim());
		}
		//添加上html和body
		bf.append("</body></html>");
		br.close();
		is.close();
		System.out.println(bf.toString());
		
		//调用POI的创建word方法，将该字符串输入其中
		InputStream i = new ByteArrayInputStream(bf.toString().getBytes("GBk"));
		OutputStream o = new FileOutputStream(path);
//		html2word(i,o);
	}
	
//	public static <POIFSFileSystem> void html2word(InputStream is,OutputStream os){
//		POIFSFileSystem fs = new POIFSFileSystem();
//		try {
//			fs.createDocument(is, "WordDocument");
//			fs.writeFilesystem(os);
//			os.close();
//			is.close();
//			System.out.println("生成完毕！");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
}
