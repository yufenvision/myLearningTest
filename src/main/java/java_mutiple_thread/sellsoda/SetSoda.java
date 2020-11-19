package java_mutiple_thread.sellsoda;

public class SetSoda implements Runnable{

	private Soda s;
	
	private int x = 0;
	public SetSoda(Soda s) {
		this.s = s;
	}

	@Override
	public void run() {
		while(x<50){
//			synchronized(s){
//				if(s.isFlag()){
//					try {
//						s.wait();//t1线程等待，则立即释放锁
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//				if(x % 2 == 0){
//					s.setName("可乐");
//					s.setSize(500);
//				}else{
//					s.setName("峨眉雪");
//					s.setSize(250);
//				}
//				x++;
//				
//				//汽水生产完了
//				s.setFlag(true);
//				s.notify();//唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU执行权,这之后可能t1抢到，也可能t2抢到
//				
//			}
			if(x % 2 == 0){
				s.set("可乐", 500);
			}else{
				s.set("峨眉雪", 250);
			}
			
			x++;
			
			
			
		}
		
	}

}
