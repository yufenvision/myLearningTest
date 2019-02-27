package thread;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		timer(10);
	}
	public static void timer(Integer num) throws InterruptedException{
		for(int i = num;i>=0;i--){
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}
