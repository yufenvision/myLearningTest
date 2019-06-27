package java2new.java8optional.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月30日 下午8:32:54
* 类说明
*/
public class Lambda {
	public static void main(String[] args) {
		
//		foreach();
		System.out.println("================");
		foreachMap();
		System.out.println("================");
//		thread();
		System.out.println("================");
//		sort();
		System.out.println("================");
//		lambdaFilter();
		
	}
	
	public static void foreach(){
		String[] strArr = {"1","2","3","sdfs","快速度快","哈哈哈"};
		List<String> list = Arrays.asList(strArr);
		list.forEach(str -> System.out.println(str));
	}
	
	public static void foreachMap(){
		
		Map<String, String> map = new HashMap<String, String>(){{
			put("0", "一");
			put("1", "二");
			put("2", "三");
			put("3", "四");
		}};
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
	}
	
	
	public static void thread(){
		Thread thread = new Thread(() -> System.out.println("该线程的匿名runnable"));
		thread.start();
		
		Runnable run = () -> System.out.println("没有开新的线程");
		run.run();
	}
	
	public static void sort(){
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};
		
		// 1.1 使用匿名内部类根据 name 排序 players  
		Arrays.sort(players, new Comparator<String>() {  
		    @Override  
		    public int compare(String s1, String s2) {  
		        return (s1.compareTo(s2));  
		    }  
		});  
		
		System.out.println(Arrays.toString(players));
		
		Arrays.sort(players, (s1, s2) -> s2.compareTo(s1));
		System.out.println(Arrays.toString(players));
		
	}
	
	
	public static void lambdaFilter(){
		List<Person> javaProgrammers = new ArrayList<Person>() {  
		  {  
		    add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));  
		    add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));  
		    add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));  
		    add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));  
		    add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));  
		    add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));  
		    add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));  
		    add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));  
		    add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));  
		    add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));  
		  }  
		};  
			  
		List<Person> phpProgrammers = new ArrayList<Person>() {  
		  /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{  
		    add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));  
		    add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));  
		    add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));  
		    add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));  
		    add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));  
		    add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));  
		    add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));  
		    add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));  
		    add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));  
		    add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));  
		  }  
		};  
		
		System.out.println("给程序员加薪 5% :");  
		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());  
		
		javaProgrammers.forEach(giveRaise);  
		phpProgrammers.forEach(giveRaise);  
		
		
		System.out.println("下面是月薪超过 $1,400 的PHP程序员:");
		phpProgrammers.stream()  
		          .filter((p) -> (p.getSalary() > 1400))  
		          .forEach((p) -> System.out.printf("%s %s; -%s- ", p.getFirstName(), p.getLastName(), p.getSalary()));  
		System.out.println();
		
		// 定义 filters  
		Predicate<Person> ageFilter = (p) -> (p.getAge() > 24);  
		Predicate<Person> salaryFilter = (p) -> (p.getSalary() > 1400);  
		Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));  
		
		System.out.println("下面是年龄大于 24岁且月薪在$1,400以上的女PHP程序员:");  
		phpProgrammers.stream()  
		          .filter(ageFilter)  
		          .filter(salaryFilter)  
		          .filter(genderFilter)  
		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));  
		
		System.out.println();
		// 重用filters  
		System.out.println("年龄大于 24岁的女性 Java programmers:");  
		javaProgrammers.stream()  
		          .filter(ageFilter)  
		          .filter(genderFilter)  
		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));  
	}
	
}
