package gather;

import java.util.HashSet;
import java.util.Random;

public class TestHashSet {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		//把四个对象放到hashSet里面
		HashSet hs = new HashSet();
		hs.add(a1);
		hs.add(a2);
		hs.add(a3);
		hs.add(a4);
		System.out.println(hs.size());
	}

}

class A{
	@Override
	public int hashCode() {
		//返回一个随机数Random类nextInt()
		return new Random().nextInt();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
}