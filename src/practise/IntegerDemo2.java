package practise;

public class IntegerDemo2 {
	/*
	 *ʹ�� == ��equal�Ƚ� 
	 * 
	*/
	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//f
		System.out.println(i1.equals(i2));//t
		System.out.println("---------------");
		
//		Integer�����и����棬�Ѿ���ʹ�õ�һЩֵ�������������Χ��-128,127��
		Integer i3 = 123;
		Integer i4 = 123;
		System.out.println(i3 == i4);//t
		System.out.println(i3.equals(i4));//t
		System.out.println("---------------");
		
		Integer i11 = 1234;
		Integer i22 = 1234;
		System.out.println(i11 == i22);//f
		System.out.println(i11.equals(i22));//t
		
	}
}
