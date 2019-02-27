package myArrays;

public class TestMylinkList {

	public static void main(String[] args) {
		//需要创建容器对象
		MylinkList mll = new MylinkList();
		mll.add("哈哈");
		mll.add(1234);
		mll.add('a');
		mll.add(false);
		
		System.out.println(mll);//覆写toString方法
		System.out.println(mll.getSize());
		
	}

}
