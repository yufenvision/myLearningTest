package genericity;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月2日 下午8:43:21
* 类说明
*/
public class ObjectTool<T> {//泛型类
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public void classShow(T t){
		System.out.println("只能传和类泛型相同的类型");
	}
	
	//泛型方法可以传和类上泛型不同的类型
	public <E> void show(E t){
		System.out.println(t);
	}
}
