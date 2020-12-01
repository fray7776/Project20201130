package com.yedam.collection;

import java.util.TreeSet;

public class MapExample4 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(89);
		
		System.out.println(tset.first());
		System.out.println(tset.last());
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("바보");
		tstr.add("야");
		tstr.add("와우");
		tstr.add("SONG");
		
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
		TreeSet<Student> tstu = new TreeSet<>();
		tstu.add(new Student(100,"SONG",80));
		tstu.add(new Student(101,"PARK",20));
		tstu.add(new Student(102,"JOE",100));
		
		System.out.println(tstu.first().getStudentNo()+","+tstu.first().getStudentName());
		System.out.println(tstu.last().getStudentNo()+","+tstu.last().getStudentName());
		
		
		
	}
	
}
