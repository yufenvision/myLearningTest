package mutipleThread.sellSoda;

public class Soda {
	private String name;
	
	private int size;
	
	private boolean flag;//true有汽水，false为汽水喝完了

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	//生产汽水
	public synchronized void set(String name,int size){
		if(this.isFlag()){
			try {
				this.wait();//t1线程等待，则立即释放锁
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		this.size = size;
		
		this.flag = true;
		this.notify();
	}
	
	//买汽水
	public synchronized void get(){
		try {
			
			if(!this.isFlag()){
				try {
					this.wait();//汽水喝完了，t2线程等待，立即释放锁，将来醒来的时候，也是从这里醒来
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			Thread.currentThread();
			Thread.sleep(100);;
			System.out.println(this.name+":"+this.size+"--喝完了");
			
			this.flag = false;
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
