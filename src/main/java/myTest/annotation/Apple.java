package myTest.annotation;

@FruitInfo
public class Apple {
	
	@FruitInfo(name="苹果")
	private String name;
	
	@FruitInfo(color="红色")
	private String color;
	
	@FruitInfo(num=5)
	private int num;
	
	@FruitProvider(id=1,name="红富士集团",address="南极洲")
	private String provider;

	@FruitProvider(name="测试注解加在方法上")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public void displayName(){
		System.out.println("这是红苹果");
	}
}
