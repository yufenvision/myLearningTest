package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/4/9 16:11
 */
/*
 *手机的业务类，该业务类通过webservice 对外提供服务
 * 1. 声明： @webservice
 * 2. 发布 EndPoint
 */

//给类添加上@WebService注解后,代表发布一个WebService服务,类中所有的非静态方法都将会对外公布
@WebService(serviceName="PhoneManager",//修改服务名
        targetNamespace="http://www.baidu.com") //修改命名空间 ，默认包名，取反
//声明该业务类对外提供webservice服务,默认只是对public修饰的方法,对外以webservice形式发布
public class PhoneService {

    @WebMethod(operationName="getMObileInfo")
    public @WebResult(name="phone") Phone getPhoneInfo(@WebParam(name="osName")String osName){
        Phone phone=new Phone();
        if(osName.endsWith("android")){
            phone.setName("android");phone.setOwner("google");phone.setTotal(80);
        }else if(osName.endsWith("ios")){
            phone.setName("ios");phone.setOwner("apple");phone.setTotal(15);
        }else{
            phone.setName("windows phone");phone.setOwner("microsoft");phone.setTotal(5);
        }
        return phone;
    }

    @WebMethod(operationName="test")
    public @WebResult(name="phone") Phone test(){
        Phone phone = new Phone();
        phone.setName("测试返回电话");
        phone.setOwner("测试人员");
        phone.setTotal(100);
        return phone;
    }


    @WebMethod(exclude=true)//如果希望某个方法不对外公开，可以在方法上添加@WebMethod(exclude=true)，阻止对外公开。
    public void sayHello(String city){
        System.out.println("你好："+city);
    }
    private void sayLuck(String city){
        System.out.println("好友："+city);
    }
    void sayGoodBye(String city){
        System.out.println("拜拜:"+city);
    }
    protected void saySayalala(String city){
        System.out.println("再见！"+city);
    }

    public static void main(String[] args) {
        String address1="http://127.0.0.1:8888/ws/phoneService";
//		String address2="http://127.0.0.1:8888/ws/phoneManager";
        /**
         * 发布webservice服务
         * 1.address：服务的地址
         * 2：implementor 服务的实现对象
         */

        Endpoint.publish(address1, new PhoneService());
        //通过EndPoint(端点服务)发布一个webService。Endpoint也是jdk提供的一个专门用于发布服务的类，它的publish方法接收两个参数，一个是本地的服务地址，二是提供服务的类。它位于javax.xml.ws.*包中。
//		Endpoint.publish(address2, new PhoneService());
        System.out.println("wsdl地址 :"+address1+"?WSDL");
    }

}
