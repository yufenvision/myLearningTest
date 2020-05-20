package mutipleThread.threadpriority;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午3:56:19
* 
* public final void setDaemon(boolean on)将该线程标记为守护线程或用户线程。
* 当正在运行的线程都是守护线程时，Java 虚拟机退出。 
* 该方法必须在启动线程前调用。
* 
* 
*/
public class ThreadDaemon extends Thread{
	
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}

	
	public static void main(String[] args) {
		ThreadDaemon d1 = new ThreadDaemon();
		ThreadDaemon d2 = new ThreadDaemon();
		d1.setName("守护线程1");
		d2.setName("守护线程2");
		//设置守护线程
		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		
		Thread.currentThread().setName("主线程");
		for (int i = 0; i < 5; i++) {
			if(i == 4)
				System.out.println(Thread.currentThread().getName() + ":" + i + "========挂了");
			else
				System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
	}
	
}
