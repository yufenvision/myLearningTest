package regexDemo;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "131";
		String regex = "[0-9]{3,11}";
		System.out.println(num.matches(regex));
		
		//替换
		String s = "121321334546";
		regex = "4";
		String s2 = s.replaceAll(regex, "8");
		System.out.println(s);
		System.out.println(s2);
		
		//高级的替换：13212345478 132源代码教育5478
		//分组：把手机号码分成3组，只替换第二组
		String s3 = "13212345478";
		String s4 = s3.replaceAll("([0-9]{3})([0-9]{4})([0-9]{4})", "$1源代码教育$3");
		System.out.println(s4);
	}

}
