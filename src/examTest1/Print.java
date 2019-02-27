package examTest1;



public class Print {
	public static void main(String[] args) {
		new Print().print(5);
		System.out.println(lastIndexOf("abcdcef", 'c'));
		int[] src = {1,2,3,4,5,6};
		int[] dest = new int[8];
		arraycopy(src,1,dest,0,5);
		System.out.print("[");
		for(int i=0;i<dest.length;i++){
			System.out.print(dest[i]+",");
		}
		System.out.print("]");
	}
	//作业题1
	void print(int num){
		for(int i = 1;i<=num;i++){
			for(int j = 1; j<=num-i+1;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//作业题4
	static int lastIndexOf(String s,char c){
		char[] sArr = s.toCharArray();
		for(int i = sArr.length-1;i >=0 ;i--){
			if(sArr[i] == c){
				return i;
			}
		}
		
		return -1;
	}
	//自己实现arraycopy方法
	public static void arraycopy(int[] src,int srcPos,int[] dest,int destPos,int length){
		int[] temp = new int[length];
		int tempIndex = 0;
		for(int i = srcPos;i < length+srcPos;i++){
			temp[tempIndex] = src[i];
			tempIndex++;
		}
		tempIndex = 0;
		for(int j = destPos;j < length+destPos;j++){
			dest[j] = temp[tempIndex];
			tempIndex++;
		}
	}
	
	
	
}
