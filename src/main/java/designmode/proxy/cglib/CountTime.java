package designmode.proxy.cglib;

import designmode.proxy.jdk.dynamic.IUserService;
import designmode.proxy.jdk.dynamic.JDKProxy;
import designmode.proxy.jdk.dynamic.Landlord;

/**
 * @Author: dyf
 * @Date: 2020/5/21 09:51
 * @Description:
 */
public class CountTime{


    public static void getCostTime(IUserService iUserService){
        long begin = System.currentTimeMillis();
        iUserService.say("干事");
        long end = System.currentTimeMillis();
        long usedTime = end - begin;
        System.out.println(iUserService.getClass().getName() + "耗时： " + usedTime);
    }

    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        IUserService cglibProxy = (Landlord) proxy.CreatProxyedObj(Landlord.class);

        JDKProxy proxy1 = new JDKProxy(new Landlord());
        IUserService jdkProxy = (IUserService) proxy1.getProxy();

        CountTime.getCostTime(jdkProxy);
        CountTime.getCostTime(cglibProxy);
    }
}