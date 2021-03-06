package java_mutiple_thread.threadpriority;
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
		p1.setName("该线程优先级10 ");
		p1.setPriority(10);
		p2.setName("该线程优先级1 ");
		p2.setPriority(1);
		p3.setName("该线程默认优先级5 ");
		//线程优先级的范围是1-10，默认5,线程优先级高仅仅表示线程获取CPU时间片的几率高。
		System.out.println("主线程优先级：" + Thread.currentThread().getPriority());//主线程的优先级是5
		System.out.println("p1线程优先级：" + p1.getPriority());
		System.out.println("p2线程优先级：" + p2.getPriority());//线程的默认优先级是5
		System.out.println("p3线程优先级：" + p3.getPriority() + "\n");
		p1.start();
		p2.start();
		p3.start();
	}
}
