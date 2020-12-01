package com.yedam.generic;
class Tv {
	
}
class Audio {
	
}
public class PairExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair  = new Pair<String, Integer>();
		pair.setKind("Hello");
		pair.setModel(111111);
		
		Pair<Tv,String> tv = new Pair<Tv,String>();
		tv.setKind(new Tv());
		tv.setModel("평면티비");
		
		Pair<Audio, String> audio = new Pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD30");
		
		System.out.println(pair.getKind()+","+pair.getModel());
	}

}
