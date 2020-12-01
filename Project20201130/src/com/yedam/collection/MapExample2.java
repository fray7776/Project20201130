package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101,"송혜원"),88);
		map.put(new Student(102,"강나경"),87);
		map.put(new Student(103,"이사랑"),78);
		map.put(new Student(101,"송혜원"),90);
		map.put(new Student(104,"강나경"),90);
		
		//1.keySet()
		Set<Student> set = map.keySet();
		int sum = 0;
		int avg = 0;
		for(Student num : set) {
			sum += map.get(num);
			map.size();
			avg = sum/map.size();
			System.out.println(map.get(num));
		}
		
		System.out.println(avg);
		
//		Set<Student> set = map.keySet();
//		for(Student student : set) {
//			System.out.println("이름: " + student.getStudentName()+" 학번: "+student.getStudentNo()
//			+"점수: "+map.get(student));
//		}
		
//		System.out.println("평균: " +avg);
		
		//2.entrySet()
		
	}

}
