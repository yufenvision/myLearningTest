package myTest.md5;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
		String password = "Pass@2018";
		String password1 = "12345678";
		String password2 = "12345666";
//		ffa1ce8098d0d40a8969347c33cce30b
//		25d55ad283aa400af464c76d713c07ad
//		614e17c5683afcc59c2e68e6f4737328
		System.out.println(MD5Utils.getMD5String(password));
		System.out.println(MD5Utils.getMD5String(password1));
		System.out.println(MD5Utils.getMD5String(password2));
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "2020-09-14 10:27:10";
		System.out.println(sm.parse(time).getTime());
		System.out.println(String.valueOf(System.currentTimeMillis()).substring(0,10));
	}
}
