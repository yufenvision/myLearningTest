package gather;

import java.util.ArrayList;

/**
 * @author SEELE
 * ����һ��ArrayList������
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		//����һ��������
		ArrayList<Comparable> arr1 = new ArrayList();
		//�������������������--��һЩArrayList����ʲô�������Ե���
		arr1.add("���֤");
		arr1.add("Ů����Ƭ");
		arr1.add("�ֻ�");
		arr1.add("Կ��");
		arr1.add('Ǯ');
		arr1.add("����");
		arr1.add(1,"����");
		
		ArrayList<Comparable> wallet = new ArrayList();
		wallet.add("���ÿ�");
		wallet.add("���п�");
		wallet.add("Ů����Ƭ");
		wallet.add(100);
		//arr1.addAll(wallet);
		arr1.addAll(0,wallet);
		//arr1.clear();
		
		System.out.println(arr1.size());
		System.out.println(arr1);
		System.out.println(arr1.contains("����"));
		System.out.println(arr1.get(2));
		System.out.println(arr1.indexOf("Ů����Ƭ"));
		System.out.println(arr1.lastIndexOf("Ů����Ƭ"));
		System.out.println(arr1.isEmpty());
		//arr1.remove(5);
		arr1.remove(new Integer(100));
		arr1.remove(new Character('Ǯ'));
		arr1.set(2, "������Ƭ"); 
		System.out.println(arr1);
		
	}

}
