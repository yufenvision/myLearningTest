package gather;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
	
	/**
	 * 测试TreeSet无序性
	 * 分析①创建一个TreeSet
	 * 	  ②往里面添加几个元素
	 */
	public static void main(String[] args) {
		//怎么创建这个TreeSet
		TreeSet ts = new TreeSet(new StudentComparator());
		StudentComparator comp = new StudentComparator();
		StudentTree1 st1 = new StudentTree1("孙悟空", 500);
		StudentTree1 st2 = new StudentTree1("猪八戒", 1200);
		StudentTree1 st3 = new StudentTree1("猪八戒1", 1200);
		ts.add(st1);
		ts.add(st2); 
		ts.add(st3);
		/* 要求需要比较的类都实现comparable接口
		 * 里面有compareTo方法
		*/
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println(comp.compare(st1,st2));
		System.out.println(st1);

	}

}
