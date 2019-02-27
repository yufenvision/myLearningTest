package gather;

import java.util.TreeSet;

public class TreeSetDemo {
	
	
	/**
	 * 测试TreeSet无序性
	 * 分析①创建一个TreeSet
	 * 	  ②往里面添加几个元素
	 */
	public static void main(String[] args) {
		//怎么创建这个TreeSet
		TreeSet ts = new TreeSet();
		StudentTree st1 = new StudentTree("孙悟空", 500);
		StudentTree st2 = new StudentTree("猪八戒", 1200);
		StudentTree st3 = new StudentTree("猪八戒1", 1200);
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		/* 要求需要比较的类都实现comparable接口
		 * 里面有compareTo方法
		*/
		
		System.out.println(ts.size());
		System.out.println(ts);
//		System.out.println(st2.compareTo(st2));
//		System.out.println(s.name);

	}

}
