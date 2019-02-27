package practise;

/**
 * @author SEELE
 * 测试用户名重复异常
 * 1)使用一个数组来模拟数据库，存放用户名String[]
 * 2)定义一个方法reg(String usrname) 需要传入一个用户名进来
 * 3)把用户名和数组里面的值进行判断，如果相等，产生一个自定义异常
 *  如果不相等，就注册成功
 */
public class TestExistException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			reg("谭老四");
		} catch (ExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void reg(String username) throws ExistException{
		
		String[] strArr = {"谭老四","翠花","如花","凤姐"};
//		进行判断
		for(String s : strArr){
			if(s.equals(username)){
				//产生一个异常,抛出
				//可以进行手动处理，还有向外抛出
				throw new ExistException("亲，用户名重复了");
			}
		}
		System.out.println("注册成功");
	}
}
