package polymorphic.implYourInterface;

public class B implements MyDefinedInterface{
	@Override
	public String getDataByYouGuys(String some) {
		
		return "这是B返回的数据：" + some;
	}
}
