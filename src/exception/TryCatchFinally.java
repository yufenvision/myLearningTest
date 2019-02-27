package exception;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月21日 下午11:06:36
* 类说明
*/
public class TryCatchFinally {
	public static void main(String[] args) {
		
		int x = 0;
//		try {
//			x = 5/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("除数不能为0:" + e);
//		}
		x = 5/0;
		System.out.println(x);
		
	}
}
