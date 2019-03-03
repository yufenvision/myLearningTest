package mutipleThread.dieLock;
/**
* @author dyf
* @version 创建时间：2019年3月3日 下午10:25:50
* 
*/
public class DieLock extends Thread{
	private boolean flag;
	
	public DieLock(boolean flag) {
		super();
		this.flag = flag;
	}
	
	public void run(){
		if(flag){
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		}else{
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);
		
		d1.start();
		d2.start();
	}
	
	
}
