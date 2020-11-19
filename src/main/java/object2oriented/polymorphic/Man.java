package object2oriented.polymorphic;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月20日 下午4:11:24
* 类说明
*/
public class Man extends Person{
	
	@Override
	void sleep(int sleepTime){
		super.eat();
		super.sleep(super.sleepTime);//子类通过super调用父类的方法
		System.out.println("但是作为男人我只睡：" + sleepTime + "小时");
	}
	
}
