package com.yedam.interfaces;

interface MyfunctionalInterface {
	public void run(int radius);
}

interface Myfunctional {
	public void aa(int num1, int num2);
}

interface Myfun {
	public void bb(int num1, int num2);
}


public class InterfaceExample3 {
	public static void main(String[] args) {
		//1.화면출력(원의 넓이를 구하는.... 기능 구현)
		MyfunctionalInterface mf = (radius) -> {
			double result = Math.PI*radius*radius;
			System.out.println("원의 넓이는?? "+result);
		};
		mf.run(2);
		
		
				
		//2.화면출력(밑변으로 가지는 삼각형의 넓이 구하는 기능 구현)
		
		Myfunctional mt = (num1, num2) -> {
			int result = num1*num2/2;
			System.out.println("삼각형의 넓이는?? " + result);
		};
		mt.aa(3, 3);
		
		//3.화면출력(정사각형의 넓이를 구하는 기능 구현)
		Myfun mmf = (num1,num2) -> {
			int result = num1*num2;
			System.out.println("정사각형의 넓이는? "+result);
		};
		mmf.bb(5, 5);
	}
	

}
