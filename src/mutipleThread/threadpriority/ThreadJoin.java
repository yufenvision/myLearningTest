package mutipleThread.threadpriority;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午3:41:16
* 
*/
public class ThreadJoin extends Thread{
	
	public void run(){
		int num = 0;
		while(true){
			System.out.println(getName() + ":" + num);
			if(++num > 100)break;
		}
		
	}
	
	public static void main(String[] args) {
		ThreadJoin j1 = new ThreadJoin();
		ThreadJoin j2 = new ThreadJoin();
		ThreadJoin j3 = new ThreadJoin();
		j1.setName("Join线程");
		j1.start();
		try {
			j1.join();//等待该线程终止，后面线程才能执行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j2.start();
		j3.start();
	}
}
