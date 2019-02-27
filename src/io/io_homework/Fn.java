package io.io_homework;

import java.io.File;

public class Fn {
	
	public static void main(String[] args) {
		deleteAll(new File("D:/a"));
	}
	
	
	public static void deleteAll(File f){
		
		if(f.exists()){
			if(f.isFile()){//判断是不是文件f(0)=0
				f.delete();
			}else{//不是文件就是目录f(1)=1;
				File[] files = f.listFiles();
				if(files == null){
					f.delete();
				}else{
					for (File file : files) {
						deleteAll(file);
					}
					f.delete();
				}
			}
		}
		
	}
}
