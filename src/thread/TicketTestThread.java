package thread;

public class TicketTestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long time1 = System.currentTimeMillis();
		TicketThread t1 = new TicketThread("老人窗口"); 
		TicketThread t2 = new TicketThread("孕妇窗口"); 
		TicketThread t3 = new TicketThread("程序员窗口"); 
		
		t1.start();
		t2.start();
		t3.start();	
		
		Long time2 = System.currentTimeMillis();
		System.out.println("耗时"+(time2- time1)+"毫秒");
	}

}
