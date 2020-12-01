package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {
	
}
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //box의 타입이 example에서 String으로 정해져서 box의 타입도 string타입이됨.
		String str = box.get();
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		
		List<Integer> list = new ArrayList<>(); //지정한 타입 하나만 보고 싶을때, 앞에 타입을 선언했으면 뒤에 <>는 안써도됨.
		list.add(10);
		list.add(80);
		
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());

		
//		Box box = new Box();
//		box.set("Hello"); 
//		String str = (String) box.get(); //원래 object 타입으로 리턴되지만 string 타입으로 바꿀 수 있음
//	
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get();
//		
//		box.set(new Apple());
//		str = (String) box.get(); //할때마다 형태 변환, 문자는 문자열...
//		
//		System.out.println("end");
	}

}
