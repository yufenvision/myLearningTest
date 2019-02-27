package myPractise.thread;

/**
 * 实现Runnable接口的方式实现
 * 
 * 通过假如延迟后，就产生了两个问题
 * A:相同的票卖了多次
 * 		CPU的每一次执行必须是一个原子性（最简单基本的）的操作。
 * B:出现了负数票
 * 		随机性和延迟导致的
 * 
 * 线程安全问题
 * 如何解决线程安全问题呢？
 * 要想解决问题，就要知道哪些原因会导致出问题：（而且这些原因也是以后我们判断一个程序是否会有线程安全问题的标准）
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * 
 * 我们来回想一下我们的程序有没有上面的问题呢？
 * A,B,C都为是
 * 
 * 由此可见我们的程序出现问题是正常的，因为它满足出问题的条件
 * 接下来才是我们要想象如何解决问题呢？
 * A和B的问题我们改变不了，我们只能想办法去把C改变一下。
 * 思想：	
 * 		把多条语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，别人不来能执行。
 * 问题是我们不知道怎么包？其实我也不知道，但是Java给我们提供了。同步机制。
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码；
 * 		}
 * 		A:对象是什么呢？
 * 			我们可以随便创建一个对象试试。
 * 		B:需要同步的代码是哪些呢？
 * 			把多条语句操作共享数据的代码部分给包起来
 * 
 * 		注意：
 * 			同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁功能。
 * 			多个线程必须是同一把锁
 * 
 * A:同步代码块的锁对象是谁呢？
 * 		任意对象
 * 
 * B:同步方法的格式及锁对象问题？
 * 		把同步关键字加在方法上。
 * 		同步方法是谁呢？
 * 		this
 * C:静态方法及锁方法问题？
 * 		谁比静态先存在？（类的字节码文件对象）
 * 		静态方法的锁对象是谁呢？
 * 		当前类的class对象，类的字节码文件对象
 * 
 */
public class SellTicket implements Runnable{
	//定义100张票
	private int tickets = 100;
	//创建锁对象
	private Object obj = new Object();
	
//	@Override
//	public void run() {
		//t1,t2,t3三个线程
		//这一次的tickets = 100;
//		while(true){
//			//为模拟真实的场景，我们稍作休息
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			if(tickets>0){
//				System.out.println(Thread.currentThread().getName()+"正在卖"+(tickets--)+"张票");
//			}
//			//理想状态：
//			//窗口1正在出售100张票
//			//窗口2正在出售第99张票
//			//但是呢？？？
//			//CPU的每一次执行必须是一个原子性（最简单基本的）的操作。
//			//先记录以前的值
//			//接着把ticket--
//			//然后输出以前的值（t2来了）
//			//窗口1正在出售第100张票
//			//窗口2正在出售第100张票
//			
//		}
//	}
	
	
//	@Override
//	public void run() {
//		while(true){
//			synchronized(new Object()){
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				if(tickets>0){
//					System.out.println(Thread.currentThread().getName()+"正在卖"+(tickets--)+"张票");
//				}
//			}
//			
//		}
//	}
	
	@Override
	public void run() {
		while(tickets>0){
//			synchronized(obj){
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				if(tickets>0){
//					System.out.println(Thread.currentThread().getName()+"正在卖"+(tickets--)+"张票");
//				}
//			}
//			
			setTicket();
		}
	}
		
	private synchronized void setTicket(){
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+"正在卖"+(tickets--)+"张票");
		}
	}
			
}
