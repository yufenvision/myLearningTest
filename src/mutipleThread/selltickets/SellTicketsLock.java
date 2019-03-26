package mutipleThread.selltickets;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author dyf
* @version 创建时间：2019年3月3日 下午10:14:10
* 
*/
public class SellTicketsLock implements Runnable{
	
	private static int tickets = 100;
	
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true){
			lock.lock();//加锁
			try {
				if(!(tickets > 0))return;
				Thread.sleep(100);//为了模拟真实场景我们稍作休息
				System.out.println(Thread.currentThread().getName() + ": 正在售出第 " + tickets-- + " 张票。");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				lock.unlock();//释放锁
			}
					
		}
	}
		
	public static void main(String[] args) {
		//创建资源
		SellTicketsLock sl = new SellTicketsLock();
		
		Thread t1 = new Thread(sl, "窗口1");
		Thread t2 = new Thread(sl, "窗口2");
		Thread t3 = new Thread(sl, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
