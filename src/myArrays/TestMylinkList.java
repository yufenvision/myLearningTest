package myArrays;

public class TestMylinkList {

	public static void main(String[] args) {
		//��Ҫ������������
		MylinkList mll = new MylinkList();
		mll.add("����");
		mll.add(1234);
		mll.add('a');
		mll.add(false);
		
		System.out.println(mll);//��дtoString����
		System.out.println(mll.getSize());
		
	}

}
