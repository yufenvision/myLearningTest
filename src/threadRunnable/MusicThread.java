package threadRunnable;

public class MusicThread implements Runnable{
	@Override
	public void run(){
		int num = 0;
		while(num<100){
			System.out.println("²¥·ÅÒôÀÖ---fly me to the moon");
			num++;
		}
		
	}
}
