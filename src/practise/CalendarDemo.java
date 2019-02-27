package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
//		通过Calendar类提供的get方法获取时间
		Calendar d = Calendar.getInstance();
		System.out.println(d.getClass());
		int year = d.get(Calendar.YEAR);
		System.out.println(year);
		int month = d.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = d.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		d.set(Calendar.MONTH, 11);
		System.out.println(d.get(Calendar.MONTH));
		
//		把字符串时间转换成时间
		String str11 = "2117-11-11 11:11:11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d11 = sdf.parse(str11);
		d.setTime(d11);
		int year11 = d.get(Calendar.YEAR);
		int month11 = d.get(Calendar.MONTH);
		int day11 = d.get(Calendar.DAY_OF_MONTH);
		System.out.println(year11+"年"+month11+"月"+day11+"日");
	}
}
