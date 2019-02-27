package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeWorkForDate {
	/**
	* 日期转字符串显示
		 * @param date 要被转化的日期
		 * @param pattern	显示的格式
		 * @return 日期的字符串显示
	 * @throws InterruptedException 
	 * @throws ParseException 
		 */

	public static void main(String[] args) throws InterruptedException, ParseException {		
		Date today = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss E";
		System.out.println("今天的日期是："+Date2String(today,pattern));
		Thread.sleep(2000);
		Long now = System.currentTimeMillis();
		Date d2 = new Date(now);
		System.out.println("现在的日期是："+Date2String(d2,pattern)+"\n"+"------------------");
		
		String str = "2011-11-11 11:11:11";
		String pattern1 = "yyyy-MM-dd HH:mm:ss";
		System.out.println(String2Date(str,pattern1));
		
	}
	//日期转字符串显示
	public static String Date2String(Date d,String modle){
		SimpleDateFormat sdf = new SimpleDateFormat(modle);
		return sdf.format(d);
		
	}
	//字符串转日期显示
	public static Date String2Date(String date,String modle) throws ParseException{
//		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(modle);
		Date d = sdf.parse(date);
		return d;
		
	}
}
