package gather;

import java.util.ArrayList;

public class ArrayListDemo1 {
	/**
	 * 	����ʹ��һ�����ϣ�����ArrayList�����洢��λ�����䣬�����ƽ������;
	 *  ������1������һ��ArrayList
	 *  	2)�������������
	 *  	3������ArrayList��ȡ�����䣬���ۼ�sum
	 *  	4��sum/size
	 */
	public static void main(String[] args) {
		ArrayList ages = new ArrayList();
		int sum = 0;
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		
//		for(int i = 0; i < ages.size(); i++){
//			sum += (Integer)ages.get(i);
//		}
		//ʹ����ǿ��forѭ��(Դ�е�Ԫ������e��Դ )
		for(Object i: ages){
			sum +=(Integer)i;
		}
		System.out.println(sum/ages.size());
	}
}
