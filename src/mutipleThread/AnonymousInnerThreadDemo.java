package mutipleThread;

/**
 * 匿名内部类的格式：
 * 		new 类名或者接口名(){
 * 			重写方法；
 * 		}
 *		本质：是该类或者接口的子类对象;
 */
public class AnonymousInnerThreadDemo {
	
	public static void main(String[] args) {
		//继承Thread类来实现多线程
		new Thread(){
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				
			};
		}.start();
		
		//实现Runnable接口来实现多线程
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
			
		}){
		}.start();
		
		//还有种装逼用法
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("hello"+":"+i);
				}
			}
			
		}){
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("world"+":"+i);
				}
			}
		}.start();
		
	}
}
