package funtional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
//자바에서 이미 만들어놓은 인터페이스를 구현하는것! 그래서 인터페이스 안만들어도됨.

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = null;
		
		consumer =  t -> System.out.println("HiHi "+t);
				
		consumer.accept("Hello");
		consumer.accept("WHAT");
		System.out.println("=======================");
		BiConsumer<String, Integer> biCon = null;
		biCon =  (t,u) -> System.out.println("이름은?? " + t + "나이는?? " + u);
				
			
		biCon.accept("Hyewon", 29);
		//ObjIntConsumer는 매개값 + int 타입 받는것
		ObjIntConsumer<String> objIntCon= null;
		objIntCon = new ObjIntConsumer<String>() {

			@Override
			public void accept(String t, int value) {
				System.out.println("HeyHeyHey " + t + "너의 점수는?? "+value);
				
			}
			
		};
		objIntCon.accept("whywhy ", 10000);
		
	}

}
