package funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionExample {
	public static List<Student> list = Arrays.asList // arrays.aslist를 써서 인스턴스를 선언하면 list에 담아준다.
	(new Student("Song", 90, 96), new Student("SAH", 80, 75));

	public static void printString(Function<Student, String> func) { // printstring이라는 함수를 적용하면 function
																		// 인터페이스를 매개값(student)으로 받겠다는..
		for (Student student : list) {
			System.out.println(func.apply(student));
		}

	}

	public static void main(String[] args) {
		Function<String, Integer> func = null;
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) { // 입력 :string 리턴: integer

				return t.length();
			}

		};
		System.out.println(func.apply("WHATTHEHELL"));
		BiFunction<String, String, Integer> biFunc = null;

		printString(t -> t.getName()); //기능!!! 이 기능을 매개값으로 받음

	}

}
