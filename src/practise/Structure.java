package practise;

public class Structure {

	public static void main(String[] args) {
		S s = new S(10);
		System.out.println(s.name);
	}

}


class S{
	 String name = "��ʼ��";
	 int[] date = new int[10];
     int size;

     S(){
    	 this(10);
    	 this.name = "��ʼ��2";    	 
     }
     S(int length){
           date = new int[length];
     }

}