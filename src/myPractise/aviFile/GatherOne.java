package myPractise.aviFile;

import java.io.File;

public class GatherOne {

	public static void main(String[] args) {
		File one = new File("H:\\源代码基础班\\视频\\day24");
		String[] oneStr = one.list(new AviFilter());
		String newStr = one.getPath()+"\\vedio";
		System.out.println(newStr);
		for (String s : oneStr) {
			System.out.println(s);
		}
	}

}
