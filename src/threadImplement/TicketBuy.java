package threadImplement;


public class TicketBuy implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num>0){
//			ͬ����������
			synchronized (this) {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"��������"+num+"��Ʊ");
					num--;
				}
			}
			
		}
	}
	
}
