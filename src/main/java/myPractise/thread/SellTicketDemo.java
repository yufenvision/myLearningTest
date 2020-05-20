package myPractise.thread;

public class SellTicketDemo {
	public static void main(String[] args) throws InterruptedException {
		//创建资源对象
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");
		
		t1.start();
//		t1.join();
		t2.start();
		t3.start();
		
		
	}
}
