package java_base.string;

public class JudgeStrRepeatNums {
	public static void main(String[] args) {
		
		String a = "Hello World";
		//1.获取字符串长度
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		
		//转换成byte数组
		byte[] bys = a.getBytes();
		System.out.println(new String(bys));
		
		//转换成char数组
		char[] cArr = a.toCharArray();
		System.out.println(cArr);
		
		String b = "hello world";
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.startsWith("He"));
		System.out.println(a.endsWith("rld"));
		
		//2.截取字符串
		System.out.println(a.substring(0));
		System.out.println(a.substring(0,5));//前开后闭
		
		//3.查找字符串出现下标
		System.out.println(a.indexOf("H"));//第一次出现
		System.out.println(a.lastIndexOf("o"));//最后一次出现
		
		//4.利用正则，判断替换，判断是否匹配
		String c = "您好";
		System.out.println(a.replace(a,c));
		System.out.println(a.replace("H","我把H替换了"));
		System.out.println(a.matches("[a-zA-Z ]*"));
		
		//5.是否包含某个字符串
		System.out.println(a.contains("o"));
		
		
		judge("o",a);
		judgeSplit("o",a);
	}
	
	
	public static void judge(String str,String src){
		if(src !=null && !"".equals(src)){
			String strNew = src.replace(str, "");
			System.out.println("重复次数为: "+(src.length() - strNew.length()));
		}
	}
	public static void judgeContains(String str,String src){
		
		
		
	}
	public static void judgeSplit(String str,String src){
		if(src!=null&&!"".equals(src)){
			String[] sAtrr = src.split("");
			int num=0;
			for (String string : sAtrr) {
				if(string.equals(str)){
					num++;
				}
			}
			System.out.println("重复次数为: "+num);
		}
	}
}
