package thinkingInJava.mutiplethread.counter;
/**
* @author dyf
* @version 创建时间：2019年2月27日 下午11:19:17
* 
*/
public class EtraTest {
	public static void main(String[] args) {
		
		int num = 1000;
		
		while(true)
			try {
					
//				Thread.currentThread().sleep(100);
				System.out.println(num);
				
				if(--num == 0)return;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		
		
		
	}
}
