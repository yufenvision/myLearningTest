package practise;

public class StringBufferDemo {
	/**
	 * 测试StringBuffer里面的方法
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("dfasdfasdgdafg110");
		System.out.println(sb1.delete(0, 1));
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.length());
	}

}
