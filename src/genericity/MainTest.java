package genericity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月2日 下午9:11:32
* 类说明
*/
public class MainTest {
	public static void main(String[] args) {
		//泛型类
		ObjectTool<String> ct = new ObjectTool<>();
		ct.setObj("字符串");
		
		ObjectTool<Integer> ct1 = new ObjectTool<>();
		ct1.setObj(100);
		
		//用泛型方法
		ct.show("xxx");
		ct.show(100);
		ct.show(new SimpleDateFormat("yyyy-MM-DD").format(new Date()));
		
		//泛型接口
	}
}
