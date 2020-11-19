package java_mutiple_thread.showmutiplethread;
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

	//这里不会有线程安全的问题，因为num是局部变量，存储在虚拟机栈中，而虚拟机栈是线程私有的。
	public static void main(String[] args) {
		CounterNum my1 = new CounterNum();
		CounterNum my2 = new CounterNum();
		System.out.println(Thread.currentThread().getName());
		my1.start();
		my2.start();
	}
}
