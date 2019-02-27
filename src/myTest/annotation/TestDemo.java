package myTest.annotation;

import java.lang.reflect.Method;

public class TestDemo {
	public static void main(String[] args) throws ClassNotFoundException {
//		boolean fruitClz = Class.forName("myTest.annotation.Apple").isAnnotationPresent(FruitInfo.class);
//		System.out.println(fruitClz);
//		FruitInfoUtil.getFruitInfo(Apple.class);
		
		Class clz = Apple.class;
		Method[] methods = clz.getDeclaredMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(FruitProvider.class))
				System.out.println(method.getAnnotation(FruitProvider.class));
		}
	}
}
