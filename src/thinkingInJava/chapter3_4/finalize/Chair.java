package thinkingInJava.chapter3_4.finalize;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 下午5:36:40
*/
public class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;
	
	Chair() {
		i = ++created;
		if(created == 47)System.out.println("Created 47");
	}
	
	protected void finalize() {
		if(!gcrun) {
			gcrun = true;
			System.out.println("Beginning to finalize after " + created + " Chairs have been created");
		}
		
		if(i == 47) {
			System.out.println("Finalizing Chair #47, " + "Setting flag to stop Chair creation");
			f = true;
		}
	
		finalized++;
		if(finalized >= created)System.out.println("All " + finalized + " finalized");
		
	}
}


