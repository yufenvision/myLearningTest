package regexDemo;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "131";
		String regex = "[0-9]{3,11}";
		System.out.println(num.matches(regex));
		
		//�滻
		String s = "121321334546";
		regex = "4";
		String s2 = s.replaceAll(regex, "8");
		System.out.println(s);
		System.out.println(s2);
		
		//�߼����滻��13212345478 132Դ�������5478
		//���飺���ֻ�����ֳ�3�飬ֻ�滻�ڶ���
		String s3 = "13212345478";
		String s4 = s3.replaceAll("([0-9]{3})([0-9]{4})([0-9]{4})", "$1Դ�������$3");
		System.out.println(s4);
	}

}
