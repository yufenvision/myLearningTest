package practise;

public class RubbishDump {

	public static void main(String[] args) {
		// ֱ��newһ������û������
		new Lj();
		new Lj();
		new Lj();
		new Lj();
		System.gc();
	}

}

class Lj{
	protected void finalize() throws Throwable{
		System.out.println("���ڻ�������");
	}
}


