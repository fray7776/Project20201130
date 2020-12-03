package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(100, "SONG");
		scores.put(80, "Park");
		scores.put(95, "Jang");
		scores.put(94, "YEO");
		scores.put(82, "SARA");
		scores.firstEntry();
		System.out.println("scores:첫번째" + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap(); // map처럼 크다작다의 순서를 가지고 있음
		System.out.println(navigableMap.firstEntry());
		NavigableSet<Integer> nSet = scores.descendingKeySet();
		System.out.println("scores:첫번째 키" + scores.firstKey());
		System.out.println("nSet:첫번째 키" + nSet.first());

		// {34,55,26,48,57} 오름차순 정렬 프로그램 만들기
		int[] intAry = { 34, 55, 26, 48, 77 };

		for (int i = 0; i < intAry.length; i++) {

		}
	}
}
