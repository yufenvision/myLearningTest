package thread;

public class TicketThread extends Thread{
	TicketThread(){}
	TicketThread(String name){
		super(name);
	}
	private static int num = 50;
	@Override
	public void run(){
		while(num>0){
//			ͬ����������
			synchronized (TicketThread.class) {
				if(num>0){
					System.out.println(this.getName()+"��������"+num+"��Ʊ");
					num--;
				}
			}
			
		}
	}	
	
}
