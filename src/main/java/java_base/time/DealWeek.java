package java_base.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;

/**
* @author 作者 dyf:
* @version 创建时间：2019年3月20日 下午7:31:58
*/
public class DealWeek {
	public static void main(String[] args) throws ParseException {
		
		String date = "2020-01-05";
		Calendar c = getCalendarByDateStr(date);
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));

		String[] result = getStartAndEndDayByDate(date);
		System.out.println("周一日期为：" + result[0]);
		System.out.println("周天日期为：" + result[1]);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
		Calendar cal = Calendar.getInstance();
		Date time= sdf.parse(date);
		cal.setTime(time);
		System.out.println("要计算日期为:"+sdf.format(cal.getTime())); //输出要计算日期

		//判断要计算的日期是否是周日，如果是，则减一天计算周六的，否则会出问题，计算到下一周去了
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		if(1 == dayWeek) cal.add(Calendar.DAY_OF_MONTH, -1);

		cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一

		int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
		System.out.println("所在周星期一的日期："+sdf.format(cal.getTime()));
		System.out.println(cal.getFirstDayOfWeek()+"-"+day+"+6="+(cal.getFirstDayOfWeek()-day+6));

		cal.add(Calendar.DATE, 6);
		System.out.println("所在周星期日的日期："+sdf.format(cal.getTime()));
	}

	static Function<Integer, String> add0 = (i -> i < 10 ? "0" + i : String.valueOf(i));//补0

    //根据日期获取该天所在周的开始与结束日期(周跨年周，只计算本年内那部分天数)
	public static String[] getStartAndEndDayByDate(String yyyyMMdd) throws ParseException {
		String[] dateZone = new String[2];
		Calendar cal = getCalendarByDateStr(yyyyMMdd);
		int year = Integer.parseInt(yyyyMMdd.substring(0, 4));

		dateZone[0] = cal.get(Calendar.YEAR) +"-"+ add0.apply(cal.get(Calendar.MONTH) + 1) + "-" + add0.apply(cal.get(Calendar.DAY_OF_MONTH));
		if(cal.get(Calendar.YEAR) < year)dateZone[0] = year + "-01-01";
		cal.add(Calendar.DATE, 6);
		dateZone[1] = cal.get(Calendar.YEAR) +"-"+ add0.apply(cal.get(Calendar.MONTH) + 1) + "-" + add0.apply(cal.get(Calendar.DAY_OF_MONTH));
		if(cal.get(Calendar.YEAR) > year)dateZone[1] = year + "-12-31";
		return dateZone;
	}

	private static Calendar getCalendarByDateStr(String yyyyMMdd) throws ParseException {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sm.parse(yyyyMMdd);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//判断要计算的日期是否是周日，如果是，则减一天计算周六的，否则会出问题，计算到下一周去了
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		if(1 == dayWeek) cal.add(Calendar.DAY_OF_MONTH, -1);
		cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
		int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
		return cal;
	}

}
