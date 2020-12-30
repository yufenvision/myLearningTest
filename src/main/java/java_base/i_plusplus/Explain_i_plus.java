package java_base.i_plusplus;

public class Explain_i_plus {
	
	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println(a);
		
		int varNum = 66;
		varNum = varNum ++;
		System.out.println(varNum);
		cycle();
		int q = 0;
		int bq = 0;
		int times = 100;
		while(times > 0){
			int x = (int)(Math.random()*100);
			if(x > 50){
				q++;
			}else if(x == 50){
			}else{
				bq++;
			}
			times--;
		}
		if(q > bq){
			System.out.println("去");
		}else{
			System.out.println("不去");
		}
	}
	
	public static void cycle(){
		int num = 0;
		for(int i = 0;i < 9;i++){
			num = num++;
		}
		System.out.println(num);
	}
}
