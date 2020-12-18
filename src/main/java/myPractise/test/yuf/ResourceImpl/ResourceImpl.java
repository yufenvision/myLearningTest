package myPractise.test.yuf.ResourceImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import myPractise.test.yuf.domain.MyResource;

import myPractise.test.yuf.annotation.TabResource;

//假设为Resource的业务层实现类
public class ResourceImpl {
	
	//创建一个包名和包下controller类的map
	private static Map<String,List<String>> modules = new HashMap<>();
	
	
	//1）、通过项目中controller包的全限定名，获取该包下所有类的全限定名（注解判断是否添加controller类，类别名）。
	public static void loadPackage(String[] packages) throws ClassNotFoundException{
		for (String string : packages) {
			URL url = Thread.currentThread().getContextClassLoader().getResource(string.replace(".", "/"));
			File file = new File(url.getFile());
			String[] classNames = file.list();
			List<String> ControllerNames = new ArrayList<>();
			for (String string2 : classNames) {
				String allName = string+"."+string2.substring(0, string2.length()-6);
				//判断controller类是否有注解
				boolean isAnnotation = Class.forName(allName).isAnnotationPresent(TabResource.class);
				if(isAnnotation){
					ControllerNames.add(allName);
				}
			}
			modules.put(string, ControllerNames);
		}
	}
	
	//2）、根据controller类的全限定名，获取该包下所有方法名（注解判断是否添加该方法，方法别名），然后持久化resource对象。
	public static List<MyResource> importController(String module) throws ClassNotFoundException{
		List<MyResource> resources = new ArrayList<>();
		Class<?> clz = Class.forName(module);
		//获取类别名
		TabResource ctab = clz.getAnnotation(TabResource.class);
		String controllerAlias = "".equals(ctab.value())?clz.getName():ctab.value();
		
		Method[] methods = clz.getDeclaredMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(TabResource.class)){
				//获取方法别名
				TabResource tab = method.getAnnotation(TabResource.class);
				String methodAlias = controllerAlias+":"+!"".equals(tab.value()) != null?tab.value():method.getName();
				String methodName = module+":"+method.getName();
				
				//模拟数据库持久化操作.....
				MyResource resource = new MyResource();
				resource.setController(module);
				resource.setName(methodAlias);
				resource.setUrl(methodName);
				resources.add(resource);
			}
		}
		return resources;
	}
	
	public static Map<String,List<String>> getModules(){
		return modules;
	}
	
	//测试
	public static void main(String[] args) throws ClassNotFoundException {
		String[] packages = {"myPractise.test.yuf.controller"};
		loadPackage(packages);
		Map<String,List<String>> modules = getModules();
		System.out.println(modules);
		for (String string : modules.keySet()) {
			List<String> controllers = modules.get(string);
			for (String string2 : controllers) {
				System.out.println(importController(string2));
			}
		}

	}
	
	
	
	
}
