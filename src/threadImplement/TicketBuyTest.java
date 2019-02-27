package threadImplement;

public class TicketBuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBuy t = new TicketBuy();
		Thread t1 = new Thread(t,"老人窗口");
		Thread t2 = new Thread(t,"孕妇窗口");
		Thread t3 = new Thread(t,"程序员窗口");
		t1.start();
		t2.start();
		t3.start();
	}

}
