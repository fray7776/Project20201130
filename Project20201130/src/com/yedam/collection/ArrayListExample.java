package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		//문자를 담아보자..
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); //특정위치에 값을 담으면 1번의 위치에 World가 있었으니 World가 3번째로 밀려난다.
		System.out.println("Size:"+list.size());
		list.add(list.size(), "last"); //제일 마지막 위치에 last를 추가하겠다..
		
		
//		for(String str  :list) {
//			System.out.println(str);
//		}
		
		list.remove(1); //collection은 null값이 없도록, 지우면 자리를 알아서 메꾼다..
		for(int i=0; i<list.size(); i++) {
			System.out.println("index:" + i +"," +list.get(i));
		}
		//숫자를 담아보자..
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(452);
		int sum = 0;
		for(Integer num : listNum) {
			sum += num;
		}
		System.out.println("listNum합계:" + sum);
	}

}
