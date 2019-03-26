package mutipleThread.selltickets;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午5:06:07
* 

*/
public class SellTicketsRunnable implements Runnable{
	private static int tickets = 100;
	
	@Override
	public void run() {
		while(tickets > 0){
			//t1,t2,t3三个线程
			//这一次的tickets = 100;
			try {
				Thread.sleep(100);//为了模拟真实场景我们稍作休息
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": 正在售出第 " + tickets-- + " 张票。");
		}
		
	}
	
	public static void main(String[] args) {
		//创建资源
		SellTicketsRunnable sr = new SellTicketsRunnable();
		
		Thread t1 = new Thread(sr, "窗口1");
		Thread t2 = new Thread(sr, "窗口2");
		Thread t3 = new Thread(sr, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
