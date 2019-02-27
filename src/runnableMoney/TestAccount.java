package runnableMoney;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account a = new Account();
		 a.setBalance(0);
		 SaveThread save = new SaveThread(a);
		 GetThread get = new GetThread(a);
		 new Thread(save).start();
		 new Thread(get).start();
	}

}
