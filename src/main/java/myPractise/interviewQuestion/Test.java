package myPractise.interviewQuestion;

import java.io.UnsupportedEncodingException;

public class Test {
	
	public int aMethod(){
		int i = 0;
		i++;
		return i;
	}
	
	public static void transcoding() throws UnsupportedEncodingException{
		//下面哪种能将“gb2312”转成"utf-8"
		byte[]src = {'A'}, dst;
		dst = new String(src,"utf-8").getBytes("gb2312");
		System.out.println(new String(dst));
		dst = new String(src,"gb2312").getBytes("utf-8");
		System.out.println(new String(dst));
		dst = new String(src,"utf-16").getBytes();
		System.out.println(new String(dst));
		dst = new String(src).getBytes();
		System.out.println(new String(dst));
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		Test test = new Test();
		test.aMethod();
		
		int j = test.aMethod();
		System.out.println(j);
		
		transcoding();
	}
	
}
