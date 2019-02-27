package gather;

import java.util.ArrayList;

/**
 * @author SEELE
 * 创建一个ArrayList容器类
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		//创建一个容器类
		ArrayList<Comparable> arr1 = new ArrayList();
		//往容器类里面添加数据--看一些ArrayList类有什么方法可以调用
		arr1.add("身份证");
		arr1.add("女神照片");
		arr1.add("手机");
		arr1.add("钥匙");
		arr1.add('钱');
		arr1.add("打火机");
		arr1.add(1,"香烟");
		
		ArrayList<Comparable> wallet = new ArrayList();
		wallet.add("信用卡");
		wallet.add("银行卡");
		wallet.add("女神照片");
		wallet.add(100);
		//arr1.addAll(wallet);
		arr1.addAll(0,wallet);
		//arr1.clear();
		
		System.out.println(arr1.size());
		System.out.println(arr1);
		System.out.println(arr1.contains("香烟"));
		System.out.println(arr1.get(2));
		System.out.println(arr1.indexOf("女神照片"));
		System.out.println(arr1.lastIndexOf("女神照片"));
		System.out.println(arr1.isEmpty());
		//arr1.remove(5);
		arr1.remove(new Integer(100));
		arr1.remove(new Character('钱'));
		arr1.set(2, "男神照片"); 
		System.out.println(arr1);
		
	}

}
