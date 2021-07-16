package designmode.structural_mode.proxy.proxy_test;

import java.lang.reflect.*;

/**
 * @Author: dyf
 * @Date: 2020/11/10 21:17
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        Class<CalculatorImpl> calculatorClassImpl = CalculatorImpl.class;
        Constructor[] constructorsImplClass = calculatorClassImpl.getConstructors();
        Method[] methodsImplClass = calculatorClassImpl.getMethods();

        Class<?> calculatorProxyImplClass = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);
        Constructor[] constructorsProxyImpl = calculatorProxyImplClass.getConstructors();
        Method[] methodsProxyImpl = calculatorProxyImplClass.getMethods();

        System.out.println("------实现类Class的构造信息------");
        CompareClass.printExecutable(constructorsImplClass);
        System.out.println("------实现类Class的方法信息------");
        CompareClass.printExecutable(methodsImplClass);
        System.out.println("------代理类Class的构造信息------");
        CompareClass.printExecutable(constructorsProxyImpl);
        System.out.println("------代理类Class的方法信息------");
        CompareClass.printExecutable(methodsProxyImpl);

        CalculatorImpl calculatorImpl = calculatorClassImpl.getConstructor().newInstance();//class对象通过无参构造方法，创建实例
        System.out.println(calculatorImpl.add(1, 2));
        //代理类对象的构造方法是有InvocationHandler参数的，所以要通过有参构造方法创建新实例
        Calculator calculatorImplProxy = (Calculator) calculatorProxyImplClass.getConstructor(InvocationHandler.class).newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return 200;
            }
        });
        System.out.println(calculatorImplProxy.add(1, 2));


        CalculatorImpl target = new CalculatorImpl();
        //传入目标对象
        //目的：1.根据它实现的接口生成代理对象 2.代理对象调用目标对象方法
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);


    }


    private static Object getProxy(final Object target) throws Exception {
        //参数1：随便找个类加载器给它,这里其实就是用默认加载main方法的AppClassLoader， 参数2：目标对象实现的接口，让代理对象实现相同接口
        Class proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        Object proxy = constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        });
        return proxy;
    }


    private static Object getProxyNew(final Object target) throws Exception {
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),/*类加载器*/
                target.getClass().getInterfaces(),/*让代理对象和目标对象实现相同接口*/
                new InvocationHandler(){/*代理对象的方法最终都会被JVM导向它的invoke方法*/
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "方法开始执行...");
                        Object result = method.invoke(target, args);
                        System.out.println(result);
                        System.out.println(method.getName() + "方法执行结束...");
                        return result;
                    }
                }
        );
        return proxy;
    }

}
