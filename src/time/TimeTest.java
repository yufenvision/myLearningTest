package time;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
//		Long time = System.currentTimeMillis();
//		Date date = new Date(time);
//		SimpleDateFormat sm = new SimpleDateFormat("yyyyMM/dd HH:mm:ss");
//		String timeStr = sm.format(date)+"-"+time.toString().length();
//		System.out.println(timeStr);
//		System.out.println(time.toString());
//		System.out.println("152654631966117".length());

		double d = 111231.5585;

		System.out.println(d1(d));
		System.out.println(d2(d));
		System.out.println(d3(d));
		System.out.println(d4(d));
	}

	public static double d1(double d){
		BigDecimal b = new BigDecimal(d);
		return b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static String d2(double d){
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(d);
	}

	public static String d3(double d){
		return String.format("%.2f", d);
	}

	public static String d4(double d){
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		return nf.format(d);
	}
}
