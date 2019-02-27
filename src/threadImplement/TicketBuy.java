package threadImplement;


public class TicketBuy implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num>0){
//			同步监听对象
			synchronized (this) {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"正在卖第"+num+"张票");
					num--;
				}
			}
			
		}
	}
	
}
