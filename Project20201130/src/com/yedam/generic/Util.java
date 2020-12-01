package com.yedam.generic;

public class Util {
	
	public static <T, M> boolean compare(Pair<T, M>p1, Pair<T, M>p2) {
		boolean k = p1.getKind().equals(p2.getKind());
		boolean m = p1.getModel().equals(p2.getModel());
		
		return k && m; //return에 따라 UtilExample의 결과값이 달라짐
	}
	
	public static <T> Box<T> boxing(T t) {//제네릭타입이지 아직 타입이 정해지지 않았음
		Box<T> box = new Box<T>();
		box.set(t);
		
		return box;
		
	}

}
