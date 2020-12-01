package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>(); // 순서가 없음, 중복된 값을 제외시킴
//		set.add("Hello");
//		set.add("World");
//		set.add("Welcome");
//
////		for (String str : set) {
////			System.out.println(str);
////		}
//
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) { //hasnext > 가져올 데이터가 있냐 물어보고 끄집어내는 함수
//			String str = iter.next();
//			System.out.println(str); //변수사용안하고 바로 styout(iter.next())해도 결과 같음
//		}
//		
//		Set<Integer> numbers = new HashSet<>();
//		numbers.add(13); //13이라는 숫자 하나만!! sum에 적용
//		numbers.add(13);
//		numbers.add(28);
//		numbers.add(31);
//		
//		numbers.remove(13); //Integer지우기
//		int sum = 0;
//		for(Integer i : numbers) {
//			sum +=i;
//		}
//		System.out.println("numbers: " + sum);
		
		Set<Integer> set =new HashSet<>();
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);
		set.add(30);
		set.add(35);
		set.add(40);
		set.add(20);
		set.add(25);
		
		int sum = 0;
		for(Integer i : set) {
			sum += i;
			
		}System.out.println(sum);
		
		

	}
	
}
