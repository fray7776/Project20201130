package com.yedam.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".hashCode());
		
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add("Welcome");
		list.add("Welcome"); // String만 new String 안쓰고도 문자를 더할 수있음

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		for (String str : list) {
			System.out.println(str);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String str : set ) {
			System.out.println(str);
		}
		
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple",1000));
		fruits.add(new Fruit("Banana",500));
		fruits.add(new Fruit("Orange",500));
		fruits.add(new Fruit("Orange",500));
		
		Iterator<Fruit> fiter = fruits.iterator();
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName()+"-"+fruit.getPrice());
		}
	}

}
