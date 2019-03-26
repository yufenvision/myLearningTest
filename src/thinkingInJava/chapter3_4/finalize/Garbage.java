package thinkingInJava.chapter3_4.finalize;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 下午5:43:13
*/
public class Garbage {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.err.println("Usage: \n" + "java Garbage before\n or:\n" + "java Garbage after");
			return;
		}
		while(!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		System.out.println("After all Chairs have been created:\n" + "total created = " + Chair.created + ", total finalized = " + Chair.finalized);
		if(args[0].equals("before")) {
			System.out.println("gc():");
			System.gc();
			System.out.println("runFinalization():");
			System.runFinalization();
		}
		System.out.println("bye!");
		if(args[0].equals("after"))
			System.runFinalizersOnExit(true);
	}
} ///:
