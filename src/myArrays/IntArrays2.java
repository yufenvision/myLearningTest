package myArrays;

import java.util.Arrays;

public class IntArrays2 {
	
//	����һ�����͵����� ����һ������Ϊ10������
	int[] date = new int[10];
//	��Ҫһ��������
	int size;
//	���췽��
	IntArrays2(){
		this(10);
	}
	IntArrays2(int length){
		date = new int[length];
	}
//	�ṩһ������ �����������������
//	����������������ݣ��ŵ��ĸ��ط�--��Ҫ������
	public void add(int i){
		date[size] = i;
		size++;
	}
	
//	�ṩ����int����ĳ���
	public int getSize(){
		return size;
	}
	
	@Override
	public String toString(){
		int[] newArr = new int[size];
		System.arraycopy(date, 0, newArr, 0, size);
		return Arrays.toString(newArr);
	}
}
