package practise;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1};
		pp(arr);
		
	}	
	public static void pp(int[] arr){
		try{
			System.out.println(arr[2]);
			System.out.println(arr[0]/arr[1]);
			System.exit(0);
		
		}catch(NullPointerException e){
			System.out.println("不要空指针哦");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组不能为空");
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(Exception e){
			
		}
	}
}

class Down{
	void down(){
		System.out.println("ss");
	}
}
