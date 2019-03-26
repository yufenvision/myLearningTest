package practise;

import java.math.BigDecimal;
import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		BigDecimal bd1 = new BigDecimal("0.2");
		BigDecimal bd2 = new BigDecimal("0.002");
		BigDecimal bd3 = new BigDecimal(0.2);//构造函数损失了double参数的精度
		BigDecimal bd4 = new BigDecimal(0.002);
		System.out.println(bd1.add(bd2));
		System.out.println(bd3.add(bd4));

		System.out.println("===========================");
		int num = (int)(Math.random() * 11);
		System.out.println(num);
		double d = Math.random();//[0,1)
		System.out.println(d);
		System.out.println((int)d);//强转会向下取整
		System.out.println("===========================");
		
		Random rd = new Random();
		Random rd2 = new Random();
		System.out.println(rd.nextInt(3));
		System.out.println(rd.nextInt(3));
		System.out.println(rd2.nextInt(3));
		System.out.println(rd2.nextInt(3));
		
		Random rd1 = new Random(System.currentTimeMillis());
		System.out.println(rd1.nextInt());
		
	}

}
