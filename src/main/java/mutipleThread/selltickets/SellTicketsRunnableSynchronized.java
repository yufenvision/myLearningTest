package mutipleThread.selltickets;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午5:30:10
* 
* * CPU的操作是原子性的，如何解决线程安全问题？
* 	要想解决问题，就要知道哪些原因会导致问题：（而且这些原因也是以后我们判断一个程序是否有线程安全问题的标准）
* 		Father:是否有多线程环境
* 		B:是否有共享数据
* 		C:是否有多条语句操作共享数据
* 	我们来回想一下我们的程序有没有上面的问题呢？
* 		Father:是否有多线程环境 			是
* 		B:是否有共享数据				是
* 		C:是否有多条语句操作共享数据		是
* 
* 如何解决问题？
* A和B的问题我们改变不了，我们只能想办法把C改变一下。
* 思想：
* 	把多条语句操作共享数据的代码包成一个整体，让某个线程执行的时候，别人不能来执行。
* 
* 	用同步代码块
* 		sychronized(对象){
* 			需要同步的代码块
* 		}
* 
* 	注意：
* 		同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
* 		多线程必须是同一把锁
* 
* 
*/
public class SellTicketsRunnableSynchronized implements Runnable{
	private static int tickets = 100;
	
//	private Object lock = new Object();
	@Override
	public void run() {
		while(true){
//			synchronized(lock){
			synchronized(this){
				if(!(tickets > 0))return;
				try {
					Thread.sleep(100);//为了模拟真实场景我们稍作休息
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ": 正在售出第 " + tickets-- + " 张票。");
					
			}
		}
		
	}
	
	public static void main(String[] args) {
		//创建资源
		SellTicketsRunnableSynchronized sr = new SellTicketsRunnableSynchronized();
		
		Thread t1 = new Thread(sr, "窗口1");
		Thread t2 = new Thread(sr, "窗口2");
		Thread t3 = new Thread(sr, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
