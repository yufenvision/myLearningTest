package polymorphic.implyourinterface;

public class A implements MyDefinedInterface{

	@Override
	public String getDataByYouGuys(String some) {
		
		return "这是A返回的数据：" + some;
	}

}
