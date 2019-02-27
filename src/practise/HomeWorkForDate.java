package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeWorkForDate {
	/**
	* ����ת�ַ�����ʾ
		 * @param date Ҫ��ת��������
		 * @param pattern	��ʾ�ĸ�ʽ
		 * @return ���ڵ��ַ�����ʾ
	 * @throws InterruptedException 
	 * @throws ParseException 
		 */

	public static void main(String[] args) throws InterruptedException, ParseException {		
		Date today = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss E";
		System.out.println("����������ǣ�"+Date2String(today,pattern));
		Thread.sleep(2000);
		Long now = System.currentTimeMillis();
		Date d2 = new Date(now);
		System.out.println("���ڵ������ǣ�"+Date2String(d2,pattern)+"\n"+"------------------");
		
		String str = "2011-11-11 11:11:11";
		String pattern1 = "yyyy-MM-dd HH:mm:ss";
		System.out.println(String2Date(str,pattern1));
		
	}
	//����ת�ַ�����ʾ
	public static String Date2String(Date d,String modle){
		SimpleDateFormat sdf = new SimpleDateFormat(modle);
		return sdf.format(d);
		
	}
	//�ַ���ת������ʾ
	public static Date String2Date(String date,String modle) throws ParseException{
//		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(modle);
		Date d = sdf.parse(date);
		return d;
		
	}
}
