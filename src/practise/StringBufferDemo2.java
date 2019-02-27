package practise;

public class StringBufferDemo2 {
	/**
	 * 把1-1000整数链接成一个字符串
	 * 类似效果123456789101112.....9991000
	 * 分析：1）定义个String对象存放字符串；
	 * 	   2）循环1到1000的值，拼接成123.....1000
	 * 	   3)打印字符串
	 */
	public static void main(String[] args) {
		String s1 = "";
		Long start = System.currentTimeMillis();
		for(int i = 1;i <= 1000;i++){
			s1 += i;
		}
		Long end = System.currentTimeMillis();
		System.out.println(s1);
		System.out.println("耗时："+(end - start)+"毫秒");
		System.out.println("-----------------");
		
		StringBuffer s2 = new StringBuffer();
		Long start1 = System.currentTimeMillis();
		for(int i = 1;i <= 1000;i++){
			s2.append(i);
		}
		Long end1 = System.currentTimeMillis();
		System.out.println(s2);
		System.out.println("耗时："+(end1 - start1)+"毫秒");
		
	}

}
