package runnableMoney;

public class Account {
	int balance;
//	��ʾ�����˻��Ƿ���Ǯ
	boolean empty = false;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	��Ǯ����
	synchronized public void save() throws InterruptedException{
//		��Ǯ��ʱ����ȡǮ���߳̽��еȴ�
		if(!empty){
			this.wait();
		}
//		�ȿ����
		System.out.println("���֮ǰ����"+this.getBalance());
//		������1000�ı��˻����+1000
		this.setBalance(this.getBalance()+1000);
//		���֮������
		System.out.println("���֮�����"+this.getBalance());
		empty = false;
//		��Ǯ��ʱ����ȡǮ
		this.notify();
	}
//	ȡǮ�ķ���
	synchronized public void getMoney() throws InterruptedException{
		if(empty){
			this.wait();
		}
//		ȡ��֮ǰ��ӡ���
		System.out.println("ȡ��֮ǰ��ӡ��"+this.getBalance());
//		ȡ��֮ǰ�ж����
		if(this.getBalance()>= 1000){
			 this.setBalance(this.getBalance()-1000);
		}else{
			System.out.println("���");
		}
		System.out.println("ȡ��֮������"+this.getBalance());
		
		empty = true;
		this.notify();//����
	}
}
