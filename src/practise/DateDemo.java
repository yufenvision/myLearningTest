package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		//获得当前时间 
		Date d = new Date();
		System.out.println(d);
		Date d1 = new Date(System.currentTimeMillis()+86400*1000);
		System.out.println(d1);
		//希望得到2016-02-03 11:22:20 星期二的时间格式
		//pattern相当于一个模板样式 比如yyyy-MM-dd HH:mm:ss E
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String currentDate = sdf.format(d);
		System.out.println(currentDate);
		Date d2 = sdf.parse(currentDate);
		System.out.println(d2);
	}

}
