package object2oriented.genericity;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月2日 下午9:10:59
* 类说明
*/
public interface InterFaceTool<T> {
	void show(T t);
	
	<E> void show2(E e);
}
