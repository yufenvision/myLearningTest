package myTest.isExist;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIsExist {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		String storage = "D:\\nfs\\media\\"; 
		File mainFile = new File(storage);
//		List<String> fileFullNames = new ArrayList<>();
//		String[] fileFullNames ={};
//		File[] files = mainFile.listFiles();
//		for (File file : files) {
//			if(file.isDirectory()){
//				String[] names = file.list();
//				int desRawLength = fileFullNames.length;
//				fileFullNames = Arrays.copyOf(fileFullNames, fileFullNames.length+names.length);
//				System.arraycopy(names,0, fileFullNames, desRawLength, names.length);
//			}
//		}
		List<String> fileFullNames = new ArrayList<>();
		File[] files = mainFile.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				File[] fileNames = file.listFiles();
				List<String> names = new ArrayList<>(fileNames.length);
				for (File f : fileNames) {
					names.add(file.getName()+"/"+f.getName());
				}
				fileFullNames.addAll(names);
			}
		}
		String[] xx = {};
		System.out.println(fileFullNames);
		System.out.println(fileFullNames.size());
	}
}
