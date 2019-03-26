package myTest.anytest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CreateUUID {
	public static void main(String[] args) throws ParseException {
		
		
//		System.out.println(UUID.randomUUID().toString().replaceAll("-" ,"" ));
//		
//		List<String> list = Collections.emptyList();
//
//		Integer[] strs = {1,2,3,4,7,11,34};
//		List<Integer> list1 = Arrays.asList(strs);
//		
//		System.out.println(list1.subList(1, 7));
//		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String wanmao = "2019-05-10 00:00:00 000";
		try {
			Date end = sm.parse(wanmao);
			Date start = new Date();
			long time = end.getTime() - start.getTime();
			
			System.out.println("离万毛30大寿还有: " + (time/1000)/(60*60*24) + " 天");
			System.out.println("离万毛30大寿还有: " + (time/1000)/(60*60) + " 小时");
			System.out.println("离万毛30大寿还有: " + (time/1000)/(60) + " 分钟");
			System.out.println("离万毛30大寿还有: " + time/1000 + " 秒");
			System.out.println("离万毛30大寿还有: " + time + " 豪秒");
			
//			System.out.println("段帅哥还有: " + (time/1000)/(60*60*24) + " 天" + "满18啦");
//			System.out.println("段帅哥还有: " + (time/1000)/(60*60) + " 小时" + "满18啦");
//			System.out.println("段帅哥还有: " + (time/1000)/(60) + " 分钟" + "满18啦");
//			System.out.println("段帅哥还有: " + time/1000 + " 秒" + "满18啦");
//			System.out.println("段帅哥还有: " + time + " 豪秒" + "满18啦");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sm1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String myTime = "2019-03-11 17:28:07 123";
		System.out.println(sm1.parse(myTime).getTime());
		System.out.println(sm1.format(System.currentTimeMillis()));
		
		
	}
}
