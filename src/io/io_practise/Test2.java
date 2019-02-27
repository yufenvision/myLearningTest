package io.io_practise;

public class Test2 {

	/**
	 * �����ĵݹ���ã�
	 * 		��һ�������ڲ��Լ������Լ�
	 * 		һ��һ���ݹ鷽�����ö�Ӧ���г���
	 * -------------------
	 * ��������	쳲���������
	 * F(0)=0;
	 * F(1)=1;
	 *	....
	 * F(n) = F(n-1) + F(n-2); (n>=2)
	 *
	 * 
	 * 
	 */
	public static int f(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			return f(n-1)+f(n-2);                  
		}		
	}
	
	public static void main(String[] args) {
		//main(args);
		System.out.println(f(0));
		System.out.println(f(1));
		System.out.println(f(3));
		
	}

}
