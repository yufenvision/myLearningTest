package threadRunnable;

/**
 * @author SEELE
 * ����Ϸ�߳���
 * ������1���̳�Thread��
 * 	   2����д�����run����
 */
public class GameThread implements Runnable{
	@Override
	public void run(){
		int num = 0;
		while(num<100){
			System.out.println("����Ϸ------first blood");
			num++;
		}
		
	}
}
