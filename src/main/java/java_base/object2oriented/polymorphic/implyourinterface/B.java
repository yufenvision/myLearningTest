package java_base.object2oriented.polymorphic.implyourinterface;

public class B implements MyDefinedInterface{
	@Override
	public String getDataByYouGuys(String some) {
		
		return "这是B返回的数据：" + some;
	}
}
