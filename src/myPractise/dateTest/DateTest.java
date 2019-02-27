package myPractise.dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
	
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateFormat.format(new Date()));
		Calendar date = Calendar.getInstance();
		StringBuffer now = new StringBuffer();
		
//		Date myDate = dateFormat.parse("2019-10-11 00:00:00");
//		date.setTime(myDate);
		
		now.append(date.get(Calendar.YEAR));
		now.append(date.get(Calendar.MONTH) < 9 ? "0"+(date.get(Calendar.MONTH)+1) : date.get(Calendar.MONTH)+1);
		now.append(date.get(Calendar.DAY_OF_MONTH));
		System.out.println(now);
		System.out.println(date.get(Calendar.MONTH));
	}
}
