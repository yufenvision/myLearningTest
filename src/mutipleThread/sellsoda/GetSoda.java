package mutipleThread.sellsoda;

public class GetSoda implements Runnable{

	private Soda s;
	private int max = 50;
	
	public GetSoda(Soda s) {
		this.s = s;
	}

	@Override
	public void run() {
		while(max>0){
//			synchronized (s) {
//				
//				if(!s.isFlag()){
//					try {
//						s.wait();//汽水喝完了，t2线程等待，立即释放锁，将来醒来的时候，也是从这里醒来
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//					
//				}
//				
//				try {
//					Thread.sleep(100);
//					System.out.println(s.getName()+":"+s.getSize()+"--喝完了");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				max--;
//				
//				//汽水喝完了
//				s.setFlag(false);
//				s.notify();
//			}
			s.get();
			max--;
			
		}
	}
	
}
