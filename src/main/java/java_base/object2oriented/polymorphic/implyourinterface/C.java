package java_base.object2oriented.polymorphic.implyourinterface;

public class C implements MyDefinedInterface{
	
	@Override
	public String getDataByYouGuys(String some) {
		
		return "这是C返回的数据：" + some;
	}
}
