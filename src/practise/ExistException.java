package practise;
/**
 * 自定义了一个异常类
 * 异常类描述：描述用户名重复异常
 * 1）继承Exception类
 */
public class ExistException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	无参数的构造方法
	ExistException(){
		super();
	}
//	有参数的构造方法
	ExistException(String s){
		super(s);
	}
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

}
