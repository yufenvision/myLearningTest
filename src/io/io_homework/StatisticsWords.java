package io.io_homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StatisticsWords {

	/**
	 * 3. ʹ����IO�����֪ʶ����ȡһ���ı��ļ���ͳ�Ƴ�����ÿһ�����ʳ��ֵĴ�����
	 * ���ѽ�������������һ���ļ��У�����Ľ���������£�(�˴��ٶ����ʿ�����һ�����߶����ĸ��ɣ����������ֺ�_)
			Hello-10
			java-5
			io-3
	������
		�� ʹ�����������ļ��е����ݶ�ȡ��������
		�� �������������ݣ�ͳ�Ƴ����
		�� ʹ���������������ָ���ļ�
		
		----------------------
		һ�߶�ȡһ�߷�����
			BufferReader	readLine����һ�ζ�ȡһ�з���һ��
			Scanner			nextLine;	ֱ��ָ�����ʵķָ���ģʽ��nextһ�ξͶ���һ������
			
		ʹ��һ��Map���洢	����-����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("D:/abc.txt"));
		Map<String,Integer> m = new HashMap<String,Integer>();
		String line;
		String[] str;
		while((line = r.readLine()) != null){
			
			//�Ѷ�����һ�в��ȡ������
			str = line.split("[^a-zA-Z]+");
			for (String s : str) {
				if(s.matches("\\s*") == false){					
					if(m.containsKey(s)){
						m.put(s, m.get(s)+1);
					}else{
						m.put(s, 1);
					}
				}
			}
			
		}
		
//		System.out.println(m);
		
		r.close();
		Map x = query("ABCDEABCDABC");
		Set keys = x.keySet();
		for (Object o : keys) {
			System.out.println(o + "--" +x.get(o));
		}
	}
	
	public static Map query(String str){
		char[] s  = str.toCharArray();
		Map<Character,Integer> m = new HashMap();
		for (int i = 0; i < s.length; i++) {
			if(m.containsKey(s[i])){
				m.put(s[i], m.get(s[i])+1);
			}else{
				m.put(s[i], 1);
			}
		}
		
		return m;
	}

}
