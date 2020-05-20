package designmode.proxy.jdk.dynamic;


import org.junit.Test;


//测试类
public class ProxyTest {
	// 真实主题角色
	IUserService targetObject = new Landlord();
	
	//如果有事务对象txManager，也可以在代理类JDKProxy中加入，再生成带事务的代理主题角色proxyObject
	
	@Test
	public void noProxy() throws Exception {
		
		targetObject.say("");
		
	}
	
	
	
	@Test
	public void withProxy() throws Exception {
		
		//代理对象
		JDKProxy proxy = new JDKProxy(targetObject);
		
		//代理主题角色
		IUserService proxyObject = (IUserService) proxy.getProxy();
		// JDK代理后的类名：$Proxy5 implements IUserService
		System.out.println("test:"+proxyObject+"------"+getClass());
		System.out.println("test:" + (proxyObject instanceof IUserService));

		proxyObject.say("");
		proxyObject.say("交房租了1000块");

	}
}
