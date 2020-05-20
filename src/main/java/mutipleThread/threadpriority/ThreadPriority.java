package mutipleThread.threadpriority;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午3:23:18
* 
*/
public class ThreadPriority extends Thread{
	
	public void run(){
		int num = 0;
		while(true){
			System.out.println(getName() + ":" + num);
			if(++num > 100)break;
		}
		
	}

	public static void main(String[] args) {
		ThreadPriority p1 = new ThreadPriority();
		ThreadPriority p2 = new ThreadPriority();
		ThreadPriority p3 = new ThreadPriority();
		p1.setName("该线程优先级10");
		p1.setPriority(10);
		p2.setName("该线程优先级1");
		p2.setPriority(1);
		//线程优先级的范围是1-10，默认5,线程优先级高仅仅表示线程获取CPU时间片的几率高。
		System.out.println(Thread.currentThread().getPriority());//主线程的优先级是5
		System.out.println(p1.getPriority());//线程的默认优先级是5
		System.out.println(p2.getPriority());
		System.out.println(p3.getPriority());
		p1.start();
		p2.start();
		p3.start();
	}
}
