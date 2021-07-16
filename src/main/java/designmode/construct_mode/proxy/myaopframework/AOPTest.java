package designmode.construct_mode.proxy.myaopframework;


import designmode.construct_mode.proxy.myaopframework.factory.BeanFactory;
import designmode.construct_mode.proxy.myaopframework.service.UserService;

public class AOPTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new BeanFactory();
		try {
			Object bean = beanFactory.getBean("designmode.construct_mode.proxy.myaopframework.service.UserServiceImpl");
			System.out.println(bean.getClass().getName());
			UserService userService = (UserService)bean;
			userService.getUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



