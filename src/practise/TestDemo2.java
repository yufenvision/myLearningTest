package practise;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tmain = Thread.currentThread();
		System.out.println("�������Ƿ��Ǻ�̨�̣߳�----"+tmain.isDaemon());
		
		Thread t = new Thread();
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		
		DaemonThread ddt = new DaemonThread();
		System.out.println("ddt�Ƿ�Ϊ��̨�߳�"+ddt.isDaemon());
		ddt.setDaemon(true);
		System.out.println("��ddt����Ϊ��̨�߳�"+ddt.isDaemon());
		ddt.start();

	}

}
class DaemonThread extends Thread{
	@Override
	public void run(){
		Thread tt = new Thread();
		System.out.println("tt�߳��Ƿ�Ϊ��̨�̣߳�"+tt.isDaemon());
	}
	
}