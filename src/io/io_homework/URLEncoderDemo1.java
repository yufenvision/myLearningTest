package io.io_homework;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderDemo1 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * HTML���룺
		 * 	URLEncoder��
		 * 		static String encode(String s, String enc)
		 * 			s ��������ַ���
		 * 			enc ʹ�õı������
		 * 			���ر�����ϵĽ�� 
		 * 
		*/
		String s = "Դ�����0123ABCabc_ *+";
		System.out.println(URLEncoder.encode(s,"UTF-8"));
		
		String s1 = "%E6%BA%90%E7%A0%81%E6%95%99%E8%82%B20123ABCabc_+*%2B";
		String s2= "%25E6%25AD%25A3%25E5%2588%2599%25E8%25A1%25A8%25E8%25BE%25BE%25E5%25BC%258F%25E5%258E%25BB%25E7%25A9%25BA%25E6%25A0%25BC&rsv";
		System.out.println(URLDecoder.decode(s1,"UTF-8"));
		System.out.println(URLDecoder.decode(s2,"gbk"));
	}

}
