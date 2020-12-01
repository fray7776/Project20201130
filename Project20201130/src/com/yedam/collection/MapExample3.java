package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "Song", "SONG", 1000));
		set.add(new Employee(102, "Hwang", "HWANG", 2000));
		set.add(new Employee(103, "Park", "PARK", 3000));
		set.add(new Employee(104, "Choi", "CHOI", 4000));

		Map<Integer, String> map = new HashMap<>();
		for (Employee emp : set) {
			map.put(emp.getEmployeeId(), emp.getEmail());

		}
		// 이름, salary의 map collection
		Map<String, Integer> map1 = new HashMap<>();
		for (Employee emp : set) {
			map.put(emp.getSalary(), emp.getLastName());

		}

	}
}