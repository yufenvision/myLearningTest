package polymorphic;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月20日 下午4:08:57
* 类说明
*/
public class Person {
	
	
	int sleepTime = 8;
	
	void eat(){
		System.out.println("人要吃东西");
	}
	
	void sleep(int sleepTime){
		System.out.println("人要睡觉" + sleepTime + "小时");
	}
	
}
