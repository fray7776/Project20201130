package com.yedam.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// treemap은 저장하는 순간 높은것과 낮은것을 구분 저장하기 때문에 출력시 내림차순이됨
//		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
//		scores.put(100, "SONG");
//		scores.put(80, "Park");
//		scores.put(95, "Jang");
//		scores.put(94, "YEO");
//		scores.put(82, "SARA");
//		Set<Integer> set = scores.keySet();
//		for (Integer num : scores.keySet()) {
//			System.out.println(num);
//		}
//		for (Map.Entry<Integer, String> ent : scores.entrySet()) {
//			System.out.println(ent.getKey() + ", " + ent.getValue());
//		}
//		Map.Entry<Integer, String> ent = scores.firstEntry();
//		ent.getKey();
//		ent.getValue();
//		ent = scores.lastEntry();
		
		TreeMap<Integer,String> scores1 = new TreeMap<Integer,String>();
		scores1.put(87, "홍길동");
		scores1.put(98, "이동수");
		scores1.put(75, "이나영");
		scores1.put(95, "신혜빈");
		scores1.put(88, "장나라");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores1.firstEntry();
		System.out.println("가장 낮은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores1.lastEntry();
		System.out.println("가장 높은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores1.lowerEntry(95);
		System.out.println("95점 아래인 점수들..: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores1.higherEntry(95);
		System.out.println("95점 위인 점수들..: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores1.floorEntry(95);
		System.out.println("95점 이거나 바로 아래 점수들..: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores1.ceilingEntry(85);
		System.out.println("85점 이거나 바로 위 점수들..: "+entry.getKey()+"-"+entry.getValue());
				
		while(!scores1.isEmpty()) {
			entry = scores1.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue()+"(남은 객체 수: " + scores1.size()+")");
		}

	}

}
