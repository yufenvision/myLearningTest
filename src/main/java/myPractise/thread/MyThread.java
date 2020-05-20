package myPractise.thread;

public class MyThread extends Thread{
	@Override
	public void run() {
		//System.out.println("覆写了父类的Run方法");
		//一般来说被线程执行的代码肯定是比较耗时的,所以用循环来改进
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+":"+i);
		}
	}
	
}
