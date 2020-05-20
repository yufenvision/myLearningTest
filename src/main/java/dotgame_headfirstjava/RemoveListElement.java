package dotgame_headfirstjava;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月19日 下午4:53:48
* 类说明
*/
public class RemoveListElement {
	public static void main(String[] args) {
		
		List<String> famous = new ArrayList<String>();
		famous.add("liudehua");
		famous.add("madehua");
		famous.add("liushishi");
		famous.add("tangwei");
		for (String s : famous) {
		    if ("madehua".equals(s)) {
		        famous.remove(s);
		        break;
		    }
		}
		
		System.out.println(Math.min(1, 2));
		
	}
	public void say(){
		System.out.println("父类的方法:" + super.hashCode());
		int x = 0;
	}
}
