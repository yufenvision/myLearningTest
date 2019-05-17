package genericity;

import java.util.ArrayList;
import java.util.Collection;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月2日 下午9:40:37
* 类说明
*/
public class GenericDemo {
	public static void main(String[] args) {
		//泛型如果明确的写的时候，前后必须一致
		Collection<Object> c1 = new ArrayList<Object>();
//		Collection<Object> c2 = new ArrayList<Mouse>();//编译错误
//		Collection<Object> c3 = new ArrayList<HpMouse>();//编译错误
//		Collection<Object> c4 = new ArrayList<DellMouse>();//编译错误
		
		//?表示任意的类型都是可以的
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();
		
		//? extends E:向下限定，E及其子类
//		Collection<? extends Mouse> c9 = new ArrayList<Object>();//编译错误
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();
		
		//? super E:向上限定，E及其父类
		Collection<? super Animal> c13 = new ArrayList<Object>();//编译错误
		Collection<? super Animal> c14 = new ArrayList<Animal>();
//		Collection<? super Mouse> c15 = new ArrayList<HpMouse>();
//		Collection<? super Mouse> c16 = new ArrayList<DellMouse>();
 	}
}

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}