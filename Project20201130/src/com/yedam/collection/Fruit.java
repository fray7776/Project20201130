package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;
	public Fruit() {
		
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Object obj => Fruit 클래스로 Casting
//		Fruit fruit = (Fruit) obj;
//		return this.name.equals(fruit.name) && this.price == fruit.price;
//		return super.equals(obj);
//	}
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//		return this.name.hashCode() + this.price;
//	}
	@Override
	public boolean equals(Object obj) {
		Fruit fruit = (Fruit) obj;
		return this.name.length() == fruit.name.length() && this.price == fruit.price;
	}
	@Override
	public int hashCode() {
		return this.price; 
	}
	
	
	

}
