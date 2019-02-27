package thread;

/**
 * @author SEELE
 * ����Ϸ�߳���
 * ������1���̳�Thread��
 * 	   2����д�����run����
 */
public class GameThread extends Thread{
	@Override
	public void run(){
		int num = 0;
		while(num<100){
			System.out.println("玩Dota------first blood");
			num++;
		}
		
	}
}
