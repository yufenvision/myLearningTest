package threadRunnable;

/**
 * @author SEELE
 * 打游戏线程类
 * 分析：1）继承Thread类
 * 	   2）覆写父类的run方法
 */
public class GameThread implements Runnable{
	@Override
	public void run(){
		int num = 0;
		while(num<100){
			System.out.println("打游戏------first blood");
			num++;
		}
		
	}
}
