package thinkingInJava.chapter3_4.thiskeywords;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 下午4:39:10
* 
* 
* class Apricot {
* 	void pick() {  ...  }
* 	void pit() { pick();  ...  }
* } 
* 在pit()内部，我们可以说 this.pick()，但事实上无此必要。编译器能帮我们自动完成。 this 关键字只能
* 用于那些特殊的类—— 需明确使用当前对象的句柄。例如，假若您希望将句柄返回给当前对象，那么它经常在 return 语句中使用。
* 
* 
* 
*/
public class Leaf{
	private int i = 0;
	
	Leaf increment(){
		i++;
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().increment().print();
	}
}