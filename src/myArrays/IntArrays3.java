package myArrays;

import java.util.Arrays;

/**
 * @author SEELE
 *
 */
public class IntArrays3<T> {
	
//	创建一个整型的数组 创建一个长度为10的数组
	Object[] date = new Object[10];
//	需要一个计数器
	int size;
//	构造方法
	IntArrays3(){
		this(10);
	}
	IntArrays3(int length){
		date = new Object[length];
	}
//	提供一个方法 往数组里面添加数据
//	往数组里面添加数据，放到哪个地方--需要计数器
	public boolean add(T i){
		//判断重复语句
		for (int j = 0; j < size; j++) {
			if(date[j].equals(i)){
				return false;
			}
		}
		//判断长度是否已经超过指定的长度
		if(size == date.length){
			//扩容创建一个新数组
			Object[] newArrs = new Object[date.length*2];
			//拷贝老数组到新数组
			System.arraycopy(date, 0, newArrs, 0, size);
			//替换新数组地址传给老数组
			date = newArrs;
		}
		date[size] = i;
		size++;
		return true;
	}
	//查找指定索引处的元素
	public Object getElementByIndex(int index){
		if(index<0 || index>date.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		return date[index];
	}
	//查找元素第一次出现的索引
	public int getFirstIndexByElement(Object obj){
		for(int i = 0;i < size; i++){
			if(date[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}
	//删除方法
	public void deleteIndex(int index){
		if(index < 0 || index > date.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		System.arraycopy(date, index+1, date, index, size-index-1);
		size--;
	}
	//删除指定的第一个元素
	public void deleteFirstElement(Object obj){
		int index = this.getFirstIndexByElement(obj);
		this.deleteIndex(index);
	}
	
//	提供返回int数组的长度
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
