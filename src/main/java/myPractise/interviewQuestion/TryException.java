package myPractise.interviewQuestion;

import java.io.IOException;

public class TryException {
	
	public static int calc() throws IOException{
		int ret = 0;
		try {
			System.out.println("进入try");
			++ret;
			throw new IOException("try");
		} catch (Exception e) {
			System.out.println("进入异常。。");
			--ret;
			return ret;
		}finally{
			System.out.println("最后");
			++ret;
			return ret;
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(calc());
		
	}
	
	
	
}
