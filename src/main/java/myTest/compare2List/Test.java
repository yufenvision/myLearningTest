package myTest.compare2List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("2","小明",""));
		list1.add(new Person("2","小明分身",""));
		list1.add(new Person("3","小红",""));
		list1.add(new Person("4","小张",""));
		list1.add(new Person("4","小张分身",""));
		list1.add(new Person("4","小张分身2",""));
		list1.add(new Person("5","小黑",""));
		
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("3","小红",""));
		list2.add(new Person("6","小刘啊",""));
		list2.add(new Person("7","小小啊",""));
		list2.add(new Person("5","小黑",""));
		
		for (Person person : list2) {
			if(!list1.contains(person)){
				System.out.println(person);
			}
		}
		
		
		Collections.sort(list1, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
			
		});

		System.out.println(list1);
		int numEquals = 0;
		for (int i = 0; i < list1.size(); i++) {
			Person person = list1.get(i);
//			if(list1.get(i).getTotalPoints() == list1.get(i).getTotalPoints())
			person.setPhone(String.valueOf(i+1 - numEquals));
			if(i != 0){
				 if(list1.get(i-1).getId() == person.getId()){
					 numEquals++;
					 person.setPhone(list1.get(i-1).getPhone());
				 }
			}
		}
		
		System.out.println(list1);

	}
}
