package practise;

public class StringBufferDemo2 {
	/**
	 * ��1-1000�������ӳ�һ���ַ���
	 * ����Ч��123456789101112.....9991000
	 * ������1�������String�������ַ�����
	 * 	   2��ѭ��1��1000��ֵ��ƴ�ӳ�123.....1000
	 * 	   3)��ӡ�ַ���
	 */
	public static void main(String[] args) {
		String s1 = "";
		Long start = System.currentTimeMillis();
		for(int i = 1;i <= 1000;i++){
			s1 += i;
		}
		Long end = System.currentTimeMillis();
		System.out.println(s1);
		System.out.println("��ʱ��"+(end - start)+"����");
		System.out.println("-----------------");
		
		StringBuffer s2 = new StringBuffer();
		Long start1 = System.currentTimeMillis();
		for(int i = 1;i <= 1000;i++){
			s2.append(i);
		}
		Long end1 = System.currentTimeMillis();
		System.out.println(s2);
		System.out.println("��ʱ��"+(end1 - start1)+"����");
		
	}

}
