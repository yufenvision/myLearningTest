package thread;

public class MusicThread extends Thread{
	@Override
	public void run(){
		int num = 0;
		while(num<100){
			System.out.println("听音乐---fly me to the moon");
			num++;
		}
		
	}
}
