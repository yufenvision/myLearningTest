package myPractise.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 */
public class SellTicket2 implements Runnable{
	//定义100张票
	private int tickets = 100;
	//定义锁对象
	private Lock lock= new ReentrantLock(); 
			

	@Override
	public void run() {
		while(true){
			try {
				//加锁
				lock.lock();
				if(tickets>0){
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"正在卖"+(tickets--)+"张票");
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			}finally{
				//解锁
				lock.unlock();
			}
			
		}
		
	}}
