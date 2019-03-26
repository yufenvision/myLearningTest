package mutipleThread.selltickets;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午4:50:39
* 
* 需求：
* 	某电影院上映贺岁大片，共有100张票，而它有3个售票窗口，请设计一个程序模拟该电影鸭售票
* 
*/
public class SellTicketsThread extends Thread{

	private static int tickets = 100;
	
	public void run() {
		while(tickets > 0){
			System.out.println(getName() + ": 正在售出第 " + tickets-- + " 张票。");
		}
	}
	
	public static void main(String[] args) {
		SellTicketsThread s1 = new SellTicketsThread();
		SellTicketsThread s2 = new SellTicketsThread();
		SellTicketsThread s3 = new SellTicketsThread();
		s1.setName("窗口1");
		s2.setName("窗口2");
		s3.setName("窗口3");
		
		s1.start();
		s2.start();
		s3.start();
	}
}
