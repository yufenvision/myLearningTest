package practise;

/**
 * @author SEELE
 * �����û����ظ��쳣
 * 1)ʹ��һ��������ģ�����ݿ⣬����û���String[]
 * 2)����һ������reg(String usrname) ��Ҫ����һ���û�������
 * 3)���û��������������ֵ�����жϣ������ȣ�����һ���Զ����쳣
 *  �������ȣ���ע��ɹ�
 */
public class TestExistException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			reg("̷����");
		} catch (ExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void reg(String username) throws ExistException{
		
		String[] strArr = {"̷����","�仨","�绨","���"};
//		�����ж�
		for(String s : strArr){
			if(s.equals(username)){
				//����һ���쳣,�׳�
				//���Խ����ֶ��������������׳�
				throw new ExistException("�ף��û����ظ���");
			}
		}
		System.out.println("ע��ɹ�");
	}
}
