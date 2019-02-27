package practise;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tmain = Thread.currentThread();
		System.out.println("主进程是否是后台线程：----"+tmain.isDaemon());
		
		Thread t = new Thread();
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		
		DaemonThread ddt = new DaemonThread();
		System.out.println("ddt是否为后台线程"+ddt.isDaemon());
		ddt.setDaemon(true);
		System.out.println("把ddt设置为后台线程"+ddt.isDaemon());
		ddt.start();

	}

}
class DaemonThread extends Thread{
	@Override
	public void run(){
		Thread tt = new Thread();
		System.out.println("tt线程是否为后台线程："+tt.isDaemon());
	}
	
}