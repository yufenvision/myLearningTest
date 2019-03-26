package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* @author 作者 dyf:
* @version 创建时间：2019年3月20日 下午7:31:58
*/
public class DealWeek {
	public static void main(String[] args) {
		
		String date = "2019-01-01";
		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd"); 
		Date d = null;
		try {
			d = sm.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(d);
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println(getStartAndEndDayByWeekNo(2019,1)[0]);
		System.out.println(getStartAndEndDayByWeekNo(2019,1)[1]);
		
		System.out.println(Integer.parseInt(date.substring(0, 4)));
	}
	
	//根据年和第几周，来获取该周的开始日期和结束日期
	public static String[] getStartAndEndDayByWeekNo(int year,int weekNo){
		String[] dateZone = new String[2];
		Calendar cal =Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);      
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.WEEK_OF_YEAR, weekNo);
        
        int sYear = cal.get(Calendar.YEAR);
        int sMonth = cal.get(Calendar.MONTH) + 1;
        int sDay = cal.get(Calendar.DAY_OF_MONTH);
        dateZone[0] = sYear +"-"+(sMonth < 10 ? "0" + sMonth : sMonth)+"-"+ (sDay < 10 ? "0" + sDay : sDay);
        if(sYear < year)dateZone[0] = year + "-01-01";
        
        cal.add(Calendar.DAY_OF_WEEK,6);
        
        int eYear = cal.get(Calendar.YEAR);
        int eMonth = cal.get(Calendar.MONTH) + 1;
        int eDay = cal.get(Calendar.DAY_OF_MONTH);
        
        dateZone[1] = eYear +"-"+(eMonth < 10 ? "0" + eMonth : eMonth)+"-"+ (eDay < 10 ? "0" + eDay : eDay);
        if(eYear > year)dateZone[1] = year + "-12-31";
        
        return dateZone;    
    }
	
	
}
