package myPractise.proxyTest;

//真实主题角色：房东
public class UserServiceImpl implements IUserService{

	//房东讲话
	@Override
	public void say(String...word) {
		if(word.length==0){
			System.out.println("房东没说话");
		}else{
			System.out.println("房东说："+word);
		}
	}
	
}
