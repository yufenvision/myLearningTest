package myTest.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "Pass@2018";
		String password1 = "12345678";
		String password2 = "12345666";
		
		System.out.println(MD5Utils.getMD5String(password));
		System.out.println(MD5Utils.getMD5String(password1));
		System.out.println(MD5Utils.getMD5String(password2));
		
		
	}
}
