package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		persons.add(new Person("Park"));
		//값은 같지만 실제 인스턴스가 다르기 때문에 set을 써도 다 출력된다.
		
		Iterator<Person> iter= persons.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person);
			
		}
	}
	

}
