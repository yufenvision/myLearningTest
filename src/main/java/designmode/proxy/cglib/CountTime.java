package designmode.proxy.cglib;

import designmode.proxy.jdk.dynamic.HouseOwner;
import designmode.proxy.jdk.dynamic.JDKProxy;
import designmode.proxy.jdk.dynamic.Landlord;

/**
 * @Author: dyf
 * @Date: 2020/5/21 09:51
 * @Description:
 */
public class CountTime{


    public static void getCostTime(HouseOwner houseOwner){
        long begin = System.currentTimeMillis();
        houseOwner.say("干事");
        long end = System.currentTimeMillis();
        long usedTime = end - begin;
        System.out.println(houseOwner.getClass().getName() + "耗时： " + usedTime);
    }

    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        HouseOwner cglibProxy = (Landlord) proxy.CreatProxyedObj(Landlord.class);

        JDKProxy proxy1 = new JDKProxy(new Landlord());
        HouseOwner jdkProxy = (HouseOwner) proxy1.getProxy();

        CountTime.getCostTime(jdkProxy);
        System.out.println("============================================");
        CountTime.getCostTime(cglibProxy);
    }
}
