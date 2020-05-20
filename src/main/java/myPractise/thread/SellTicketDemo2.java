package myPractise.thread;

/*
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock。
 * 
 * Lock：
 * 		void lock()： 获取锁。
 * 		void unlock():释放锁。  
 * ReentrantLock是Lock的实现类.
 */
public class SellTicketDemo2 {
	public static void main(String[] args) throws InterruptedException {
		//创建资源对象
		SellTicket2 st2 = new SellTicket2();
		
		Thread t1 = new Thread(st2,"窗口1");
		Thread t2 = new Thread(st2,"窗口2");
		Thread t3 = new Thread(st2,"窗口3");
		
		t1.start();
//		t1.join();
		t2.start();
		t3.start();
		
		
	}
}
