package mutipleThread.showMutipleThread;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午2:09:59
* 
*/
public class CounterNum extends Thread{
	
	public void run(){
		int num = 0;
		while(true){
			System.out.println(getName() + ":" + num);
			if(++num > 100)return;
		}
	}

	
	public static void main(String[] args) {
		CounterNum my1 = new CounterNum();
		CounterNum my2 = new CounterNum();
		System.out.println(Thread.currentThread().getName());
		my1.start();
		my2.start();
	}
}
