package designmode.construct_mode.proxy.cglib;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: dyf
 * @Date: 2020/5/20 09:41
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {


    // 根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object CreatProxyedObj(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理增强~~~");
        return methodProxy.invokeSuper(o, objects);
//        return methodProxy.invoke(o, objects);//会导致栈内存溢出
    }
}
