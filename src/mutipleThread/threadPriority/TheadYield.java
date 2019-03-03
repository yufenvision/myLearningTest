package mutipleThread.threadPriority;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午3:46:13
* 
*/
public class TheadYield extends Thread{
	public void run(){
		int num = 0;
		while(true){
			System.out.println(getName() + ":" + num);
			if(++num > 100)break;
			Thread.yield();
			/*
			 * 暂停当前正在执行的线程，并执行其他线程
			 * 让多个线程执行更和谐，然是不能保证一人一次的来
			 */
		}
		
	}
	
	public static void main(String[] args) {
		TheadYield y1 = new TheadYield();
		TheadYield y2 = new TheadYield();
		y1.setName("你先来");
		y2.setName("^_^您先来");
		
		y1.start();
		y2.start();
	}
}
