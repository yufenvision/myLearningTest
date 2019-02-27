package myPractise.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
//JDK动态代理
public class JDKProxy implements InvocationHandler{
	
	// 最终必须要传入真实主题角色，传入接口(抽象主题角色，这样才能实现多次代理)
	private Object targetObject;
	
	 /** 
     * 构造方法 
     * @param targetObject 目标对象  
     */
	public JDKProxy(Object targetObject) {
		this.targetObject = targetObject;
	}

	/** 
     * 获取目标对象的代理对象 
     * @return 代理对象 
     */  
	public Object getProxy(){
		/**
		 * @param 目标对象的类加载器
		 * @param 目标对象的接口数组
		 * @param 实现了InvocationHandler接口的对象
		 * @return 返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序
		 * **/
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}
	
	
	/** 
     * 执行目标对象的方法 
	 * @param Object proxy 代理任何一个接口后类的实例化对象，一般都不用此参数
	 * @param Method method 反射的方法对象
	 * @param Object[] args args参数，真实主题角色调用的参数
	 * @return Object 通过method对象调用真实主题角色之后的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println("proxy" + proxy.getClass());
//		System.out.println("method" + method.getName());
//		System.out.println("args" + Arrays.toString(args));
		
		System.out.println("----------执行目标对象方法前Before-----------");
		// 执行目标对象的方法  
		Object result = method.invoke(targetObject, args);
		System.out.println("----------执行目标对象方法后After-----------");
		return result;
	}
	
}
