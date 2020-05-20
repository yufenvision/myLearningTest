package designmode.proxy.jdk.dynamic;

//真实主题角色：房东
public class Landlord implements IUserService{

	//房东讲话
	@Override
	public void say(String word) {
		if(word == null || word.length() == 0)
			System.out.println("房东没说话");
		else
			System.out.println("房东说："+ word);
	}
	
}
