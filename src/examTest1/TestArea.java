package examTest1;

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2);
		System.out.println("��Բ�����Ϊ:"+c.getArea());
		
		Rectangle r = new Rectangle(2,4);
		System.out.println("�þ��ε����Ϊ:"+r.getArea());
		
		Triangle t = new Triangle();
		t.di = 4;
		t.h = 1.5;
		System.out.println("�����������Ϊ:"+t.getArea());
	}

}
