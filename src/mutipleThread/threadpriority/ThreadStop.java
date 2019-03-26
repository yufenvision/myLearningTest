package mutipleThread.threadpriority;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author dyf
* @version 创建时间：2019年3月3日 下午4:12:24
* 
*/
public class ThreadStop extends Thread{
	SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	
	public void run(){
		
		System.out.println(getName() + "线程开始： " + getNowTime());
		try {
			System.out.println(getName() + "开始睡觉... " + getNowTime() );
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName() + "线程结束了... " + getNowTime());
	}

	public String getNowTime(){
		return sm.format(System.currentTimeMillis()); 
	}
	
	public static void main(String[] args) {
		ThreadStop s1 = new ThreadStop();
		s1.setName("睡觉线程");
		s1.start();
		
		//超过三秒钟不醒来，就杀死该线程
		try {
			Thread.sleep(3000);
			s1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
