package thread;

public class TicketTestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long time1 = System.currentTimeMillis();
		TicketThread t1 = new TicketThread("���˴���"); 
		TicketThread t2 = new TicketThread("�и�����"); 
		TicketThread t3 = new TicketThread("����Ա����"); 
		
		t1.start();
		t2.start();
		t3.start();	
		
		Long time2 = System.currentTimeMillis();
		System.out.println("��ʱ"+(time2- time1)+"����");
	}

}
