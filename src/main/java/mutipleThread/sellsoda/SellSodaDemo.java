package mutipleThread.sellsoda;

/**
 * 等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait();等待
 * 			notify();唤醒单个线程
 * 			notifyAll();唤醒所有线程
 * 		为什么这些方法不定义在Thread类中呢？
 * 			这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象
 * 			所以，这些方法必须定义在Object类中。
 *
 *最终版代码中:
 *		把student的成员变量给私有了
 *		把设置和获取操作给封装成了功能，并加了同步。
 *		设置或者获取的线程里面需要调用方法即可。
 */
public class SellSodaDemo {
	
	public static void main(String[] args) {
		//创建汽水对象
		Soda soda = new Soda();
		
		//创建汽水买家与卖家资源
		SetSoda set = new SetSoda(soda);
		GetSoda get = new GetSoda(soda);
		
		
		Thread t1 = new Thread(set,"汽水店");
		Thread t2 = new Thread(get,"买汽水");
		
		t1.start();
		t2.start();
	}
	
	
	
}
