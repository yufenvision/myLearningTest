package io.io_practise;

import java.io.File;
import java.io.FilenameFilter;

public class TxtFilenameFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
//		return false;
		return name.endsWith(".avi");
	}
	
}
