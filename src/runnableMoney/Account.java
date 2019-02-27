package runnableMoney;

public class Account {
	int balance;
//	显示我们账户是否有钱
	boolean empty = false;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	存钱方法
	synchronized public void save() throws InterruptedException{
//		存钱的时候，让取钱的线程进行等待
		if(!empty){
			this.wait();
		}
//		先看余额
		System.out.println("存款之前的余额："+this.getBalance());
//		存款操作1000改变账户余额+1000
		this.setBalance(this.getBalance()+1000);
//		存款之后的余额
		System.out.println("存款之后的余额："+this.getBalance());
		empty = false;
//		有钱的时候唤醒取钱
		this.notify();
	}
//	取钱的方法
	synchronized public void getMoney() throws InterruptedException{
		if(empty){
			this.wait();
		}
//		取款之前打印余额
		System.out.println("取款之前打印余额："+this.getBalance());
//		取款之前判断余额
		if(this.getBalance()>= 1000){
			 this.setBalance(this.getBalance()-1000);
		}else{
			System.out.println("穷鬼");
		}
		System.out.println("取款之后的余额"+this.getBalance());
		
		empty = true;
		this.notify();//唤醒
	}
}
