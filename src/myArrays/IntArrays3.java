package myArrays;

import java.util.Arrays;

/**
 * @author SEELE
 *
 */
public class IntArrays3<T> {
	
//	����һ�����͵����� ����һ������Ϊ10������
	Object[] date = new Object[10];
//	��Ҫһ��������
	int size;
//	���췽��
	IntArrays3(){
		this(10);
	}
	IntArrays3(int length){
		date = new Object[length];
	}
//	�ṩһ������ �����������������
//	����������������ݣ��ŵ��ĸ��ط�--��Ҫ������
	public boolean add(T i){
		//�ж��ظ����
		for (int j = 0; j < size; j++) {
			if(date[j].equals(i)){
				return false;
			}
		}
		//�жϳ����Ƿ��Ѿ�����ָ���ĳ���
		if(size == date.length){
			//���ݴ���һ��������
			Object[] newArrs = new Object[date.length*2];
			//���������鵽������
			System.arraycopy(date, 0, newArrs, 0, size);
			//�滻�������ַ����������
			date = newArrs;
		}
		date[size] = i;
		size++;
		return true;
	}
	//����ָ����������Ԫ��
	public Object getElementByIndex(int index){
		if(index<0 || index>date.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		return date[index];
	}
	//����Ԫ�ص�һ�γ��ֵ�����
	public int getFirstIndexByElement(Object obj){
		for(int i = 0;i < size; i++){
			if(date[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}
	//ɾ������
	public void deleteIndex(int index){
		if(index < 0 || index > date.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		System.arraycopy(date, index+1, date, index, size-index-1);
		size--;
	}
	//ɾ��ָ���ĵ�һ��Ԫ��
	public void deleteFirstElement(Object obj){
		int index = this.getFirstIndexByElement(obj);
		this.deleteIndex(index);
	}
	
//	�ṩ����int����ĳ���
	public int getSize(){
		return size;
	}
	
	@Override
	public String toString(){
		Object[] newArr = new Object[size];
		System.arraycopy(date, 0, newArr, 0, size);
		return Arrays.toString(newArr);
	}
}
