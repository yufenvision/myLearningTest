package myPractise.avifile;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;


public class GatherAviName {

	/**
	 * 需求：收集27天课程中，avi文件的名字，并存储在txt文件中，按天数分类。
	 * 		打开一天的文件
	 * 			循环读取其中的avi文件
	 * 			并写入新的txt文件中
	 * 
	 * 		读取这个txt文件，打印出其中的字符
	 * 
	 * 		将多天的文件存储为file数组
	 * 			遍历此数组找到并过滤出avi文件
	 * 			用打印流写入txt文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File aviNameAll = new File("E:/","aviName.txt");
		System.out.println(aviNameAll.createNewFile());
		
		File[] fileAll = fileArr("H:\\源代码基础班\\视频\\day",27);
		String[] listTemp;
		String[][] nameArr = new String[27][];
		
		PrintStream ps = new PrintStream(aviNameAll);
		for (int i = 0;i < fileAll.length;i++) {
			listTemp = fileAll[i].list(new AviFilter());
			
			if(listTemp != null && listTemp.length == 0){
				String newStr = fileAll[i].getPath()+"/video";
				listTemp = new File(newStr).list(new AviFilter());
			}
			nameArr[i] = listTemp;
			//为什么循环到这里报空指针？因为不加null判断，nameArr里面有Null
			if(nameArr[i] != null){
				ps.println("第："+fileAll[i].getPath()+"天课程");
				for (String s : nameArr[i]) {
//					System.out.println(s);
					ps.println(s);
				}
				ps.println();
			}			
		}
		
		ps.close();
		
	}
	

	public static File[] fileArr(String fileName,int days){
		String[] nameAll = new String[days];
		File[] fileAll = new File[days];
		for (int i = 0; i < days; i++) {
			nameAll[i] = fileName+String.valueOf(i+1);
			fileAll[i] = new File(nameAll[i]); 
		}

		return fileAll;
		
	}
	

}