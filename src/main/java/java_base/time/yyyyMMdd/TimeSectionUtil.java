package java_base.time.yyyyMMdd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: dyf
 * @Date: 2020/8/13 17:28
 * @Description:
 */
public class TimeSectionUtil {

    /**
     * 时间获取工具类：
     * 输入：
     * 1、查询类型：0-年，1-季度/月/旬/周查询
     * 2、考核时间类型：year年，quater季度,month月，ten旬,week周
     * 3、考核时间：年月日
     *
     * （0-全年查询）
     * 输出：
     *   year年 考核时间整年
     *   quater季 考核时间整年
     *   month月 考核时间整年
     *   ten旬 考核时间整年
     *   week周  从周一所在日期算起，一直到最后一个
     *
     * （1-季度/月/旬/周查询）
     * 输出：
     *   quater季 考核时间 = 选中日期所在季度开始结束日期
     *   month月 考核时间 = 选中日期所在月开始结束日期
     *   ten旬 考核时间 = 选中日期所在旬开始结束日期
     *   week周  考核时间 = 选中日期所在周开始结束日期
     *
     */
    public static String[] getTimeSection(String date, String type) throws ParseException {
        String[] startEnd = new String[3];
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sm.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        if("quater".equals(type)){
            int month = cal.get(Calendar.MONTH);
            int quarter = month / 3 + 1;
            int startMonth = getStartMonthByQuater(quarter);
            cal.set(Calendar.MONTH,startMonth - 1);
            cal.set(Calendar.DAY_OF_MONTH,1);
            startEnd[0] = sm.format(cal.getTime());

            int endMonth = getEndMonthByQuater(quarter);
            cal.set(Calendar.MONTH,endMonth - 1);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            cal.set(Calendar.DAY_OF_MONTH,lastDay);
            startEnd[1] = sm.format(cal.getTime());
            startEnd[2] = "第" + quarter + "季度";

        }else if("month".equals(type)){
            cal.add(Calendar.MONTH,0);
            cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号，当前日期为本月1号
            startEnd[0] = sm.format(cal.getTime());
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 0);
            startEnd[1] = sm.format(cal.getTime());
            startEnd[2] = "第" + (cal.get(Calendar.MONTH) + 1) + "月";

        }else if("ten".equals(type)){
            int month = cal.get(Calendar.MONTH) + 1;
            startEnd[2] = "第" + month + "月";
            int day = cal.get(Calendar.DAY_OF_MONTH);
            if(day <= 10){
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
                startEnd[0] = sm.format(cal.getTime());
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH) + 9);
                startEnd[1] = sm.format(cal.getTime());
                startEnd[2] += "上旬";
            }else if(day > 10 && day <=20){
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH) + 10);
                startEnd[0] = sm.format(cal.getTime());
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH) + 19);
                startEnd[1] = sm.format(cal.getTime());
                startEnd[2] += "中旬";
            }else{
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH) + 20);
                startEnd[0] = sm.format(cal.getTime());
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                startEnd[1] = sm.format(cal.getTime());
                startEnd[2] += "下旬";
            }

        }else if("week".equals(type)){
            int yearNow = cal.get(Calendar.YEAR);
            int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
            if(1 == dayWeek) cal.add(Calendar.DAY_OF_MONTH, -1);//星期天则往前推1天
            cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
            int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
            cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
            startEnd[0] = sm.format(cal.getTime());
            cal.add(Calendar.DATE, 6);
            startEnd[1] = sm.format(cal.getTime());

            //计算周数,一年从第一个周一算起
            cal.setTime(sm.parse(startEnd[0]));
            int week = cal.get(Calendar.WEEK_OF_YEAR);
            week = cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY && cal.get(Calendar.DAY_OF_YEAR) == 1 ? week : week - 1;
            int yearS = cal.get(Calendar.YEAR);
            if(yearS < yearNow){
                cal.add(Calendar.DATE, -7);
                startEnd[2] = yearS + "第" + cal.get(Calendar.WEEK_OF_YEAR) + "周";
                return startEnd;
            }

            cal.setTime(sm.parse(startEnd[1]));
            int yearE = cal.get(Calendar.YEAR);
            if(yearE > yearNow){
                cal.add(Calendar.DATE, -7);
                startEnd[2] = yearNow + "第" + cal.get(Calendar.WEEK_OF_YEAR) + "周";
                return startEnd;
            }
            startEnd[2] = yearNow + "第" + week + "周";//第几周？
        }

        return startEnd;
    }

    private static Integer getStartMonthByQuater(Integer quarter){
        if (quarter == 2){
            return 4;
        }else if(quarter == 3){
            return 7;
        }else if(quarter == 4){
            return 10;
        }
        return 1;
    }

    private static Integer getEndMonthByQuater(Integer quarter){
        if (quarter == 2){
            return 6;
        }else if(quarter == 3){
            return 9;
        }else if(quarter == 4){
            return 12;
        }
        return 3;
    }

    public static String[] getWeekStartEndForAllYear(String date) throws ParseException {
        String[] weekStartEnd = new String[2];
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sm.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_YEAR, cal.getActualMinimum(Calendar.DAY_OF_YEAR));
        int i= 1;
        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY){
            cal.set(Calendar.DAY_OF_YEAR, i++);
        }
        weekStartEnd[0] = sm.format(cal.getTime());
        cal.set(Calendar.DAY_OF_YEAR, cal.getActualMaximum(Calendar.DAY_OF_YEAR));
        int lastDay = cal.get(Calendar.DAY_OF_WEEK);
        if(lastDay != 0){
            cal.add(Calendar.DATE, 8-lastDay);//加上该周剩余天
        }
        weekStartEnd[1] = sm.format(cal.getTime());
        return weekStartEnd;
    }

    //获取该月几个周一
    public static Integer getWeekNumByDate(String date) throws ParseException {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sm.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        int weekNum = 0;
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)weekNum += 1;
        }

        return weekNum;
    }

    public static void main(String[] args) throws ParseException {
//        System.out.println(getWeekNumByDate("2020-01-05"));

        System.out.println(Arrays.toString(getTimeSection("2018-12-30", "week")));
        System.out.println(Arrays.toString(getTimeSection("2020-12-31", "week")));
//        System.out.println(Arrays.toString(getTimeSection("2018-12-31", "week")));
//        System.out.println(Arrays.toString(getWeekStartEndForAllYear("2020-11-01")));
    }
}
