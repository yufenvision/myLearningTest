package myPractise.avifile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchCourseName {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//创建目标file对象
		File srcFile = new File("H:/传智播客_2015年Java基础班视频精华版");
		
		//创建一个list[Map<java_base.string,String[]>]
		List<Map<String,String[]>> list = new ArrayList<>();
		//遍历file取得第一级的所有目录名称，
		File[] fileAll = srcFile.listFiles();
			
		if(fileAll !=null){
			//遍历一级目录，将一级目录名称存入map的key,
			for (File file : fileAll) {
				if(file.isDirectory()){
					File f = file.listFiles()[0];
					Map<String,String[]> map = new HashMap<>();
					String[] s = f.list(new AviFilter());
					//进入avi文件夹，找出所有后缀为.avi文件的文件名存入String[] 再存入map的value;
					map.put(file.getName(), s);
					//将该map放入list
					list.add(map);
				}
			}
		}
		//测试代码
//		for (int i = 0; i < list.size(); i++) {
//			Map<String,String[]> map = list.get(i);
//			for (String s : map.keySet()) {
//				System.out.println(s+":"+Arrays.toString(map.get(s)));
//			}
//		}
		
		/**
		 * 创建一个list[Map<java_base.string,String[]>]
		 * 
		 * 遍历file
		 * 	取得第一级的所有目录名称，
		 * 		
		 * 		遍历一级目录，
		 * 			将一级目录名称存入map的key,
		 * 			进入avi文件，找出所有后缀为.avi文件的文件名存入String[] 再存入map的value;
		 * 		将该map放入list
		 * 
		 * 
		 * 
		 */
		System.out.println(saveTxt("H:/传智播客_2015年Java基础班视频精华版/aviFilesName.txt",list));
		
		
	}
	
	//将数据存入一个txt文件中
	public static Boolean saveTxt(String fileURL,List<Map<String,String[]>> list) throws FileNotFoundException{
		//把list文件中的数据写入到txt
		File file = new File(fileURL);
		
		PrintStream ps = new PrintStream(file);
		
		try {
			for (int i = 0; i < list.size(); i++) {
				Map<String,String[]> map = list.get(i);
				for (String s : map.keySet()) {
					ps.println(s);
					String[] strs = map.get(s);
					for (String string : strs) {
						ps.println(string);
					}
					ps.println();
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}
		return false;
	}
}
