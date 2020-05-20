package thinkingInJava.chapter3_4.loop;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月28日 上午11:21:47
*/
public class LabelLoop {
	public static void main(String[] args) {
		int i = 0;
		outer://Can't have statements here
		for(;true;){
			inner://Can't have statements here
			for(;i < 10 ; i++){
				print("i = " + i);
				if(i == 2){
					print("continue");
					continue;
				}
				if(i == 3){
					print("break");
					i++;//Otherwise i never gets incremented
					break;
				}
				if( i == 7){
					print("continue outer");
					i++;//Otherwise i never gets incremented
					continue outer;
				}
				if( i == 8){
					print("break outer");
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if(k == 3){
						print("continue inner");
						continue inner;
					}
				}
			}
		}
		//Can't break or continue to labels here
		
	}
	
	public static void print(String s){
		System.out.println(s);
	}
}
