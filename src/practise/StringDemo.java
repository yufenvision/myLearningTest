package practise;

public class StringDemo {

	public static void main(String[] args) {
		/* ����һ��String����
			1��ͨ��new String�������췽����������
			
		*/
		String str = new String();
		String str1 = "";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);
		System.out.println(str.equals(str1));		
		System.out.println("--------------------");
		
		String s1 = "���ټ���";
		String s2 = "���ټ���";
		System.out.println(s1 == s2);//����Ϊtrue����Ϊs1,s2��ָ����ǡ������ء���û��ָ����ڴ�
		System.out.println(s1.equals(s2));
		
		String s11 = new String("��������");
		String s12 = new String("��������");
		System.out.println(s11 ==  s12);
		System.out.println(s11.equals(s12));
	}

}
