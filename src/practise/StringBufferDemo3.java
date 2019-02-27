package practise;

public class StringBufferDemo3 {
	/**
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String str = new String("AA");
		String str1 = new String("BB");
		StringBuffer sb1 = new StringBuffer("QQ");
		StringBuffer sb2 = new StringBuffer("KK");
		change(str,str1,sb1,sb2);
		System.out.println(str);//AA
		System.out.println(str1);//BB
		System.out.println(sb1);//QQUU
		System.out.println(sb2);//KKOO
		addStr(str,str1);
		System.out.println(str);
	}
	
	public static void change(String str,String str1,StringBuffer sb1,StringBuffer sb2){
		str = str + 100;
		str1.concat("yy");
		sb1 = sb1.append("UU");
		sb2.append("OO");
	}
	
	public static void addStr(String str1,String str2){
		str1 = str1 + str2;
	}
	
}
