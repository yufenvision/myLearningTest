package runnableMoney;

/**
 * @author SEELE
 * ´æ¿îÏß³Ì
 */
public class SaveThread implements Runnable{
	Account a;
	public SaveThread(Account a){
		super();
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++){
			try {
				a.save();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
