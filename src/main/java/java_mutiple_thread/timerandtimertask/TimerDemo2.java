package java_mutiple_thread.timerandtimertask;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器：可以让我们在指定的时间做某件事情，还可以做重复的事情
 * 依赖Timer和TimerTask这两个类
 * Timer：定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * TimerTask:任务
 *
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t = new Timer();
		//3秒后执行爆炸任务第一次，如果不成功，每隔1秒继续炸,随后炸五次后结束
		t.schedule(new MyTask2(t), 3000, 1000);
	}
}


//做一个任务
class MyTask2 extends TimerTask{
	private Timer t;
	private int times = 0;
	
	public MyTask2(){};
	
	public MyTask2(Timer t){
		this.t = t;
	};
	
	@Override
	public void run() {
		if(times > 4){
			t.cancel();
			return;
		}
		System.out.println("boom!!!");
		times++;
	}
}