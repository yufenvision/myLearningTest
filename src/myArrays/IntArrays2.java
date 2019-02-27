package myArrays;

import java.util.Arrays;

public class IntArrays2 {
	
//	创建一个整型的数组 创建一个长度为10的数组
	int[] date = new int[10];
//	需要一个计数器
	int size;
//	构造方法
	IntArrays2(){
		this(10);
	}
	IntArrays2(int length){
		date = new int[length];
	}
//	提供一个方法 往数组里面添加数据
//	往数组里面添加数据，放到哪个地方--需要计数器
	public void add(int i){
		date[size] = i;
		size++;
	}
	
//	提供返回int数组的长度
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
