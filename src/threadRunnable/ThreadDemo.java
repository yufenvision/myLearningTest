package threadRunnable;

/**
 * @author SEELE
 *������ ��ϣ��ʵ�ֿ���һ������Ϸ��һ�㲥�ű������֣�ʹ��������ӡ���ģ�⡣
       �ڰ���������������װ�������������̣߳���η�װ������Java��Thread�ࡣ
       ��Thread���ṩ����������һ��run()�������߳�����run��������һ��start()����������һ���̣߳�
       ���Զ��������࣬�̳�Thread�࣬��дrun����������ڲ����࣬���������߳�

 */
public class ThreadDemo {
	public static void main(String[] args) {
		GameThread gt = new GameThread();
		Thread t = new Thread(gt);
		t.start();
		
		MusicThread mt = new MusicThread();
		Thread t1 = new Thread(mt);
		t1.start();
	}
}
 