package mutipleThread.threadPool;

import java.util.concurrent.Callable;

//Callable是代泛型的接口
public class MyCallable implements Callable<Integer>{

//	@Override
//	public Object call() throws Exception {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName()+":"+i);
//		}
//		return null;
//	}
	private int number;
	
	public MyCallable(int number) {
		this.number = number;
	}

	//和run相比，call可以返回值！
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
}
