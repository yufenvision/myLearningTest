package myTest.genericity;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;

public class Fruit {
	
	public void getWeight(){
		System.out.println("水果重量");
	}
	
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Apple());
		list.add(new Orange());
		print(list);
		
		try {
			URL url = new URL("https://www.sojson.com/open/api/weather/json.shtml?city=成都");
			System.out.println("URL 为：" + url.toString());
			System.out.println("协议为：" + url.getProtocol());
			System.out.println("验证信息：" + url.getAuthority());
			System.out.println("文件名及请求参数：" + url.getFile());
			System.out.println("主机名：" + url.getHost());
			System.out.println("路径：" + url.getPath());
			System.out.println("端口：" + url.getPort());
			System.out.println("默认端口：" + url.getDefaultPort());
			System.out.println("请求参数：" + url.getQuery());
			System.out.println("定位位置：" + url.getRef());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//泛型在添加不同的子类时，用<? extend Father>
	public static void print(ArrayList<? extends Fruit> list){
		for (Fruit apple : list) {
			System.out.println(apple);
		}
	}
	
	@Test
	public void testName() throws Exception {
		ArrayList<Apple> list = new ArrayList<>();
		list.add(new Apple());
		list.add(new Apple());
		print(list);
	}
}
