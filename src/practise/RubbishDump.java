package practise;

public class RubbishDump {

	public static void main(String[] args) {
		// 直接new一个对象，没有引用
		new Lj();
		new Lj();
		new Lj();
		new Lj();
		System.gc();
	}

}

class Lj{
	protected void finalize() throws Throwable{
		System.out.println("正在回收垃圾");
	}
}


