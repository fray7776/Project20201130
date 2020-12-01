package com.yedam.generic;

public class Box<T> { //메인메소드에 호출할때 타입을 정하겠다..실행되겠다는 의미 <T>,클래스 선언시점에 타입을 정하겠다..
	T obj; //object는 최상위 클래스라 어떤타입이든 다 담을 수 있음
	void set(T obj) {
		this.obj = obj; 
	}
	T get() {
		return obj;
	}

}
