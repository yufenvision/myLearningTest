package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		Long time = System.currentTimeMillis();
		Date date = new Date(time);
		SimpleDateFormat sm = new SimpleDateFormat("yyyyMM/dd HH:mm:ss");
		String timeStr = sm.format(date)+"-"+time.toString().length();
		System.out.println(timeStr);
		System.out.println(time.toString());
		System.out.println("152654631966117".length());
		
	}
}
