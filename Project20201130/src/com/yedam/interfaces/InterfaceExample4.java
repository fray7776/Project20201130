package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mi = null;
		// 매개값의 합
		mi = (num1, num2) ->  //변수는 인터페이스에 정의되 있는 변수를 안써도됨. a,b써도됨
			  num1 + num2;
	
		int result = mi.run(10, 20);
		
		mi = (num1,num2) -> num1* num2;
		result = mi.run(5, 20);
		
		//두개의 변수(직사각형의 가로,세로) -> 넓이를 구하는 기능을 구현.
		mi = (a,b) -> a*b;
		result = mi.run(6, 7);
		System.out.println("결과값: " + result);
		
		//람다식 표현 안쓴것!!
		mi = new MyInterface() {

			@Override
			public int run(int num1, int num2) {
				return num1*num2;
			}
			
		};
		mi.run(2, 2);
		
	}

}
