package thinkingInJava.chapter3_4;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 下午3:57:34
* 移位运算符面向的运算对象也是二进制的“位”。可单独用它们处理整数类型（主类型的一种）。左移位运
算符（ <<）能将运算符左边的运算对象向左移动运算符右侧指定的位数（在低位补 0）。“有符号”右移位
运算符（ >>）则将运算符左边的运算对象向右移动运算符右侧指定的位数。“有符号”右移位运算符使用了
“符号扩展”：若值为正，则在高位插入 0；若值为负，则在高位插入 1。 Java 也添加了一种“无符号”右
移位运算符（ >>>），它使用了“零扩展”：无论正负，都在高位插入0。这一运算符是 C 或 C++没有的。
* 
* 
*/
public class URShift {
	public static void main(String[] args) {
		
		int i = -1;
		i >>>= 10;
		System.out.println(i);
		long l = -1;
		l >>>= 10;
		System.out.println(l);
		short s = -1;
		s >>>= 10;
		System.out.println(s);
		byte b = -1;
		b >>>= 10;
		System.out.println(b);
		
	}
}
