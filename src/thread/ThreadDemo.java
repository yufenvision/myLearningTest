package thread;

/**
 * @author SEELE
 *分析： ①希望实现可以一边玩游戏，一般播放背景音乐，使用两个打印语句模拟。
       ②把上面的两件事情封装成两个独立的线程，如何封装？借助Java中Thread类。
       ③Thread类提供两个方法，一个run()方法（线程主体run方法），一个start()方法（启动一个线程）
       ④自定义两个类，继承Thread类，覆写run方法；最后在测试类，启动两个线程

 */
public class ThreadDemo {
	public static void main(String[] args) {
		GameThread gt = new GameThread();
		gt.start();
		
		MusicThread mt = new MusicThread();
		mt.start();
	}
}
 