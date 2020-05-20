package thinkingInJava.chapter3_4.thiskeywords;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 下午4:49:24
* 理解了 this 关键字后，我们可更完整地理解 static（静态）方法的含义。它意味着一个特定的方法没有this。
* 我们不可从一个 static 方法内部发出对非 static 方法的调用（注释②），尽管反过来说是可以的。
* 而且在没有任何对象的前提下，我们可针对类本身发出对一个 static 方法的调用。事实上，那正是 static方法最基本的意义。
* 它就好象我们创建一个全局函数的等价物（在C 语言中）。除了全局函数不允许在 Java 中使用以外，若将一个 static 方法置入一个类的内部，它就可以访问其他 static 方法以及 static 字段。
* 
* ②：有可能发出这类调用的一种情况是我们将一个对象句柄传到static 方法内部。随后，通过句柄（此时实际是 this），我们可调用非 static 方法，并访问非 static 字段。
* 但一般地，如果真的想要这样做，只要制作一个普通的、非 static方法即可。
* 
*/
public class Flower {
	private int petalCount = 0;
	
	private String s = new String("null");
	
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
	}
	
	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s=" + ss);
		s = ss;
	}
	
	Flower(String s, int petals) {
		this(petals);
		//! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		System.out.println("String & int args");
	}
	
	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}
	
	void print() {
		//! this(11); // Not inside non-constructor!
		System.out.println("petalCount = " + petalCount + " s = "+ s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.print();
	}
}
