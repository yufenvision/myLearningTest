package designmode.structural_mode.proxy.myaopframework.service;


import designmode.structural_mode.proxy.myaopframework.anotation.MyTransactional;

@MyTransactional
public class UserServiceImpl implements UserService {
	@Override
	public void getUser() {
		System.out.println("service执行...");
	}
}



