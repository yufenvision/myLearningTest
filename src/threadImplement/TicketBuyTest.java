package threadImplement;

public class TicketBuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBuy t = new TicketBuy();
		Thread t1 = new Thread(t,"���˴���");
		Thread t2 = new Thread(t,"�и�����");
		Thread t3 = new Thread(t,"����Ա����");
		t1.start();
		t2.start();
		t3.start();
	}

}
