package myArrays;

import java.util.Arrays;

public class IntArrays {
	
//	����һ�����͵����� ����һ������Ϊ10������
	int[] date = new int[10];
//	��Ҫһ��������
	int size;
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
		return Arrays.toString(date);
	}
}
