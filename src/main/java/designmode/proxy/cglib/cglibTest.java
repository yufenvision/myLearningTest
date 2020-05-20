package designmode.proxy.cglib;

import designmode.proxy.jdk.dynamic.Landlord;
import designmode.proxy.jdk.dynamic.IUserService;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Author: dyf
 * @Date: 2020/5/20 09:40
 * @Description:
 * 我们了解到，“代理”的目的是构造一个和被代理的对象有同样行为的对象，一个对象的行为是在类中定义的，对象只是类的实例。所以构造代理，不一定非得通过持有、包装对象这一种方式。
 * 通过“继承”可以继承父类所有的公开方法，然后可以重写这些方法，在重写时对这些方法增强，这就是cglib的思想。
 * 根据里氏代换原则（LSP），父类需要出现的地方，子类可以出现，所以cglib实现的代理也是可以被正常使用的
 *
 *
 */
public class cglibTest {

    public static void main(String[] args){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\\\classes");
        CglibProxy proxy = new CglibProxy();
        IUserService userService = (Landlord) proxy.CreatProxyedObj(Landlord.class);
        userService.say("我是cglib代理创造的...");
    }
}
