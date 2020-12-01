package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// map(key,value)로 구성됨
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hong", 15);
		map.put("Hong", 25);
		map.put("Hwang", 20);
		map.put("Hwang", 26);

		// value 가지고오기(get)
		Integer val = map.get("Hong");
		System.out.println(val);
		Set<Entry<String, Integer>> entrySet1 = map.entrySet();
		for(Entry<String, Integer> ent1 : entrySet1 ) {
			System.out.println("key: " + ent1.getKey()+", val " + ent1.getValue());
		}

		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "송혜원");
		mapInt.put(20, "이나영");
		mapInt.put(30, "이하나");
		String result = mapInt.get(10);
//		System.out.println(result);

		// key값이 변하지 않으니까 한꺼번에 출력하고 싶으면 key값을 넣어주고 value를 구한다.
		Set<Integer> set = mapInt.keySet();
		for (Integer num : set) {
//			System.out.println("key: " + num + ", val: " + mapInt.get(num));

		}
		Set<String> set1 = map.keySet();
		for (String val1 : set1) {
//			System.out.println("key: " + val1 + ", val: " + map.get(val1));
		}
		//entry(key, value)-중첩클래스
		Set<Entry<Integer,String>> entrySet = mapInt.entrySet();
		for(Entry<Integer,String> ent : entrySet ) {
//			System.out.println("key: " + ent.getKey()+", val" + ent.getValue());
		}
		
		
	}

}
