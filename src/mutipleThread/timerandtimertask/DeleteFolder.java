package mutipleThread.timerandtimertask;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 递归删除文件
 *
 */
public class DeleteFolder extends TimerTask{

	private Timer t;
	private String folderUrl;
	
	public DeleteFolder(String folderUrl,Timer t) {
		this.folderUrl = folderUrl;
		this.t = t;
	}

	@Override
	public void run() {
		File srcFolder = new File(folderUrl);
		deleteFolder(srcFolder);
		t.cancel();
	}

	private void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if(fileArray!=null){
			for (File file : fileArray) {
				if(file.isDirectory()){
					deleteFolder(file);
				}else{
					System.out.println(file.getName()+":"+file.delete());
				}
			}
			System.out.println(srcFolder.getName()+":"+srcFolder.delete());
		}
	}
	
}
