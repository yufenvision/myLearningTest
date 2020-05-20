package myTest.annotation;

import java.lang.reflect.Field;

public class FruitInfoUtil {
	
	public static void getFruitInfo(Class<?> clz){
		String strFruitName=" 水果名称：";
		String strFruitColor=" 水果颜色：";
		String strFruitNum = "水果数量:";
		String strFruitProvicer="===========供应商信息============";
		
		//获取所有某个类，所有的字段
		Field[] fields = clz.getDeclaredFields();
		//获取字段上，有注解的内容，并且打印
		for (Field field : fields) {
			System.out.println(field);
//			Annotation[] annotations = field.getAnnotations();
//			for (Annotation annotation : annotations) {
//				System.out.println(annotation);
//			}
			if(field.isAnnotationPresent(FruitInfo.class)){
				FruitInfo fruitInfo = field.getAnnotation(FruitInfo.class);
				String name = fruitInfo.name();
				String color = fruitInfo.color();
				int num = fruitInfo.num();
				System.out.print(!"".equals(name)?strFruitName+name+"\n":"");
				System.out.print(!"".equals(color)?strFruitName+color+"\n":"");
				System.out.print(num!=-1?strFruitName+num+"\n":"");
				
			}else if(field.isAnnotationPresent(FruitProvider.class)){
				FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
				System.out.println(strFruitProvicer);
				System.out.println("供应商编号："+fruitProvider.id());
				System.out.println("供应商名字："+fruitProvider.name());
				System.out.println("供应商地址："+fruitProvider.address());
			}
		}
	}
}
