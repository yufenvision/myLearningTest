package object2oriented.genericity;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月2日 下午9:31:51
* 类说明
*/
//第一种情况：已经知道是什么类型的了
//public class InterFaceImpl implements InterFaceTool<String>{
//
//	@Override
//	public void show(String t) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
//第二种情况：还不知道什么类型的,（常用，ArrayList就是这样实现的）
public class InterFaceImpl<T> implements InterFaceTool<T>{

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E> void show2(E e) {
		// TODO Auto-generated method stub
		
	}

}
