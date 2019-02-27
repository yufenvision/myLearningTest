package io.io_practise;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	/**
	 * ���췽����
	 * 	File(String pathname)ͨ����ָ��·�����ַ���ת��Ϊ����·����������һ����Fileʵ����
	 *  File(String parent, String child)����parent·�����ַ�����child·�����ַ�������һ���µ�Fileʵ����
	 *  File(File parent, String child)����parent����·������child·�����ַ�������һ���µ�Fileʵ��
	 * ·����
	 * 	  ���·�����������˭�������������������ڵ�ǰ����
	 *   ����·����ͨ��·���ܹ���λ������ļ�
	 *   
	 *   ��ʵ,������  : File f1 = new File("abcd.txt");  ������ʾ�ڳ�������һ��File����,�������ٴ������洴��һ��������ļ�
		
	��ô��?  ��Ҫ����File�еĵ����ķ���������ڴ������洴���ļ�
			boolean createNewFile() 
			�� ��ε���? Ӧ����һ��File����(��File�����б�����ļ�·�����ڴ������洴��һ���ļ�)
			�� ����������ļ�·��������,�����쳣
			�� ����ɹ���������true,����ļ��Ѿ�������,����false(���Ḳ���Ѿ����ڵ�)
			�� �˷���ֻ�ܹ�������ͳ�����ļ�
			
		���ܻ���Ҫ�󴴽��ļ���,Ȼ�󴴽��ļ�,һ���Ǵ����ļ��еķ���:
			boolean mkdir() 
 			boolean mkdirs() 
 			�� �����������������ҪFile�������
 			�� ����ļ���(�ļ�)�Ѿ������˷���false
			�� mkdir Ҫ�󴴽���Ŀ¼��·���������,��Ȼ����false
			�� mkdirs ���·��������,���ȴ�����·��
		
		ɾ��
			boolean delete()
			�� ����ɾ���ļ�Ҳ����ɾ��Ŀ¼���ļ��У�
			�� һ��File���������ã���ǰ��File����������������ļ�)
			�� ֻ�ܹ�ɾ����Ŀ¼
			
			
	 * @throws IOException 
	 */
	
	/*
	 * ɾ���Ĺ��߷�����
	 * 	��������ķ������Լ�дһ������������ɾ��������ļ����ļ��У��������ļ������ļ��еģ�
			�� �������ѣ�ɾ�����ļ����Լ���������
			�� ��������
	 * 
	 */
	public static void deleteAll(File f){
		/*
		 * �� �ж�pathname�Ƿ�Ϊnull --->���е��������Ͷ�Ӧ���жϴ���
		 * �� �ж�f��Ӧ���ļ��Ƿ����
		 * �� �ж����ļ�����Ŀ¼
		 * 		�ļ�		ֱ�ӵ���delete����ɾ��
		 * 		Ŀ¼		�ж��Ƿ�Ϊ��Ŀ¼
		 * 				��	ֱ�� ����delete����ɾ��
		 * 				�ǿ�	�Ȱѷǿ�Ŀ¼�����ȫ��ɾ������ɾ����ǰ�Ŀ�Ŀ¼
		 * 					�õ���ǰ�ǿ�Ŀ¼���������File���� ������һ������-fs
		 * 					����fs
		 * 					for(fs){
		 * 						ѭ��һ�εõ�һ��File����   f1
		 * 						�ж����ļ�������Ŀ¼
		 * 							�ļ�	ֱ��ɾ��
		 * 							Ŀ¼ 	�ж��Ƿ�Ϊ��
		 * 								��	ֱ��ɾ��
		 * 								�ǿ�	......
		 * 								......
		 * 								......	
		 * 					}
		 * 		------>���������д��ֻ��ɾ���̶��������ļ���
		 * 		------>�����ĵݹ����
		 */
		if(f == null){
			System.out.println("·��������,���������롣");			
		}else if(f.isFile()){
			f.delete();
		}else{
			File[] ff = f.listFiles();
			if(ff.length == 0){
				f.delete();
			}else{
				for (File file : ff) {
					deleteAll(file);
				}
			}
			f.delete();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("D:/a/b/c");
		File f2 = new File("D:a/b/c","abcd.txt");
		File f3 = new File(new File("D:a/b/c"),"abcd.txt");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
//		System.out.println(f1.createNewFile());
		System.out.println(f1.mkdirs());
//		deleteAll(f1);
		
	}

}
