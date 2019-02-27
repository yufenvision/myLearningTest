package myPractise.thread;


public class Start {
	
	
	public static void main(String[] args) {
		//extendThread();
		//interfaceThread();
		
		new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("xxx");
			}

		});
	}
	
	
	public static void extendThread(){
		//创建线程对象
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		//启动线程
//				my.run();
//				my.run();
		//为什么调用run方法看不到多线程效果？因为run方法调用其实相当于普通方法调用；
		
		//面试题：run()和start()的区别？
		//run():仅仅是封装被线程执行的代码，直接调用的普通方法
		//start():首先启动了线程，然后再由jvm去调用该线程的run()方法；
		System.out.println(Thread.currentThread().getName());
		my.start();
		my1.start();
	}
	
	public static void interfaceThread(){
		
		MyRunnable my = new MyRunnable();
		
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		
		t1.start();
		t2.start();
	}
}
