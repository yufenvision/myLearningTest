package runnableMoney;

public class GetThread implements Runnable{
	Account a;
	public GetThread(Account a) {
		super();
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++){
			try {
				a.getMoney();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
